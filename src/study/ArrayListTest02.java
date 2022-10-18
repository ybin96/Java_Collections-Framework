package study;


import java.util.ArrayList;
class ArrayListTest02{
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(27);
		list.add(182.5);
		list.add("서울시 마포구 서교동");
		list.add(true);
		System.out.println(list);
		System.out.println( list.get(2) );

		list.remove(0);
		System.out.println(list);
	}
}
