public class Arraylist
{
	double one_fourth = 0.25;
	double three_fourth = 0.75;
	int Asize = 4;
	static int a;
	int remove;
	int top = 0;
	static double length;
	static int Array[];
	public Arraylist()
	{
		Array = new int[Asize];
	}
	public void add(int e)
	{
		Array[top] = e;
		top++;
	}
	public void pop()
	{
		top--;
		remove = Array[top];
		Array[top] = 0;
		int count = 0;
		for(int x = 0; x < Array[x]; x++) {
			count++;
		}
		a = count;
		length = (double)a/Asize;
		System.out.println("The Remove Element Is " +remove);
	}
	
	public void resize()
	{
		if(length == one_fourth ) {
			int newArray[] = new int[Asize/2];
			for(int x = 0; x < Array.length/2; x++) {
				newArray[x] = Array[x];
			}
			Array = newArray;
			Asize = Asize/2;
			for(int n : newArray) {
				System.out.print(n + " ");
				}	
		}
		else if(length == three_fourth) {
			int newArray[] = new int[Asize*2];
			for(int x = 0; x < Array.length; x++) {
				newArray[x] = Array[x];
			}
			Asize = Asize * 2;
			Array = newArray;
			for(int y : newArray) {
			System.out.print(y + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("ArrayIndexOutOfBoundRange");
		}
	}
	public int size()
	{
		return Asize;
	}
	public String toString()
	{
		String st = Integer.toString(Asize);
		return st;
	}

	public static void main(String[] args) {
		Arraylist obj = new Arraylist();
		obj.add(5);
		obj.add(8);
		//obj.add(4);
		//obj.add(5);
		//obj.add(3);
		//obj.add(7);
		obj.pop();
		//obj.pop();
		obj.resize();
		assert(obj.size() == 2);
		//System.out.println("toString " +obj.toString());
		//System.out.println("The number of elements in the new Array is " +a);
		//System.out.println("The Size of new Array is " +obj.size());
		System.out.println("\nAll Testcase are passed");
	}
}