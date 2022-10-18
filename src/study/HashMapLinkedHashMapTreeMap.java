package study;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
class HashMapLinkedHashMapTreeMap {
	public static void main(String[] args) {
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		map1.put("kor",80);
		map1.put("eng",90);
		map1.put("math",100);

		System.out.println(map1);

		LinkedHashMap<String,Integer> map2 = new LinkedHashMap<String,Integer>();
		map2.put("kor",80);
		map2.put("eng",90);
		map2.put("math",100);

		System.out.println(map2);

		TreeMap<String,Integer> map3 = new TreeMap<String,Integer>();
		map3.put("kor",80);
		map3.put("eng",90);
		map3.put("math",100);

		System.out.println(map3);
		
	}
}
