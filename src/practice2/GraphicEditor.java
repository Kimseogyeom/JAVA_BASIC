package practice2;
import java.util.Scanner;
import java.util.Arrays;

abstract class Shape{
	protected abstract void draw();
}
class Line extends Shape {
	protected void draw() { System.out.println("Line"); }
}

class Rect extends Shape {
	protected void draw() { System.out.println("Rect"); }
}

class Circle extends Shape {
	protected void draw() { System.out.println("Circle"); }
}

public class GraphicEditor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] figure = new Shape[10];
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(true) {
			if(count < 0) count = 0;
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >>>");
			int num = scan.nextInt();
			switch(num) {
			case 1:
				System.out.print("도형종류 Line(1), Rect(2), Circle(3) >>>");
				int num1 = scan.nextInt();
				switch(num1) {
				case 1:
					figure[count] = new Line();
					break;
				case 2:
					figure[count] = new Rect();
					break;
				case 3:
					figure[count] = new Circle();
					break;
				}
				count++;
				break;
			case 2:
				System.out.print("삭제할 위치>>>");
				int num2 = scan.nextInt();
				if(figure[num2 -1]==null) {
					System.out.println("삭제할 수 없습니다.");
				}
				else {
					for(int i = num2; i < figure.length -num2; i++) {
						figure[num2 -1] = figure[num2];
					}
					figure[9] = null;
					count--;
				}
				continue;
			case 3:
				for(int i=0; i<count; i++) {
					figure[i].draw();
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다..");
				System.exit(0);
				break;
			}	
		}
	}
}
