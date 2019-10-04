package hello;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int num[] = new int[4];
		
	//	num[0]=8;
	//	num[1]=18;
	//	num[2]=28;
	//	num[3]=38;
		
	//	for(int i=0;i<4;i++)
		
	//	System.out.println(num[i]);

		
		int d[][] = {
						{1,2,3,4	},
						{2,3,5,64,4,4,44,},
						{5,6,3,1}
					};
		 
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++) 
			{
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}
		
		for(int k[]:d)
		{
			for(int l : k)
			{
				System.out.print(" "+l);
			}
			System.out.println();
		}
	}

}
