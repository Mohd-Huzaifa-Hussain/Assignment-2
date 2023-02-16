//2. WAP to sort an array using Quick Sort Algorithm.
public class QuickSort2 {
	
	public static int partition(int[] a, int low, int high) {
		int pivot = a[high];
		int i = low - 1;
		
		for(int j=low; j<high; j++) {
			if(a[j]<pivot) {
				i++;
				
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		i++;
		
		int temp = a[i];
		a[i] = pivot;
		a[high] = temp;
		return i;
		}

	public static void quickSort(int[] a, int low, int high) {
		
		if(low<high) {
			int pivot = partition(a, low, high);
			
			quickSort(a, low, pivot-1);
			quickSort(a, pivot+1, high);
			
			
		}
	}

	

	public static void main(String[] args) {
		
		int a[] = {10,20,15,9,3};
		
		int n = a.length;
		
		quickSort(a, 0, n-1);
		
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		

	}

}
