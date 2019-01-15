import java.util.Scanner;

public class LinearSearch {
	
 	public int linearSearch(int arr[], int target, int length)
	{
	    for(int i = 0; i < length; i++)
	    {
	    	//comparing the target value with the current value read from the array
	        if (arr[i] == target) 
	        {       
	            return i; 
	        }
	    }
	    return -1;
	}
 	
 	public static void main (String args[]) {
 		
 		int arr[]= {4,6,2,8,1,9,3,7};
 		int length=arr.length;
 		System.out.println(" Enter the elment to perform linear search");
 		Scanner in =new Scanner(System.in);
 		// Reading the target element from the console 
 		int target =in.nextInt();
 		LinearSearch obj=new LinearSearch();
 		int result = obj.linearSearch(arr,target,length);
 		if(result!=-1){
	 		System.out.println("The element found at index "+result);
	 	}
 		else {
 			System.out.println("The element not found");
 		}
 		
 	}


}

