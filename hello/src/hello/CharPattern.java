package hello;

public class CharPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		
		for(i=1;i<6;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print((char)(j+65)+" ");
			}
			System.out.println();
		}
	}

}
