public class lds{
	public static void main(String args [])
	{
		System.out.println("----Implement Key-indexed counting algorithm-----");

		int w=5;
		String a[] = {"sonam","tashi","dorji","saras"};
		int N=a.length;
		int R=256;
		String aux[]= new String[N];
				
		for(int d=w-1;d>=0;d--)
		{
		//sort by key-indexed counting on the i'th char.
		int count[] = new int[R+1];

		//compute frequency counts.
		for (int i=0;i<N;i++)
			count[a[i].charAt(d)+1]++;
		for (int r=0;r<R;r++)
					
					
		//Transform counts to indices
			count[r+1] +=count[r];
		for (int i=0;i<N;i++)
						
		//Distribute
			aux[count[a[i].charAt(d)]++]=a[i];
		for(int i=0;i<N;i++)
						
		//Copy back
			a[i] = aux[i];
		}

		for (int i=0;i<N;i++){
			System.out.println(" "  +a[i] );
		}
	}
}
	





