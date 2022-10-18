package study;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
class ArrayListAndHashSet {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);

		for(int i=0; i<list.size(); i++){
			int a = list.get(i);
			System.out.println(a);
		}

		HashSet<Integer> set  = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		/*
		for(int i=0; i<list.size(); i++){
			int a = set.get(i);
			System.out.println(a);
		}*/
		/*
		for(int a:set){
			System.out.println(a);
		}*/

		Iterator<Integer> iter = set.iterator();
		while(  iter.hasNext()  ){
			Integer a = iter.next();
			System.out.println(a);
		}

	}
}

