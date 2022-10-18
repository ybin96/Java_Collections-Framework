
package study;

import java.util.ArrayList;
import java.util.Scanner;
class Student{
	private String name;
	private String addr;
	private String phone;
	public Student(String name, String addr, String phone){
		this.name=name;
		this.addr=addr;
		this.phone = phone;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAddr(String addr){
		this.addr = addr;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getName(){
		return name;
	}
	public String getAddr(){
		return addr;
	}
	public String getPhone(){
		return phone;
	}
	public String toString(){
		return name+","+addr+","+phone;
	}
}
class StudentTest02 {

	public static void menu(){
		System.out.print("1:추가, 2:출력, 3:검색, 4:삭제, 0:종료 ==>");
	}

	public static void insertStudent( ArrayList<Student> arr ){
		Scanner sc = new Scanner(System.in);
		String name, addr, phone;
		System.out.print("학생의 이름 입력==>");
		name= sc.next();
		System.out.print("학생의 주소 입력==>");
		addr= sc.next();
		System.out.print("학생의 전화 입력==>");
		phone= sc.next();
		arr.add(new Student(name, addr, phone));
	}

	public static void printStudent(ArrayList<Student> arr){
		System.out.println("*** 학생목록 ***");
		System.out.println("이름\t주소\t전화");
		for(Student s  : arr){
			System.out.println(s.getName()+"\t"+s.getAddr()+"\t"+s.getPhone());
		}
	}

	public static void searchStudent(ArrayList<Student> arr){
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("찾을 학생의 이름을 입력===>");
		name = sc.next();
		boolean flag = false;
		for( int i=0; i<arr.size();i++ ){
			 Student s = arr.get(i);
			 if(s.getName().equals(name)){
				 System.out.println("이름:" + s.getName());
   				 System.out.println("주소:" + s.getAddr());
				 System.out.println("전화:" + s.getPhone());
				 flag = true;
				 break;
			 }
		}
		if(flag == false){
			System.out.println("찾는 학생 " + name+"의 정보는 없습니다.");
		}
	}

	public static void deleteStudent(ArrayList<Student> arr){
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("삭제하고자 하는 학생의 이름을 입력==>");
		name = sc.next();
		boolean flag = false;
		for(int i=0;i<arr.size();i++){
			Student s = arr.get(i);
			if(s.getName().equals(name)){
				arr.remove(i);
				flag = true;
			}
		}
		if(flag){
			System.out.println("학생" + name +"의 정보를 삭제하였습니다.");
		}else{
			System.out.println("삭제하려는 학생" + name +"의 정보는 리스트에 없습니다.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		String name, addr, phone;
		int sel;
		while(true){
			menu();
			sel = sc.nextInt();
			if(sel == 0){
				break;
			}
			switch(sel){
				case 1:insertStudent(list);break;
				case 2:printStudent(list);break;
				case 3:searchStudent(list);break;
				case 4:deleteStudent(list);break;
			}
		}
	}	
}
