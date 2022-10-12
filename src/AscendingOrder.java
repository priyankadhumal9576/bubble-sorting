import java.util.Arrays;

public class AscendingOrder 
{
	public void makeAscending(int a[])         //Bubble sorting
	{
		int i,j;
		for(i=0;i<a.length-1;i++)
		{
			for(j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1]) 
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}
		
	}

	public static void main(String[] args) 
	{
		int a[]=new int[] {5,4,7,1,3,9,45,78,12,2};
		System.out.println("Array before sorting:");
		System.out.println(Arrays.toString(a));
		
		AscendingOrder asc=new AscendingOrder ();
		System.out.println("Array after soeting is:");
		asc.makeAscending(a);
		

	}

}
