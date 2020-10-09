import java.util.*;
public class insertion
{
	public static void main(String[] args)
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array: ");  
		int size = sc.nextInt();
		
		int array[] = new int [size];
		System.out.println("Enter the element of array:");
		
		for (int i =0; i<size; i++)
		{
			
			array[i] = sc.nextInt();
		}
		System.out.println("The unsorted array are:");
		for(int b=0;b<array.length;b++){
			System.out.print(array[b] + " ");
		}
		int i,j,n;

		for(i=1;i<size;i++)
		{
			n=array[i];
			j=i-1;
			while(j>=0 && array[j]>n)
			{
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=n;
		}
		System.out.println("\nThe sorted array are:");
		for (int p=0;p<array.length;p++)
		{
			System.out.print(array[p] + " ");
		}
		System.out.println();
	}
}