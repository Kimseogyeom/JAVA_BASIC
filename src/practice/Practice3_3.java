package practice;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Practice3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요>>");
		try {
			int num = scanner.nextInt();
			if(num != 0 && num%2 == 0) {
				System.out.print("짝수");
			}
			else if(num != 0 && num%2 >0) {
				System.out.print("홀수");
			}
			else {
				System.out.printf("0 또는 정수가 아닙니다.");
			}
		}
		catch(InputMismatchException e) {
			System.out.println("수를 입력하지 않아 프로그램을 종료합니다.");
		}
		finally {
			scanner.close();
		}
	}
}
