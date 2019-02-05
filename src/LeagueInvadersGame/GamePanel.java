package LeagueInvadersGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	Timer lol;
	final int Start = 0;
	final int Middle = 1;
	final int End = 2;
	int current = Start;
	Font titleFont;
	Font secondaryFont;
	Rocketship hola = new Rocketship( 250, 700, 50, 50 );
	ObjectManager sicko = new ObjectManager(hola);
	
	GamePanel() {
		lol = new Timer(1000/60, this);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		secondaryFont = new Font("Arial", Font.PLAIN, 24);
	}
	
	public void startGame() {
		lol.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
		if (current == Start) {
			updateStart();
		}
		else if (current == Middle) {
			updateMiddle();
		}
		else if (current == End) {
			updateEnd();
		}
	
	}
	@Override
	public void paintComponent(Graphics g){
		if (current == Start) {
			drawStart(g);
		}
		else if (current == Middle) {
			drawMiddle(g);
		}
		else if (current == End) {
			drawEnd(g);
		}
  
	        }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			current++;
			if (current > End) {
				current = Start;
			}
			
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
				hola.up = true;
			}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			hola.down = true;
		}
		 if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			hola.left = true;
		}
	 if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			hola.right = true;
		}
	}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			hola.up = false;
		}
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			hola.down = false;
		}
		else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			hola.left = false;
		}
		else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
			hola.right = false;
		}
		
	}
	void updateStart() {
		
	}
	void updateMiddle() {
	sicko.update();
	}
	void updateEnd() {
		
	}
	void drawStart(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.xValue, LeagueInvaders.yValue);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("LEAGUE INVADERS", 25, 200);
		g.setFont(secondaryFont);
		g.drawString("Press ENTER to start", 125, 325);
		g.drawString("Press SPACE for intructions", 100, 450);
		
	}
	void drawMiddle(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.xValue, LeagueInvaders.yValue);  
		sicko.draw(g);
	}
	void drawEnd(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.xValue, LeagueInvaders.yValue);
		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("GAME OVER", 100, 200);
		g.setFont(secondaryFont);
		g.drawString("You killed 0 Enemies", 130, 325);
		g.drawString("Press ENTER to restart", 120, 450);

		
	}

}
