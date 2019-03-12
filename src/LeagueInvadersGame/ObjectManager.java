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
	int score = 0;

	ObjectManager(Rocketship r) {
		weeb = r;
	}

	void update() {
		weeb.update();
		for (int i = 0; i < mode.size(); i++) {
			mode.get(i).update();
		}
		for (int i = 0; i < AlienArray.size(); i++) {
			AlienArray.get(i).update();
		}

	}

	void draw(Graphics g) {
		weeb.draw(g);
		for (int i = 0; i < mode.size(); i++) {
			mode.get(i).draw(g);
		}
		for (int i = 0; i < AlienArray.size(); i++) {
			AlienArray.get(i).draw(g);
		}

	}

	void addProjectile(Projectiles p) {
		mode.add(p);
	}

	void addAlien(Aliens a) {
		AlienArray.add(a);
	}

	public void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAlien(new Aliens(new Random().nextInt(LeagueInvaders.xValue), 0, 50, 50));
			enemyTimer = System.currentTimeMillis();

		}
	}

	void purgeObjects() {
		for (int i = 0; i < AlienArray.size(); i++) {
			Aliens purgeAlien = AlienArray.get(i);
			if (purgeAlien.isAlive == false) {
				AlienArray.remove(i);
			}
		}
		for (int i = 0; i < mode.size(); i++) {
			Projectiles purgeProj = mode.get(i);
			if (purgeProj.isAlive == false) {
				mode.remove(i);
			}
		}
	}

	void checkCollision() {
		for (Aliens a : AlienArray) {
			if (weeb.collisionBox.intersects(a.collisionBox)) {
				weeb.isAlive = false;
			}

		}
		for (Projectiles p : mode) {
			for (Aliens a : AlienArray) {
				if (p.collisionBox.intersects(a.collisionBox)) {
					a.isAlive = false;
					p.isAlive = false;
						score++;
				}
			}

		}

	}

	 int getScore() {
		return score;
	}
}
