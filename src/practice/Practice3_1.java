package practice;
import java.util.Scanner;
import java.util.Random;


public class Practice3_1 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		while(true){
			int k = r.nextInt(100);
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������\n0~99");
			for(int i = 1; true; i++) {
				int input = scanner.nextInt();
				System.out.printf("%d>>%d\n",i,input);
				if(input < k) {
					System.out.println("�� ����");
				}
				else if(input > k){
					System.out.println("�� ����");
				}
				else if(input == k) {
					System.out.println("�¾ҽ��ϴ�.");
					break;
				}
				else {
					System.out.println("�߸��Է��ϼ̽��ϴ� �ٽ� �Է����ּ���");
				}
			}
			System.out.println("�ٽ��Ͻðڽ��ϱ�(y/n)");
			if(scanner.next().equals("n")) {
				break;
			}
		}
		scanner.close();
	}
}
