package LeagueInvadersGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
	Timer lol;
	
	GamePanel() {
		lol = new Timer(1000/60, this);
	}
	
	public void startGame() {
		lol.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("sucess");
	}

}
