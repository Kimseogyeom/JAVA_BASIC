package practice;
import java.util.Scanner;

public class Practice2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("학점을 입력하세요>>");
		Scanner scanner = new Scanner(System.in);
		String Score = scanner.next();
		switch(Score) {
		case "A":
		case "B":
			System.out.println("Excellent");
			break;
		case "C":
		case "D":
			System.out.println("Good");
			break;
		case "F":
			System.out.println("bye");
		}
			
	}

}

