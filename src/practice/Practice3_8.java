package practice;
import java.util.Scanner;
import java.util.Random;
public class Practice3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
			String input = scanner.next();
			int n = (int)(Math.random()*3);
			if(input.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(str[n].equals("가위")) {
				if(input.equals("바위")) {
					System.out.printf("사용자 = %s, 컴퓨터 = %s, 사용자가 이겼습니다.",input, str[n]);
				}
				else if(input.equals("보")) {
					System.out.printf("사용자 = %s, 컴퓨터 = %s, 컴퓨터가 이겼습니다.",input, str[n]);
				}
				else if(input.equals("가위")) {
					System.out.printf("사용자 = %s, 컴퓨터 = %s, 비겼습니다.",input, str[n]);
				}
			}
			else if(str[n].equals("바위")) {
				if(input.equals("바위")) {
					System.out.printf("사용자 = %s, 컴퓨터 = %s, 비겼습니다.",input, str[n]);
				}
				else if(input.equals("보")) {
					System.out.printf("사용자 = %s, 컴퓨터 = %s, 사용자가 이겼습니다.",input, str[n]);
				}
				else if(input.equals("가위")) {
					System.out.printf("사용자 = %s, 컴퓨터 = %s, 컴퓨터가 이겼습니다.",input, str[n]);
				}
			}
			else if(str[n].equals("보")) {
				if(input.equals("바위")) {
					System.out.printf("사용자 = %str, 컴퓨터 = %s, 컴퓨터가 이겼습니다.",input, str[n]);
				}
				else if(input.equals("보")) {
					System.out.printf("사용자 = %s, 컴퓨터 = %s, 비겼습니다.",input, str[n]);
				}
				else if(input.equals("가위")) {
					System.out.printf("사용자 = %s, 컴퓨터 = %s, 사용자가 이겼습니다.",input, str[n]);
				}
			}
		}
		scanner.close();
	}
}
