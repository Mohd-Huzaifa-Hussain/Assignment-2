//5. WAP to sort an array using Selection Sort Algorithm.
public class SelectionSort5 {

	public static void main(String[] args) {
		 
		int arr[] = {7, 8, 1, 3, 2};

			for(int i=0; i<arr.length-1; i++) {
			
				int smallest = i;
			
				for(int j=i+1; j<arr.length; j++) {
				
					if(arr[j] < arr[smallest]) {
					
						smallest = j;
				
					}
				
				}
		           
			
				int temp = arr[smallest];
		    
				arr[smallest] = arr[i];
		    
				arr[i] = temp;
		    }
		
		
			for(int i=0; i<arr.length; i++) {
	           
				System.out.print(arr[i]+" ");
	       
			}

	}

}
