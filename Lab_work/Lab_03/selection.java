import java.util.*;
public class selection
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
			int a = sc.nextInt();
			array[i] = a;
		}
		System.out.println("The unsorted array are:");
		for(int b=0;b<size;b++){
			System.out.print(array[b] + " ");
		}
		for(int i=0;i<size;i++){
			for(int k=i+1;k<size;k++)
				if (array[i]>array[k])
				{
					int temp =array[i];
					array[i]=array[k];
					array[k]=temp;
				}
			}
			System.out.println("\nThe sorted array are:");
			for(int i=0;i<size;i++){
				System.out.print(array[i]+" ");
			}
			System.out.println();
	}
}
