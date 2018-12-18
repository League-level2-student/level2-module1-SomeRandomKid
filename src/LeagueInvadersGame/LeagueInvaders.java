package LeagueInvadersGame;

import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame boi;
	int xValue = 500;
	int yValue = 800;
	GamePanel esketit;
	
	LeagueInvaders() {
		boi = new JFrame();
		esketit = new GamePanel();
		boi.getContentPane();
		boi.setPreferredSize(new Dimension(xValue, yValue));
        boi.pack();
	}
	
	public static void main(String[] args) {
		 LeagueInvaders lil = new LeagueInvaders();
		 lil.setup();
	}
	
	public void setup() {
		boi.add(esketit);
		boi.setVisible(true);
		boi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
