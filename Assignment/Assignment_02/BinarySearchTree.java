import java.util.*;
public class BinarySearchTree<Key extends Comparable<Key>, Value> {
     
     Node root;  // root of BST
     int nodeCount;          
        class Node {
        Key key;           // sorted by key
        Value val;         // associated data
        Node left, right;  // left and right subtrees
        int size;          // number of nodes in subtree

        public Node(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;
            left=null;
            right = null;
        }
    }

    /**
     * Initializes an empty symbol table.
     */
    public BinarySearchTree() {
        root=null;

    }

    /**
     * Returns true if this symbol table is empty.
     * @return {@code true} if this symbol table is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        if(root==null)
        {
            return true;
        }
        return false;
    }

    /**
     * Returns the number of key-value pairs in this symbol table.
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
      return root.size;
    }
    public int size(Node x){
        if(x==null)
            return 0;
        else 
            return x.size;
    }

    // return number of key-value pairs in BST rooted at x

    /**
     * Does this symbol table contain the given key?
     *
     * @param  key the key
     * @return {@code true} if this symbol table contains {@code key} and
     *         {@code false} otherwise
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    //public boolean contains(Key key) {
    //}
    /**
     * Returns the value associated with the given key.
     *
     * @param  key the key
     * @return the value associated with the given key if the key is in the symbol table
     *         and {@code null} if the key is not in the symbol table
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Value get(Key key) {
        Node x=root;
        if(key==null){
            throw new IllegalArgumentException("Key cannot be null");
        }
        while(x.key!=key){
            int cmp = key.compareTo(x.key);
            if(cmp<0){
                x=x.left;
            }
            else if(cmp>0){
                x=x.right;
            }
            if (x.key==key){
                return x.val;
            }
        }
        return x.val;
    }
    /**
     * Inserts the specified key-value pair into the symbol table, overwriting the old 
     * value with the new value if the symbol table already contains the specified key.
     * Deletes the specified key (and its associated value) from this symbol table
     * if the specified value is {@code null}.
     *
     * @param  key the key
     * @param  val the value
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void put(Key key, Value val) {
        if(key ==null){
            throw new IllegalArgumentException("key cannot be null");
        }
        else{
            Node newest = new Node(key,val,1);
            if(root==null){
                root=newest;
            } 
            else{
                Node x=root;
                Node parent;
                while(x!=null){
                    parent=x;
                    int cmp =key.compareTo(x.key);
                    if(cmp<0){
                        x=x.left;
                        if(x==null){
                            parent.left=newest;
                            root.size++;
                            return;
                        }
                        else if(x.key==key){
                            x.val=val;
                            return;
                        }
                    }
                    else if(cmp>0){
                        x=x.right;
                        if(x==null){
                            parent.right=newest;
                            root.size++;
                            return;
                        }
                        else if(x.key==key){
                            x.val=val;
                            return;
                        }
                    }
                }
            }
        }  
    }

    // private Node put(Node x, Key key, Value val) {
        
    // }

    /**
     * Returns the smallest key in the symbol table.
     *
     * @return the smallest key in the symbol table
     * @throws NoSuchElementException if the symbol table is empty
     */
    public Key min() {
        Node x=root;
        for(x=root;x.left!=null;x=x.left){
            if(x==null) throw new NoSuchElementException("The symbol table is empty");
        }
        return x.key;
    } 
    /**
     * Returns the largest key in the symbol table less than or equal to {@code key}.
     *
     * @param  key the key
     * @return the largest key in the symbol table less than or equal to {@code key}
     * @throws NoSuchElementException if there is no such key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Key floor(Key key) {
        Node x=getNode(root, key);
        Node cmp=x;
        if(key==null){
            throw new IllegalArgumentException("key cannot be null");
        }
        else if(size()==0){
            throw new NoSuchElementException("There is no such key");
        }
        if(x==null){
            return null;
        }
        if(x.left!=null){
            cmp=x.left;

            while(cmp.right!=null){
                cmp=cmp.right;
            }
        }
        return cmp.key;
    } 
        public Node getNode(Node x, Key key){
        Node node=null;
        if(key==null){
            throw new IllegalArgumentException("key cannot be null");
        }
        while(x!=null){
            int cmp=key.compareTo(x.key);
            if(cmp==0){
                return x;
            }
            if(cmp>0){
                node=x;
                x=x.right;
            }
            else{
                x=x.left;
            }
        }
        return node;
    }

    // private Node floor(Node x, Key key) {
    //     return null;
       
    // } 
    /**
     * Return the key in the symbol table whose rank is {@code k}.
     * This is the (k+1)st smallest key in the symbol table.
     *
     * @param  k the order statistic
     * @return the key in the symbol table of rank {@code k}
     * @throws IllegalArgumentException unless {@code k} is between 0 and
     *        <em>n</em>–1
     */
    public Key select(int k) {
        nodeCount=0;
        if((k<0)||k>=size()){
            throw new IllegalArgumentException("Rank isnt between 0 and its size");
        }
        return select(root, k+1).key;
    }

