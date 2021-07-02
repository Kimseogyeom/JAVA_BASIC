package practice;
import java.util.Scanner;

public class Practice2_4 {
	
	public static void main(String[] args) {
		System.out.println("돈의 액수를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int a = x/50000; // 오만원권
		int b = (x-50000*a)/10000; // 만원권
		int c = (x%10000)/1000; // 천원권
		int d = (x%1000)/500; // 500원
		int e = (x%500)/100; // 100원
		int f = (x%100)/10; // 10원
		int g = (x%10)/1; // 1원
		System.out.printf("오만원"+a+"개"+"만원"+b+"개"+"천원"+c+"개"+"500원"+d+"개"+"100원"+e+"개"+"10원"+f+"개"+"1원"+g+"개");
	}

}
