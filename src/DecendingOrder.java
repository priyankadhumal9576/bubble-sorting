import java.util.Arrays;

public class DecendingOrder            ///bubble sorting
{
	public void makeDecending(int a[])
	{
		int i,j;
		for(i=0;i<a.length-1;i++)
		{
			for(j=0;j<a.length-1-i;j++)
			{
				if(a[j]<a[j+1]) 
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
		int a[]=new int[] {9,87,23,5,45,65,15,3,2,9,8};
		System.out.println("Array before sorting is:");
		System.out.println(Arrays.toString(a));
		
		DecendingOrder dec=new DecendingOrder();
		System.out.println("Array after sorting is:");
		dec.makeDecending(a);

	}

}
