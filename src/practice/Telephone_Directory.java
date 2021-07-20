package practice;
import java.util.Scanner;

class file_road{
	
}

class file_write{
	
}

class phonenumber_find{
	
}


public class Telephone_Directory {

	public static void main(String[] args) {
		String input;
	
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("전화번호부를 시작합니다....\nA: 전화번호 등록 B: 전화번호 찾기 exit: 종료\n문자를 입력해주세요:");
			input = sc.next();
			if(input.equals("A")) {
				System.out.println("전화번호를 등록합니다. 이름과 전화번호를 입력해주세요: ");
			}
			else if(input.equals("B")) {
				System.out.println("찾으실 분의 성함을 입력해주세요: ");
			}
		}while(!input.equals("exit"));
		System.out.println("프로그램을 종료합니다..");
	}
}
