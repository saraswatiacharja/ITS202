public class lab1{
	//declaring variable, where max is the size of the array
	int max = 10;
	//initial the size and top will be zero
	int top = -1;
	int size = 0;
	//creating array named array with the size 10 which is max
	int [] array = new int[max];

	//Allow to push element inside array
	public void push(int e){
		if(size==0){
			array[0] = e;
			top = 0;
		}
		else{
			array[top+1] = e;
			top = top+1;
		}
		size = size+1;
		System.out.println(e);
	//remove element from top of array
	}
	public int pop(){
		if (size == 0){
			System.out.println("Stack is already empty:");
		}
		else{
			top = top - 1;
			size = size - 1;
		}
		return array[top + 1];
	}
	//returning top of element in the stack
	public int top(){
		return array[top];
	}
	//returning the size of the array
	public int size(){
		return size;
	}
	// checking wheather stack is empty or not
	public boolean isEmpty(){
		if (size()==0){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		lab1 obj = new lab1();
		obj.push(90);
		obj.push(50);
		obj.push(30);

		System.out.println("Poped or removed array is: "+obj.pop());
		System.out.println("Top array is:"+obj.top());
		System.out.println("Size of the Array:"+obj.size());
		System.out.println(obj.isEmpty());
	}
}





