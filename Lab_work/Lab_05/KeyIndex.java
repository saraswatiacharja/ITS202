public class KeyIndex{
	public static void main(String args []){
		System.out.println("----Implement Key-indexed counting algorithm-----");
		char a []={'b', 'c', 'a','d','d'};
		int N = a.length;
		int R = 256;
		char aux [] = new char[N];
		int count [] = new int[R+1];

		//compute frequency counts
		for (int i=0;i<N;i++)
			count [a[i]+1]++;

		//Transform counts to indices
		for (int r=0;r<R;r++)
			count [r+1]+=count[r];
		//Distribute
		for(int i=0;i<N;i++)
			aux[count[a[i]]++]=a[i];
		//copy back
		for(int i=0;i<N;i++)
			a[i] = aux[i];

		for (int i=0;i<N;i++)
		{
			System.out.print(" "  +a[i] );
		}
	}
}
