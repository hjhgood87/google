package hjh.java.monster;

import hjh.java.person.Hero;

public class Ouger extends Monster {
	private int hp = 100;
	private Hero hero;
	private Monster monster;

	public Ouger(int i) {
		hp = i;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void attack(Hero hero) {
		monster.attack(hero);
	}

	@Override
	public void img() {
		System.out.println("나는 오우거다!");

	}

}
