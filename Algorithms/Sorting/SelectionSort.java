
public class SelectionSort {

	public void selectionSort(int arr[],int length) {
		//One by one move boundary of unsorted subarray
		for (int i = 0; i < length - 1; i++)  
		{  
			// Find the minimum element in unsorted array
			int index = i;  
			for (int j = i + 1; j < length; j++){  
				if (arr[j] < arr[index]){  
					index = j;//searching for lowest index  
				}  
			}  
			// Swap the found minimum element with the first element
			int smallerNumber = arr[index];   
			arr[index] = arr[i];  
			arr[i] = smallerNumber;
		}

	}

	public void printArray(int arr[],int length) {
		// print the sorted array
		System.out.println("Sorted Array after Selection sort");
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main (String args[]) {

		int arr[]= {46, 52, 21, 22, 11};
		int length=arr.length;

		SelectionSort obj=new SelectionSort();
		obj.selectionSort(arr,length);
		obj.printArray(arr, length);

	}
}
