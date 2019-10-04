package hello;

class Student
{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.setRollno(2);
		s.setName("Gaurav");
		
		System.out.println(s.getRollno());
		System.out.println(s.getName());
	}

}
