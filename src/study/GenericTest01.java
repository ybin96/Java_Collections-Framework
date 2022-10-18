package study;


import java.util.ArrayList;
class  GenericTest01{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//list.add(5);
		list.add("사과");
		list.add("포도");
		list.add("수박");
		System.out.println(list);
	}
}

/*
C:\javaStudy\day0824>javac GenericTest.java
GenericTest.java:5: error: incompatible types: int cannot be converted to String
                list.add(5);
                         ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
*/


