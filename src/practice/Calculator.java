package practice;
import java.util.Scanner;

abstract class Calculator_ab{
	protected int a, b;
	abstract protected int calc();
	protected void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요>>");
		a = scan.nextInt();
		b = scan.nextInt();
	}
	public void run() {
		input();
		int res = calc();
		System.out.println("계산된 값은 "+res);
	}
}
class Adder extends Calculator_ab{
	protected int calc() {
		int add = a + b;
		return add;
	}
	
}
class Subtracter extends Calculator_ab{
	protected int calc() {
		int sub = a - b;
		return sub;
	}
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		
		adder.run();
		sub.run();
	}

}
