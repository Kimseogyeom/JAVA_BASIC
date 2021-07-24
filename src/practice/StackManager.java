package practice;
import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

interface StackInterface{
	int length(); //���ÿ� ����ִ� ���ڿ� ���� ����
	String pop(); //������ �鿡 �ִ� ���ڿ� ��
	boolean push(String ob); // ������ �鿡 ���ڿ� ob Ǫ�� ����
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
		System.out.println("5���� ���ڸ� �Է��ϼ���.");
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
