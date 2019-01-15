public class InsertionSort {

	public void insertionSort(int arr[],int length) {
		 int n = length;  
		 for (int i=1; i<n; ++i) 
	        { 
	            int key = arr[i]; 
	            int j = i-1; 
	  
	            /* Move elements of arr[0..i-1], that are 
	               greater than key, to one position ahead 
	               of their current position */
	            while (j>=0 && arr[j] > key) 
	            { 
	                arr[j+1] = arr[j]; 
	                j = j-1; 
	            } 
	            arr[j+1] = key; 
	        } 

	}

	public void printArray(int arr[],int length) {
		// print the sorted array
		System.out.println("Sorted Array after Insertion sort");
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main (String args[]) {

		int arr[]= {46, 52, 21, 22, 11};
		int length=arr.length;

		InsertionSort obj=new InsertionSort();
		obj.insertionSort(arr,length);
		obj.printArray(arr, length);

	}
}
