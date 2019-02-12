package LeagueInvadersGame;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	long enemyTimer = 0;
	int enemySpawnTime = 1000;
	Rocketship weeb;
	ArrayList<Projectiles> mode = new ArrayList<Projectiles>();
	ArrayList<Aliens> AlienArray = new ArrayList<Aliens>();
	
	ObjectManager(Rocketship r) {
		weeb = r;
	}
	void update() {
		weeb.update();
		for(int i = 0; i < mode.size(); i++) {
			mode.get(i).update();
			AlienArray.get(i).update();
		}
		
	}
	void draw(Graphics g) {
		weeb.draw(g);
		for(int i = 0; i < mode.size(); i++) {
			mode.get(i).draw(g);
			AlienArray.get(i).draw(g);
		}
		
	}
	
	void addProjectile(Projectiles p) {
		mode.add(p);
	}
	void addAlien(Aliens a) {
		AlienArray.add(a);
	}
		public void manageEnemies(){
	        if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
	                addAlien(new Aliens(new Random().nextInt(LeagueInvaders.xValue), 0, 50, 50));
	enemyTimer = System.currentTimeMillis();
	       
	}
	}
}
