//1. WAP to find the duplicates present in an array.
public class DuplicatesInArray {

	public static void main(String[] args) {
		
		int[] ar = {10,20,30,40,50,50,60,30,70,90};
		
		System.out.println("Duplicates are follows:");
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					System.out.println(ar[j]);
				}
			}
		}
		
		
	}

}
