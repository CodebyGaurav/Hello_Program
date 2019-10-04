package hello;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		for(i=1;i<6;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=5;k>j;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
