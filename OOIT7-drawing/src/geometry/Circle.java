package geometry;

import java.awt.Graphics;

public class Circle extends Shape{
	private int radius;
	private Point center;
	
	public Circle() {
		this.center = new Point();
	}
	
	public Circle(Point center, int radius) {
		this.radius = radius;
		this.center = center;
	}
	
	public double area() {
		return this.radius*this.radius*Math.PI;
	}
	
	public double circumference() {
		return 2*this.radius*Math.PI;
	}

	public int getRadius() {
		return this.radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Point getCenter() {
		return this.center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	
	public String toString() {
		//center = (x,y), radius = radius
		return "center = "+ this.getCenter().toString() + ", radius = "+ this.radius;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle c = (Circle) obj;
			if(this.getCenter().equals(c.getCenter()) && this.getRadius() == c.getRadius()) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	public boolean contains(int x, int y) {
		return this.getCenter().distance(x, y) <= this.radius;
	}
	
	public boolean contains(Point point) {
		return this.getCenter().distance(point.getX(), point.getY()) <= this.radius;
	}
	
	public void draw(Graphics g) {
		int xRect = this.center.getX() - this.radius;
		int yRect = this.center.getY() - this.radius;
		int a = this.radius * 2;
		g.drawOval(xRect, yRect, a, a);
	}
}
