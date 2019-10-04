package hello;

class D
{
	int i;
	public void show()
	{
		System.out.println("in A");
	}
}

class C extends D
{
	int i;
	@Override
	public void show()
	{
		super.i=8;
		super.show();
		System.out.println("in B");
	}
}

public class MultipleInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
		obj.show();
	}

}
