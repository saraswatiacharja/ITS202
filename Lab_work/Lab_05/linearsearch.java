public class linearsearch
{
	public static int linearSearch(int[] arr, int key)
	{  
	    for(int i=0;i<arr.length;i++)
	    {    
	        if(arr[i] == key){    
	            return i;
	            }
	        }

	        return -1;
	        }    
		    public static void main (String [] args){    
		        int[] value= {5,10,50,20,55};    
		        int key = 20; 
		        int display= linearSearch(value,key);

		        if(display == -1){  
		        	System.out.println(key+" is not in the array list "); 
		        	
		        }
		        else{
		        	System.out.println(key+" is found at index: "+linearSearch(value, key)); 
		        }
		    }
		}

