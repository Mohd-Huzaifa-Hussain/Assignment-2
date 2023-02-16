//3. WAP to sort an array using Bubble Sort Algorithm.
public class BubbleSort3 {

	public static void main(String[] args) {
		
		int a[] = {8,7,5,2,9,1};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					int tempVar=a[j];
					a[j]=a[j-1];
					a[j-1]=tempVar;
				}
			}
		}
		
		for(int i = 0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}




