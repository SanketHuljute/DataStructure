package Sort;

public class Q1_BubbleSort {

	public static void Bsort(int []a)
{
	int temp,cnt_itr=0,cnt_sw=0;
	for (int i=0;i<a.length-1;i++)
	{
		for ( int j=0 ; j<(a.length-1-i) ; j++ )
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				cnt_sw++;
			}
			cnt_itr++;
		}
		System.out.println();
	}
	System.out.println("count Swap: "+cnt_sw);
	System.out.println("Count iteration: "+cnt_itr);
}
	public static void display(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{	
		System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {9,7,-2,3,12,5};
		System.out.println("Array Before sorting:");
		display(arr);
		Bsort(arr);
		System.out.println("\nArray After Sorting:");
		display(arr);
	}

}
