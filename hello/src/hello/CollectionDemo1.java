package hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>
{
	int rollno, marks;
	String name;
	
	public Stud(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	
	public int compareTo(Stud s)
	{
		//return marks>s.marks ? 1 : -1;
		
		return name.length()>s.name.length() ? 1 : -1;
	}
	
}

public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Stud> studs = new ArrayList<>();	
		
		studs.add(new Stud(23,"Mahesh",215));
		studs.add(new Stud(21,"Mesh",43));
		studs.add(new Stud(26,"esh",65));
		studs.add(new Stud(33,"rajesh",55));
		
		Collections.sort(studs);
		
		for(Stud s : studs)
		{
			System.out.println(s);
		}
		
	}

}
