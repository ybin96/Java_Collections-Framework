package study;


import java.util.ArrayList;
class Personz{
	private String name;
	private int age;
	public Personz(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "[이름:"+name+",나이:"+age+"]";
	}
	public void sayHello(){
		System.out.println("hello, "+name);
	}
}
class GenericTest03{
	public static void main(String[] args) {
		ArrayList<Personz> list = new ArrayList<Personz>();
		list.add(new Personz("김유신",27));
		list.add(new Personz("이순신",28));
		list.add(new Personz("홍길동",29));
		for(Personz p : list){
			System.out.println(p);
			p.sayHello();
		}
	}
}
