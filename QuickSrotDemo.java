public class QuickSortDemo{
	
	public static void main(String[] args) {
		int arr[]= {4,3,2,5,6,7,4};
		int i=0;
		int j=arr.length-1;
		int[] answ=quickSort(arr, i, j);
		for(int val:answ){
			System.out.print(val+" ");
		}
	}


	static int[] quickSort(int[] arr, int start, int end){
		if(start<end){
			int p=partition(arr, start, end);
			quickSort(arr, start, p-1);
			quickSort(arr, p+1, end);	
		}
		
		return arr;
	}

	static int partition(int[] arr, int start, int end){
		int pivot=arr[end];
		int i=start;
		int j=i-1;
		for(;i<end-1;i++){
			if(arr[i]<pivot){
				int temp=arr[++j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		int temp=arr[++j];
		arr[j]=pivot;
		arr[end]=temp;

		return j;
	}

}
