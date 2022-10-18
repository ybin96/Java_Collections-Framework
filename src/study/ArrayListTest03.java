package study;


import java.util.ArrayList;

class Person{
	private String name;
	private int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "[이름:"+name+",나이:"+age+"]";
	}
}
class ArrayListTest03{
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Person kim = new Person("김유신", 27);
		Person lee = new Person("이순신", 28);
		list.add(kim);
		list.add(lee);
		list.add(new Person("홍길동",26));
		System.out.println(list);
	}
}
