package hello;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



public class ColectionDemo {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>();
		values.add(218); //Integer v = new Integer(2);
		values.add(423);
		values.add(554);
		values.add(139);
		values.add(997);
//		values.add(2,4);

//		Iterator it = values.iterator();
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
//		 
//		for(Object o : values)
//		{
//			System.out.println(o);
//		}
		
		Comparator<Integer> c = new Comparator<>()
					{
						public int compare(Integer i,Integer j)
				 		{
							return i%10>j%10 ? 1 : -1;
						}
					};
				
		Collections.sort(values, c);
			
		
		
		for(Integer o : values)
		{
			System.out.println(o);
		}
		
		
	}

}
