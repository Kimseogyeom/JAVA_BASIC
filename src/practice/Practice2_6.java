package practice;
import java.util.Scanner;

public class Practice2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.printf("1~99 사이의 정수를 입력하세요>>");
		int x = scanner.nextInt();
		int first = x/10;
		int second = x%10;
		if(first/3 > 0 && second/3 > 0) {
			System.out.println("박수짝짝");
		}
		else if(first/3 > 0 || second/3 > 0) {
			System.out.println("박수짝");
		}
		else {
			System.out.println("박수없음");
		}
	}

}
