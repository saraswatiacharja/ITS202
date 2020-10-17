import java.util.*;

public class Mergesort
{
  public static void main(String args[])
  {
    int i, x;
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    x = obj.nextInt();
    int a[] = new int[x];

    System.out.println("Enter elements of the array: ");
    for(i=0; i<x; i++)
      a[i] = obj.nextInt();

    MyMergeSort.sort_unorthodox(a);
    System.out.print("\nThe sorted array are: ");
    System.out.println(Arrays.toString(a));
  }
} 

class MyMergeSort
{
  public static void sort_unorthodox(int a[])
  {
    int sorted_a[] = divide(a);
    for(int i = 0; i < a.length; i++) 
      a[i] = sorted_a[i];
  }

  static int[] divide(int a[])
  {
    if(a.length <= 1) 
      return a;

    int i, left_size = a.length/2, right_size;
    if(a.length % 2 == 0)
      right_size = left_size;
    else
      right_size = left_size + 1;
    int left_half[] = new int[left_size];
    int right_half[] = new int[right_size];

    for(i=0; i<left_size; i++)
      left_half[i] = a[i];
    for(i=0; i<right_size; i++)
      right_half[i] = a[left_size+i];

    left_half = divide(left_half);
    right_half = divide(right_half);
    return merge(left_half, right_half);
  }

  static int[ ] merge(int a[ ], int b[ ])
  {
    int i=0, j=0, k=0, r = a.length, s = b.length;
    int p[ ];
    p = new int[r+s];

    while(i<r && j<s)
    {
      if(a[i] < b[j])
        p[k++] = a[i++];
      else
        p[k++] = b[j++];
    }
    while(i<r)
      p[k++] = a[i++];
    while(j<s)  
      p[k++] = b[j++];
    return p;
  }
} 
  