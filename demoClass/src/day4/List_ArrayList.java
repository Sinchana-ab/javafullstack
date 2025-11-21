package day4;

import java.util.ArrayList;import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class List_ArrayList {
	public static void main(String[] args) {
		int[] array = new int[3];
		//int
		//Generics
		List<Integer> list = new ArrayList<>();
		list.add(200);
		list.add(null);
		list.add(200);
		list.add(400);
		
		
		list.stream().forEach(n->System.out.println(n));
		// list.stream().forEach(n->System.out.println(n)));
		
		System.out.println(list);
		Set<String> s = new HashSet<>();
		s.add("apple");
		s.add("banana");
		s.add(null);
		s.add(null);
		s.add("apple");
		s.add("orange");
//		s.forEach(n->)
		System.out.println(s);
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("sinchana", 90);
		m.put("nayana", null);
		m.put(null, null);
		m.replace("sinchana", 99);
		System.out.println(m);
	}
}
