package study;


import java.util.Random;
import java.util.Scanner;
class NumberGuessTest {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int com = r.nextInt(100) + 1;
		int user;
		int cnt = 0;

		while(true){
			System.out.print("알아 맞추어 보세요==>");
			user = sc.nextInt();
			cnt++;
			if(user == com){
				break;
			}else if(com < user){
				System.out.println("더 작은 수를 입력하세요");
			}else{
				System.out.println("더 큰 수를 입력하세요");
			}
		}

		System.out.println(cnt+"번째에 알아 맞추었습니다.");
	}
}
