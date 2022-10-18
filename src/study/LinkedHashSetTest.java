package study;


import java.util.LinkedHashSet;
class LinkedHashSetTest{
	public static void main(String[] args) 
	{
		LinkedHashSet set = new LinkedHashSet();
		set.add("파인애플");
		set.add("키위");
		set.add("샤인머스켓");
		set.add("수박");

		System.out.println(set);

		boolean f1 = set.add("파인애플");
		boolean f2 = set.add("복숭아");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(set);
	}
}
