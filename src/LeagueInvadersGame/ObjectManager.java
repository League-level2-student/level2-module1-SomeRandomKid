package LeagueInvadersGame;

import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {

	Rocketship weeb;
	ArrayList<Projectiles> mode = new ArrayList<Projectiles>();
	
	ObjectManager(Rocketship r) {
		weeb = r;
	}
	void update() {
		weeb.update();
	}
	void draw(Graphics g) {
		weeb.draw(g);
	}
	
	void addProjectile(Projectiles p) {
		mode.add(p);
	}
}
