package hello;

abstract class Human
{
	public abstract void eat();
	
	public void walk()
	{
		
	}
}

class Man extends Human
{
	public void eat()
	{
		
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj = new Man();	
	}

}
