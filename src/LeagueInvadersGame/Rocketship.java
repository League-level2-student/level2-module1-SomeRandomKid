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
		 super.update();
		if(up) {
		y -= speed;
		}
		if (down) {
			y += speed;
		}
		if (left) {
			x -= speed;
		}
		if (right) {
			x += speed;
		}
		if (x < 0) {
			x = 0;
		}
		if (x > 450) {
			x = 450;
		}
		if (y < 0) {
			y = 0;
		}
		if (y > 730) {
			y = 730;
		}
	}
	
	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}

}
