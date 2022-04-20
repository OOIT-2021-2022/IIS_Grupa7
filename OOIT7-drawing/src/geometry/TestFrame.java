package geometry;

import javax.swing.JFrame;
/*
 * Swing API klase obezbedjuju kreiranje grafickog korisnickog interfejsa aplikacije
 * JFrame klasa obezbedjuje osnovne funkcionalnosti prozora
 * JPanel je kontejner koji predstavlja praznu povrsinu na koju mogu da se dodaju 
 * komponente (JLabel, JTextField, JButton); JPanel moze da posluzi za crtanje grafike
 */

public class TestFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		DrawingPanel panel = new DrawingPanel();
		frame.setBounds(100, 100, 500, 500);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}

}
