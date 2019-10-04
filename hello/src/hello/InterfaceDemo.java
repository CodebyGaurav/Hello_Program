package hello;

@FunctionalInterface
interface Abc
{
	void show(); 
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj = () ->System.out.println("Im the best");
		obj.show();
		
	}

}
