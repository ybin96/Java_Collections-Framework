package study;


import java.util.ArrayList;
import java.util.HashMap;
class MapTest 
{
	public static void main(String[] args) 
	{
		ArrayList<String> data = new ArrayList<String>();
		data.add("홍길동");				//이름
		data.add("서울시 마포구 서교동");	//주소
		data.add("010-1234-5678");		//전화

		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));

		//주소가 몇번째 인덱이지??
		//인덱스가 아닌 의미 있는 key로 데이터에 접근 할 수 있다 ==> Map

		HashMap<String,String> map = new HashMap<String,String>();
		map.put("name","홍길동");
		map.put("addr","서울시 마포구 서교동");
		map.put("phone", "010-1234-5678");
		System.out.println(map.get("name"));
		System.out.println(map.get("addr"));
		System.out.println(map.get("phone")); 

		System.out.println(map);
		String value1 = map.put("age","27");
		String value2 = map.put("addr", "제주도 서귀포시 oo동");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(map);

		String value3 = map.remove("age");
		String value4 = map.remove("height");
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(map);

		

	}
}
