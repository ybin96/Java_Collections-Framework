package study;


import java.util.TreeSet;
class TreeSetTest{
	public static void main(String[] args) 
	{
		TreeSet set = new TreeSet();
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

		//데이터를 개수를 반환하는 메소드를 찾아보고 
		//출력 해 봅니다.
		//완성하면 "1"
		System.out.println(set.size());
	}
}
