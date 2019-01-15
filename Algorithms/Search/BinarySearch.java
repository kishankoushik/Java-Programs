import java.util.Scanner;

public class BinarySearch {

	public int binarySearch(int arr[], int target, int length)
	{
		int low=0;
		int high=length-1;
		
		while(high >= low) {
			             int middle = (low + high) / 2;
			             // target value is equal to middle 
			            if(arr[middle] == target) {
			                return middle;
			            }// target would be in the right half
			             if(arr[middle] < target) {
			                 low = middle + 1;
			            }// target would be in the left half
			            if(arr[middle] > target) {
			                 high = middle - 1;
			             }
			       }
			    return -1;
	
	}
 	
 	public static void main (String args[]) {
 		
 		int arr[]= {1,2,3,4,5};
 		int length=arr.length;
 		System.out.println(" Enter the elment to perform Binary search");
 		Scanner in =new Scanner(System.in);
 		// Reading the target element from the console
 		int target =in.nextInt();
 		BinarySearch obj=new BinarySearch();
 		int result = obj.binarySearch(arr,target,length);
 		if(result!=-1){
	 		System.out.println("The element found at binary search index "+result);
	 	}
 		else if(result == -1) {
 			System.out.println("The element not found");
 		}
 		
 		
 	}

}


