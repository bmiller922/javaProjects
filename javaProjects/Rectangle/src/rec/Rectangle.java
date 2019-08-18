package rec;

import java.awt.Point;

public class Rectangle {
	public int width = 0;
	public int height = 0;
	public Point origin;
	
	//four constructors
	public Rectangle() {
		origin = new Point(0,0);
		}
	public Rectangle(Point p) {
		origin = p;
	}
	public Rectangle(int w, int h) {
		origin = new Point(0, 0);
		width = w;
		height = h;
	}
	
	//a method for moving the rectangle
	public void move(int x, int y) {
		origin.x = x;
		origin.y = y;
	}
	
	//method for computing the area of the rectangle
	public int getArea() {
		return width*height;
	}
	public static void main(String[] args) {
		System.out.println("Lets build a Rectangle!");
		Rectangle r = new Rectangle(10, 5);
		System.out.println("Area of our Rectangle is: " + r.getArea());
	}

}
