package hello;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String , String> map = new HashMap<>();
			
		map.put("myname", "auarav");
		map.put("my", "ujaav");
		map.put("name", "raharav");
		map.put("me", "sanu");
		map.put("mmame", "ragrav");
		
		Set<String> keys = map.keySet();
		
		for(String key : keys)
		{

			System.out.println(key + " " +map.get(key));
			
		}
		
	}

}
