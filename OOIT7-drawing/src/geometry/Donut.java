package geometry;

//nasledjivanje omogucava da se postojece klase koriste za kreiranje novih
//nalsedjuju se svi atributi i metode koji nisu deklarisani kao private
public class Donut extends Circle {

	private int innerRadius;
	
	//super upucuje poziv roditeljskoj (nadklasi) klasi
	//moze se iskoristiti kako bi se pozvao konstruktor, varijabla ili metoda nadredjene klase
	public Donut() {
		super(); //poziv konstruktora nadklase
	}
	
	public Donut(Point center, int innerRadius, int radius) {
		super(center, radius); 
		//this.setCenter(center);
		//this.setRadius(radius);
		this.innerRadius = innerRadius;
	}
	
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		this(center, innerRadius, radius);
		this.setSelected(selected);
	}
	
	public int getInnerRadius() {
		return this.innerRadius;
	}
	
	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	
	public double area() {
		return super.area() - Math.PI*this.innerRadius*this.innerRadius;
	}
	
	public String toString() {
		//center = (0,0), radius = 0, innerRadius = innerRadius
		return super.toString() + ", innerRadius = " + this.innerRadius;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Donut) {
			Donut d = (Donut)obj;
			/*if(this.getCenter().equals(d.getCenter()) && this.getRadius() == d.getRadius()
					&& this.innerRadius == d.innerRadius) {
				return true;
			}*/
			if(super.equals(d) && this.innerRadius == d.innerRadius) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	public boolean contains(int x, int y) {
		double d = this.getCenter().distance(x, y);
		if (d > this.innerRadius && super.contains(x, y)) {
			return true;
		}
		return false;
	}
	
	public boolean contains(Point p) {
		return super.contains(p) && this.getCenter().distance(p.getX(), p.getY()) >= this.innerRadius;
	}
}
