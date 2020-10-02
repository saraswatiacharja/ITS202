class Node{
	int data;
	Node next;

	public Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class stacklinklist{
	
	Node head; 
	int size;
	public stacklinklist(){
		Node head = null; 
		int size = 0;;	
	}

	public void push(int data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		System.out.println(data);

		size += 1;
	}
	public boolean isEmpty(){
		if(head == null){
			return true;
		}
		else{
			return false;
			
		}
		
	}
	public int size(){
		return size;
	}
	public int top(){
		if (head == null) {
			System.out.println("The stack is empty");
		}
		return head.data;
	}
	public void pop(){
		Node tem = head;
		this.head = this.head.next;
		System.out.println("The pop data is ="+tem.data);

		size -= 1;
	}
	public static void main(String[] args) {
		stacklinklist k =new stacklinklist();
  		k.push(2);
  		k.push(4);
  		k.push(6);
  		System.out.println("The stack is empty ="+k.isEmpty());
  		System.out.println("The size is = "+k.size());
  		System.out.println("The top is = "+k.top());
  		k.pop();
  		System.out.println("The size is = "+k.size());

  		assert(k.isEmpty() == false);
    	assert(k.size() == 2);
    	assert(k.top() == 2);
    	System.out.println("All the functions are working");

	}
}
