package practice;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Practice3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���>>");
		try {
			int num = scanner.nextInt();
			if(num != 0 && num%2 == 0) {
				System.out.print("¦��");
			}
			else if(num != 0 && num%2 >0) {
				System.out.print("Ȧ��");
			}
			else {
				System.out.printf("0 �Ǵ� ������ �ƴմϴ�.");
			}
		}
		catch(InputMismatchException e) {
			System.out.println("���� �Է����� �ʾ� ���α׷��� �����մϴ�.");
		}
		finally {
			scanner.close();
		}
	}
}