    // Return key of rank k. 
    private Node select(Node x, int k) {
        Stack<Node>stack=new Stack<Node>();
        Node cur=root;
        while(!stack.empty()||cur!=null)
        {
            if(cur!=null)
            {
                stack.push(cur);
                cur=cur.left;
            }
            else
            {
                cur=stack.pop();
                nodeCount++;
                if(nodeCount==k)
                    break;
                cur=cur.right;
            }
        }
        return cur;
    } 
    /**
     * Returns all keys in the symbol table in the given range,
     * as an {@code Iterable}.
     *
     * @param  lo minimum endpoint
     * @param  hi maximum endpoint
     * @return all keys in the symbol table between {@code lo} 
     *         (inclusive) and {@code hi} (inclusive)
     * @throws IllegalArgumentException if either {@code lo} or {@code hi}
     *         is {@code null}
     */
    public Iterable<Key> keys(Key lo, Key hi) {
        if (lo == null || hi == null) {
            throw new IllegalArgumentException("Argument is null!!!");
        }
        Queue<Key> queue_list = new LinkedList<Key>();
        keys(root, queue_list, lo, hi);
        return queue_list;
    }

    private void keys(Node x,Queue<Key> queue_list, Key lo, Key hi) { 
        if (x == null) {
            return;
        }
        Node n1 = x;
        while (n1 != null){
            int cmp = n1.key.compareTo(hi);
            int temp = n1.key.compareTo(lo);

            if (n1.left == null) {
                if (cmp <= 0 && temp >= 0) queue_list.offer(n1.key);
                n1 = n1.right;
            }
            else {
                Node n2 = n1.left;
                while (n2.right != null && n2.right != n1)
                    n2= n2.right;
                if(n2.right==null){
                    n2.right=n1;
                    n1=n1.left;
                }
                else{
                    n2.right=null;
                        if(cmp<=0 && temp>=0) queue_list.offer(n1.key);
                        n1=n1.right;
                    }
                }
            }
    }    
    /* Run the program by giving the approriate command obtained from
    input files through input.txt files. The output should be displayed
    exactly like the file output.txt shows it to be.*/
    public static void main(String[] args) { 
        BinarySearchTree<String, Integer>obj=new BinarySearchTree<String, Integer>();
        obj.put("ABDUL",1);
        System.out.println(obj.get("ABDUL"));
        obj.put("HRITHIK",2);
        obj.put("SAI",3);
        obj.put("SAMAL",6);
        System.out.println(obj.get("SAI"));
        obj.put("TASHI",4);

        System.out.println("Size: "+obj.size());
        System.out.println("Min:"+obj.min());
        System.out.println(obj.floor("HRITHIK"));
        System.out.println(obj.floor("HAHA"));
        System.out.println(obj.select(2));
        System.out.println(obj.keys("ABDUL","TASHI"));
        obj.put("CHIMI",5);
        obj.put("SAMAL",4);
        System.out.println(obj.get("SAMAL"));
        obj.put("NIMA",7);
        System.out.println(obj.size());
        System.out.println(obj.get("CHIMI"));
        System.out.println(obj.floor("CHIMA"));
        obj.put("SONAM",8);
        System.out.println(obj.keys("ABDUL","TASHI"));
    }
}