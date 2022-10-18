package study;

import java.util.ArrayList;
import java.util.LinkedList;
class ArrayListAndLinkedList {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		list1.add("사과");list1.add("포도");list1.add("수박");				
		list2.add("사과");list2.add("포도");list2.add("수박");
		System.out.println(list1);
		System.out.println(list2);
		list1.remove(2);
		list2.remove(2);
		System.out.println(list1);
		System.out.println(list2);
		list1.add(1, "딸기");
		list2.add(1, "딸기");
		System.out.println(list1);
		System.out.println(list2);
	}
}
