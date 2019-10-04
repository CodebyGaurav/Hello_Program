package hello;

class Z
{
	public void show()
	{
		System.out.println("in A show");
	}
}

public class AnonymousDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z obj = new Z()
				{
					public void show() 
					{
						System.out.println("im the best");
					}	
				};
		obj.show();
	}

}
