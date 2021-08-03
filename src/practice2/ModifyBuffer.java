package practice2;
import java.util.Scanner;

public class ModifyBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = scan.nextLine();
			System.out.println("String s =" + s);
			StringBuffer sb = new StringBuffer(s);
			System.out.println("StringBuffer s =" + sb);
			if(s.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			int index = (int)(Math.random()*s.length());
			System.out.println("int index ="+ index);
			while(true) {
				int i = (int)(Math.random()*26);
				System.out.println("int i ="+i);
				char c = (char)('a' + i);
				System.out.println("char c =" + c);
				if(!sb.equals(c)) {
					sb.replace(index,index+1,Character.toString(c));
					break;
				}
			}
			System.out.println(sb);
		}

	}

}
