package practice;
import java.util.Scanner;
import java.util.Random;
public class Practice3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while(true) {
			String input = scanner.next();
			int n = (int)(Math.random()*3);
			if(input.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else if(str[n].equals("����")) {
				if(input.equals("����")) {
					System.out.printf("����� = %s, ��ǻ�� = %s, ����ڰ� �̰���ϴ�.",input, str[n]);
				}
				else if(input.equals("��")) {
					System.out.printf("����� = %s, ��ǻ�� = %s, ��ǻ�Ͱ� �̰���ϴ�.",input, str[n]);
				}
				else if(input.equals("����")) {
					System.out.printf("����� = %s, ��ǻ�� = %s, �����ϴ�.",input, str[n]);
				}
			}
			else if(str[n].equals("����")) {
				if(input.equals("����")) {
					System.out.printf("����� = %s, ��ǻ�� = %s, �����ϴ�.",input, str[n]);
				}
				else if(input.equals("��")) {
					System.out.printf("����� = %s, ��ǻ�� = %s, ����ڰ� �̰���ϴ�.",input, str[n]);
				}
				else if(input.equals("����")) {
					System.out.printf("����� = %s, ��ǻ�� = %s, ��ǻ�Ͱ� �̰���ϴ�.",input, str[n]);
				}
			}
			else if(str[n].equals("��")) {
				if(input.equals("����")) {
					System.out.printf("����� = %str, ��ǻ�� = %s, ��ǻ�Ͱ� �̰���ϴ�.",input, str[n]);
				}
				else if(input.equals("��")) {
					System.out.printf("����� = %s, ��ǻ�� = %s, �����ϴ�.",input, str[n]);
				}
				else if(input.equals("����")) {
					System.out.printf("����� = %s, ��ǻ�� = %s, ����ڰ� �̰���ϴ�.",input, str[n]);
				}
			}
		}
		scanner.close();
	}
}
