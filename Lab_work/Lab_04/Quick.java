public class Quick
{ 
    int partition(int array[], int low, int high) 
    { 
        int pivot = array[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
            if (array[j] < pivot) 
            { 
                i++; 
                int temp = array[i]; 
                array[i] = array[j]; 
                array[j] = temp; 
            } 
        } 
        int temp = array[i+1]; 
        array[i+1] = array[high]; 
        array[high] = temp; 
  
        return i+1; 
    } 
  
    void sort(int array[], int low, int high) 
    { 
        if (low < high) 
        { 
            int p = partition(array, low, high); 
            sort(array, low, p-1); 
            sort(array, p+1, high); 
        } 
    } 
    static void printArray(int array[]) 
    { 
        int n = array.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(array[i]+" "); 
        System.out.println(); 
    } 
    public static void main(String args[]) 
    { 
        int array[] = {11, 6, 7, 9, 1, 4}; 
        int n = array.length; 
  
        Quick obj = new Quick(); 
        obj.sort(array, 0, n-1); 
  
        System.out.println("The sorted array"); 
        printArray(array); 
    } 
} 
