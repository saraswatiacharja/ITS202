import java.util.*;
public class bubble{
	public static void main(String[] args) {
		//object created 
		bubble obj1 = new bubble();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");  
		int size = sc.nextInt();
		
		int array[] = new int [size];
		System.out.println("Enter the element of array : ");
		for (int i =0; i<size; i++)
		{	
			int a = sc.nextInt();
			array[i] = a;
		}
		System.out.println("The unsorted array are:");
		for(int b : array){
			System.out.print(b + " ");
		}
		obj1.SortArray(array);
		obj1.show(array);
	}
	public void SortArray(int array[]){
		int n = array.length;
		for(int i = 0; i < n; i++){
			for(int j = 1; j < n; j++){
				if(array[j] < array[j - 1]){
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
	}
	public void show(int array[]){
		//sorted array print out
		int n = array.length;
		System.out.println("\nThe sorted array are : ");
		for(int i : array){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}