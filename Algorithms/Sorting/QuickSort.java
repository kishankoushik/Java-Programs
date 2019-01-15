
public class QuickSort {

	private int partition(int arr[], int begin, int end) {
	    int pivot = arr[end];
	    int i = (begin-1);
	 
	    for (int j = begin; j < end; j++) {
	        if (arr[j] <= pivot) {
	            i++;
	 
	            int swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }
	 
	    int swapTemp = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = swapTemp;
	 
	    return i+1;
	}
	public void quickSort(int arr[], int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(arr, begin, end);
	 
	        quickSort(arr, begin, partitionIndex-1);
	        quickSort(arr, partitionIndex+1, end);
	    }
	}
	
	public void printArray(int arr[],int length) {
		// print the sorted array
		System.out.println("Sorted Array after Quick sort");
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main (String args[]) {

		int arr[]= {10, 7, 8, 9, 1, 5};
		int length=arr.length;

		QuickSort obj=new QuickSort();
		obj.quickSort(arr,0,length-1);
		obj.printArray(arr, length);

	}
}
