public class BinarySearch{
	public static int BinarySearch(int array[],int x, int y,int z) {
		if(y>=x)
			{
				int mid=x+(y-x)/2;

				if(array[mid]==z)
				{
					return mid;
				}
				else if(array[mid]>z)
				{
					return BinarySearch(array,x,y-1,z);

				}
				else{
					return BinarySearch(array,x,y+1,z);
				}
			}
			return -1;
	}
	public static void main(String[] args) {
		
		BinarySearch obj=new BinarySearch();
		int array[]={1,2,3,4,5,6};
		int z=5;
		int N=array.length;
		int show=obj.BinarySearch(array,0,N-1,z);
		if (show==-1){
			System.out.println("Search element is not found");
		}
		else{
			System.out.println("Search element is found");
		}
	}
}
