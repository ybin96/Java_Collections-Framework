package study;


import java.util.HashSet;
class HashSetTest{
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("볶음밥");
		set.add("가츠동");
		set.add("파스타");
		set.add("스시");
		set.add("냉면");
		System.out.println(set);

		boolean f1 = set.add("스시");
		boolean f2 = set.add("짬뽕");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(set);
	}
}
