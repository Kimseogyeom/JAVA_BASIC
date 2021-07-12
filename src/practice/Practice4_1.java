package practice;
import java.util.Scanner;

class Player{
	Scanner scanner = new Scanner(System.in);
	static String end = "아버지";
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
		System.out.printf("게임에 참가하는 인원은 몇명입니까>>");
		int Num = scanner.nextInt();
		String name [] = new String[Num];
		for(int i = 0; i < Num; i++) {
			System.out.printf("참가자의 이름을 입력하세요>>");
			name[i] = scanner.next();
		}
		System.out.println("시작하는 단어는 아버지입니다.");
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
			System.out.printf("%s님이 틀리셨습니다.", who);
			break;
		}
		}
	}
}
