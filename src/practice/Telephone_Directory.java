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
			System.out.print("��ȭ��ȣ�θ� �����մϴ�....\nA: ��ȭ��ȣ ��� B: ��ȭ��ȣ ã�� exit: ����\n���ڸ� �Է����ּ���:");
			input = sc.next();
			if(input.equals("A")) {
				System.out.println("��ȭ��ȣ�� ����մϴ�. �̸��� ��ȭ��ȣ�� �Է����ּ���: ");
			}
			else if(input.equals("B")) {
				System.out.println("ã���� ���� ������ �Է����ּ���: ");
			}
		}while(!input.equals("exit"));
		System.out.println("���α׷��� �����մϴ�..");
	}
}
