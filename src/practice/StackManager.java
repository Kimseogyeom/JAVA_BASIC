package practice;
import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

interface StackInterface{
	int length(); //스택에 들어있는 문자열 개수 리턴
	String pop(); //스택의 톱에 있는 문자열 팝
	boolean push(String ob); // 스택의 톱에 문자열 ob 푸쉬 삽입
}

class Stringstack implements StackInterface{
	private String[] element;
	private int index;
	
	public Stringstack(int capacity) {
		element = new String[capacity];
		index = 0;
	}
	public int length() {
		return index;
	}
	public String pop() {
		if(index == 0)
			return null;
		index--;
		return element[index];
	}
	public boolean push(String ob) {
		if(index == element.length)
			return false;
		element[index++] = ob;
		return true;
	}
}
public class StackManager {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stringstack stack = new Stringstack(10);
		StackInterface s = stack;
		System.out.println("5개의 문자를 입력하세요.");
		for(int i = 0; i < 5; i++) {
			String input = scan.next();
			s.push(input);
		}
		int count = s.length();
		for(int i=0; i<count; i++) {
			System.out.print(s.pop()+" ");
		}
	}
}
