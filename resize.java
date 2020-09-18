public class resize
{
	public static int [] resize (int n, int [] array)
	{
		int [] temp = new int [n];
		for (int i=0;i<array.length;i++)
		{
			temp[i]=array[i];
		}
		temp [n-1]=4;
		return temp;
	}
	public static void main (String args[])
	{
		int [] array={1,2,3};
		int [] value= resize(4,array);
		for (int i=0; i<value.length;i++)
		{
			System.out.println(value[i]);
		}
	}
}