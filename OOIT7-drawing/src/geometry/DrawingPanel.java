package geometry;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel{
	/*
	 paint metodu koristi Swing API kako bi na ekranu iscrtao kompnentu ili kontejner
	 super.paint() poziva nasledjenu metodu implementiranu u JPanel klasi kako bismo
	 dobili sivu pozadinu panela
	 */
	/*
	 Iscrtavanje elemenata korisnickog interfejsa se vrsi pomocu metoda grafickog konteksta
	 vizuelizacija onoga sto je iscrtano na grafickom kontekstu moguca je koriscenjem
	 vizuelne komponente, kao sto je objekat klase JPanel 
	 */
	public void paint(Graphics g) {
		super.paint(g);
		g.drawRect(100,100, 50, 50);
		g.drawLine(200, 200, 400, 200);
		g.drawRect(300, 300, 70, 70);
		g.drawOval(300, 300, 70, 70);
		
		/*int[] array = new int[10];
		array[0] = 1;*/
		
		Shape[] shapes = new Shape[5];
		
		Point point = new Point(10,10);
		//point.draw(g);
		shapes[0] = point;
		
		Line line = new Line(new Point(40,40), new Point(40,50));
		//line.draw(g);
		shapes[1] = line;
		
		Rectangle rect = new Rectangle(new Point(30,30), 130, 150);
		//rect.draw(g);
		shapes[2] = rect;
		
		Circle circle = new Circle(new Point(80,80), 100);
		//circle.draw(g);
		shapes[3] = circle;
		
		Donut donut = new Donut(new Point(300,300), 100, 140);
		//donut.draw(g);
		shapes[4] = donut;
		
		for(int i=0; i<shapes.length; i++) {
			/* 
			 - Shape kao apstraktna klasa sadrzi deklaraciju draw metode, pa kompajler dozvoljava poziv ove metode
			 nad elementima niza koji je deklarisan kao niz tipa Shape (nije potrebno DOWNCAST-ovanje)
			 - na ovaj nacin postignuto je labavo sprezanje komponenti softvera (fleksibilnost koda
			 koja obezbedjuje da se novi korisnicki zahtevi lakse realizuju)
			*/
			shapes[i].draw(g);
			/*if(shapes[i] instanceof Point) {
				Point p = (Point) shapes[i];
				p.draw(g);
			}else if(shapes[i] instanceof Line) {
				Line l = (Line) shapes[i];
				l.draw(g);
			}else if(shapes[i] instanceof Donut) {
				Donut d = (Donut) shapes[i];
				d.draw(g);
			}else if(shapes[i] instanceof Circle) { //NAPOMENA: provera da li je instanca Donut
				Circle c = (Circle) shapes[i];		//MORA da bude pre provere da li je instanca Circle
				c.draw(g);
			}else if(shapes[i] instanceof Rectangle) {
				Rectangle r = (Rectangle) shapes[i];
				r.draw(g);
			}*/
		}
	}
}
