package study;


import java.util.TreeSet;
import java.util.Random;
class LottoTest {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		Random r = new Random();
		
		while(true){
			set.add(   r.nextInt(45)+1  );
			if( set.size() == 6 ){
				break;
			}
		}
		System.out.println(set);
	}
}
