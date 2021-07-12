package practice;
import java.util.Scanner;

class Player{
	Scanner scanner = new Scanner(System.in);
	static String end = "�ƹ���";
	String sayWord(String n) {
		System.out.printf("%s>>",n);
		String ob = scanner.next();
		return ob;
	}
	boolean succeed(String word) {
		boolean result = false;
		int lastIndex = end.length() -1;
		char lastChar = end.charAt(lastIndex);
		int firstIndex = end.length() -1;
		char firstChar = word.charAt(0);
		if(lastChar == firstChar) {
			end = word;
			result = true;
		}
		return result;
	}
}

public class Practice4_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player player = new Player();
		String word;
		String who = null;
		int flag = 0;
		System.out.printf("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int Num = scanner.nextInt();
		String name [] = new String[Num];
		for(int i = 0; i < Num; i++) {
			System.out.printf("�������� �̸��� �Է��ϼ���>>");
			name[i] = scanner.next();
		}
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
		while(true) {
			for(int j=0;j<Num;j++) {
				word = player.sayWord(name[j]);
				if(player.succeed(word)==false) {
					flag = 1;
					who = name[j];
					break;                 
				}
			}
		if(flag == 1) {
			System.out.printf("%s���� Ʋ���̽��ϴ�.", who);
			break;
		}
		}
	}
}
