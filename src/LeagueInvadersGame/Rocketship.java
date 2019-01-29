package LeagueInvadersGame;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{
	
int speed;
boolean up = false;
boolean down = false;
boolean left = false;
boolean right = false;

	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 5;
		// TODO Auto-generated constructor stub
	}
	
	void update() {
		if(up) {
		y -= speed;
		}
		else if (down) {
			y += speed;
		}
		else if (left) {
			x -= speed;
		}
		else if (right) {
			x += speed;
		}
	}
	
	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}

}
