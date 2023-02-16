//WAP to check whether an array is a subset of another array.
public class ArrSubset6 {

	public static void main(String[] args) {
		
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
        
		int arr2[] = { 11, 3, 7, 1 ,2};
		
		int j=0; 
		
		boolean x = true;
		   for(int i=0;i<arr2.length;i++)
		    {
		      for(j=0;j<arr1.length;j++)
		      {
		        if(arr2[i]==arr1[j])
		        {
		         break;
		        }
		      }
		      if(j==arr1.length)
		      {
		      x=false;
		      System.out.println("Given array is not a subset");
		       break;
		      }
		    } 
		  if(x)
		  {
		    System.out.println("Given array is a subset of the main array");
		  }  
		 
		
		
	

	}

}
