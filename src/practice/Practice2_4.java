package practice;
import java.util.Scanner;

public class Practice2_4 {
	
	public static void main(String[] args) {
		System.out.println("���� �׼��� �Է��ϼ���: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int a = x/50000; // ��������
		int b = (x-50000*a)/10000; // ������
		int c = (x%10000)/1000; // õ����
		int d = (x%1000)/500; // 500��
		int e = (x%500)/100; // 100��
		int f = (x%100)/10; // 10��
		int g = (x%10)/1; // 1��
		System.out.printf("������"+a+"��"+"����"+b+"��"+"õ��"+c+"��"+"500��"+d+"��"+"100��"+e+"��"+"10��"+f+"��"+"1��"+g+"��");
	}

}
