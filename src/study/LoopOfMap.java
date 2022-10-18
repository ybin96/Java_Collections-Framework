package study;


import java.util.HashMap;
import java.util.Iterator;
class LoopOfMap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("kor",100);
		map.put("eng",80);
		map.put("math",90);
		
		//Set set = map.keySet();
		//Iterator iter = set.iterator();
		Iterator<String> iter = map.keySet().iterator();
		while( iter.hasNext()  ){
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println("key:" + key);
			System.out.println("value:" + value);
			System.out.println("----------------------------------");
		}


		// Set<K>	keySet()
		// map에 있는 key와 value 모두 순차적으로 출력 해 봅니다.
		// 완성하면 "1"


		
		/*
		for(int i=0; i<map.size(); i++)
		{
			Object obj = map.get(i);
			System.out.println(obj);
		}*/
		
		/*
		for(Object obj:map){
			System.out.println(obj);
		}*/

	}
}
