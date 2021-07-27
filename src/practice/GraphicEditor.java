package practice;
import java.util.Scanner;

abstract class Object{
	public abstract void insert();
	public abstract void delete();
	public abstract void check();
	public abstract void exit();
}
class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
}
class 
public class GraphicEditor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
