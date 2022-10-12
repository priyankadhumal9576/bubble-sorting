import java.util.Arrays;

public class AscendingCharactor 
{
	public void doAscending(char a[])
	{
		
		int i,j;
		int temp;
		for(i=0;i<a.length-1;i++)
		{
			for(j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1]) 
				{
					 temp=a[j];
					a[j]=a[j+1];
					a[j+1]=(char) temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}

	public static void main(String[] args)
	{
		char a[]=new char[] {'a','p','*','u','b','d',57,'q'};
		System.out.println("Array before sorting...");
		for(int x:a)
			System.out.println(x+" ");
		AscendingCharactor ch=new AscendingCharactor ();
		ch.doAscending(a);
	}

}
