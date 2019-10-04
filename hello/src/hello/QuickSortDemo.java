package hello;



public class QuickSortDemo {

	public void QuickSort(int A[],int p,int r)
	{
		//p=first value and r= high value
		if(p<r)
		{
			int q=Partition(A,p,r);
			QuickSort(A,p,q-1);
			QuickSort(A,q+1,r);
		}
	}
	
	public int Partition(int A[],int p,int r)
	{
		int x=A[r];
		int i=p-1;
		for(int j=p;j<r-1;j++)
		{
			if(A[j]<=x) 
			{
				i++;
				// arr[i]=arr[j]
				int temp;
				temp=A[i];
				A[i]=A[j];
				A[j]=temp;
			}
		}
		
	 	//arr[i+1]=arr[r]
		int temp1;
		temp1=A[i+1];
		A[i+1]=A[r];
		A[r]=temp1;
		
		return i+1;
		
	}
	
	static void printArray(int A[])
	{
		int n= A.length;
		for(int i=0;i<n;i++) {
			System.out.print(A[i]+" ");
		System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {12,10,3,23,76,98,45,55};
		int n = A.length;
		QuickSortDemo q = new QuickSortDemo();
		q.QuickSort(A,0,n-1);
		
		System.out.println("Sorted Arary :");
		printArray(A);
	}

}
