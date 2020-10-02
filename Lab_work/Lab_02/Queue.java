public class Queue{
	int[] arr;
	int rear;
	int len;
	int front;
	int first;

	public Queue(int x){
		len = 0;
		rear = -1;
		front = -1;
		first = -1;
		arr = new int[x];
	}
	public boolean isEmpty(){
		if (len == 0) {
			return true;	
		}
		return false;

	}

	public int len(){
		return len;
	}

	public int first(){
		if (isEmpty()) {
			return 0;	
		}
		else
		{
			return arr[front];
		}
	}
	public void enqueue(int x){
		if (isEmpty()) {
			arr[0] = x;
			front = 0;
			rear = 0;
			first = arr[0];
		}
		else
		{
			arr[rear + 1] = x;
			rear = rear + 1;
		}
		len = len + 1;
	}
	public int dequeue(){
		if (isEmpty()) {
			return 0;
		}
		else
		{
			front = front + 1; 
		}
		len = len - 1;
		return arr[front-1];
	}
	public static void main(String[] args) {		
        Queue s = new Queue(8);
        s.enqueue(10);
        s.enqueue(20);
        s.enqueue(30);
        s.enqueue(40);
    
        
        assert(s.len()==4);

        assert(s.isEmpty()==false);
        assert(s.first()==10);
        assert(s.dequeue()==10);

        assert(s.len()==3);


        // System.out.println(s.isEmpty());
        // System.out.println(s.len());
        // System.out.println(s.first());
        // System.out.println(s.dequeue());
        // System.out.println(s.len());        

		
        System.out.println("All test cases passed");	
	}
}

