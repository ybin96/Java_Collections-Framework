package study;


import java.util.ArrayList;
class ArrayListTest01{
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("사과");
		list.add("포도");
		list.add("수박");
		System.out.println(list);
		list.add("포도");
		list.add("복숭아");
		System.out.println(list);
		System.out.println(list.size());
	}
}
