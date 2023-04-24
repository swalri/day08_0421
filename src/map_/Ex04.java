package map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
//		HashMap<String, String> map = new HashMap<>();
		LinkedHashMap<String, String> map = new LinkedHashMap<>();//순서유지하고싶을때
		map.put("name", "kim");
		map.put("age", "20");
		map.put("addr", "시골");
		System.out.println(map);
		
//		Set<String> set = map.keySet();
//		Iterator<String> it = set.iterator();
		Iterator<String> it = map.keySet().iterator();

		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s+" : "+map.get(s));	
		}
		

	}
}


