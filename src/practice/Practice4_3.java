package practice;
import java.util.Scanner;

class Rect{
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getArea() {
		return width * height;
	}
} 
public class Practice4_3 {

	public static void main(String[] args) {
		int width, height;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		Rect[] rectArray = new Rect [4];// int array [] = new int[5]
		for(int i=0; i<4;i++) {
			System.out.printf("�ʺ�� ����>>");
			width = scanner.nextInt();
			height = scanner.nextInt();
			rectArray[i] = new Rect(width, height);
		}
		System.out.println("�����Ͽ����ϴ�...");
		for(int j=0; j<4;j++) {
			sum += rectArray[j].getArea();
		}
		System.out.printf("�簢���� ��ü ���� "+sum);
	}

}
