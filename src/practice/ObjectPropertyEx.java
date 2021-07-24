package practice;

class Point{
	int x,y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
}
public class ObjectPropertyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(2,3);
		String s = a + "Á¡";
		System.out.println(a);
		System.out.println(s);
	}

}
