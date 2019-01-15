

public class BubbleSort {
	
	public void bubbleSort(int arr[],int length) {
		
		int temp;
		/*Bubble Sort compares all the element one by 
		one and sort them based on their values.*/
		for (int i=0 ; i<length ;i++) {
			for(int j=0 ;j<length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					//Swap the elements
					 temp = arr[j];
		             arr[j] = arr[j+1];
		             arr[j+1] = temp;
				}
			}
		}
		
		// print the sorted array
		System.out.println("Sorted Array after Bubble sort");
		
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main (String args[]) {
		
		int arr[]= {81,25,34,45,15};
 		int length=arr.length;
 		
 		BubbleSort obj=new BubbleSort();
 		obj.bubbleSort(arr,length);
 		
}
	
}
