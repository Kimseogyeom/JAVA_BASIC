package practice;
import java.util.Scanner;

public class Practice2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.printf("1~99 ������ ������ �Է��ϼ���>>");
		int x = scanner.nextInt();
		int first = x/10;
		int second = x%10;
		if(first/3 > 0 && second/3 > 0) {
			System.out.println("�ڼ�¦¦");
		}
		else if(first/3 > 0 || second/3 > 0) {
			System.out.println("�ڼ�¦");
		}
		else {
			System.out.println("�ڼ�����");
		}
	}

}
