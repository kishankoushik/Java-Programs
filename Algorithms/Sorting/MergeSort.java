
public class MergeSort {
	public static void merge(
			  int[] a, int[] l, int[] r, int left, int right) {
			  
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			        if (l[i] <= r[j]) {
			            a[k++] = l[i++];
			        }
			        else {
			            a[k++] = r[j++];
			        }
			    }
			    while (i < left) {
			        a[k++] = l[i++];
			    }
			    while (j < right) {
			        a[k++] = r[j++];
			    }
			}
	
	public  void mergeSort(int[] a, int n) {
		
		//Merge Sort follows the rule of Divide and Conquer to sort
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];
	 
	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mergeSort(l, mid);
	    mergeSort(r, n - mid);
	 
	    merge(a, l, r, mid, n - mid);
	}
	
	public void printArray(int arr[],int length) {
		// print the sorted array
		System.out.println("Sorted Array after MergeSort ");
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main (String args[]) {

		int arr[]= {32, 45, 67, 2, 7};
		int length=arr.length;

		MergeSort obj=new MergeSort();
		obj.mergeSort(arr,length);
		obj.printArray(arr, length);

	}
}
