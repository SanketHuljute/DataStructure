package Sort;

public class Q2_SelectionSort 

//	public static void main(String[] args) {
//
//		public static void sSort(int []a)
//		{
//			int min,index ;
//			for(int i=1;i<a.length-1;i++)
//			{
//				min=a[i];
//				index=1;
//				for(int j=i+1 ;j<a.length;j++)
//			}
//		}
//
//	}
//
//}

	{
		public static void sSort(int[] a)
		{
		int min,index;
		for(int i = 0; i < a.length-1; i++)
		{
		min = a[i];
		index = i;
		for(int j = i+1;j < (a.length);j++)
		{
		if(a[j] < min)
		{
		min = a[j];
		index = j;				
		}
		}
		a[index] = a[i];
		a[i]=min;
		System.out.println("\nIteration "+(i+1));
		Display(a);
		System.out.println();
		}
		}

		public static void Display(int[] a)
		{
		for(int i=0; i < a.length; i++)
		System.out.print(a[i]+"  ");
		}

		public static void main(String[] args) 
		{
		int arr[] = {9,7,-2,3,12,5};
		System.out.println("Array Before sorting :");
		Display(arr);
		sSort(arr);
		System.out.println("\nArray After sorting :");
		Display(arr);
		}
	}

	