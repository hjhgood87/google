package hjh.java.monster;

import hjh.java.person.Hero;

public class Oak extends Monster {
	private int hp = 100;
	private Hero hero;

	public Oak(int i) {
		super();
		this.hp = i;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void attack(Hero hero) {
		int attackPower = (int) (Math.random() * 100) + 1;
		hero.setHp(hero.getHp() - attackPower);

		if (hero.getHp() <= 0) {
			System.out.println("Game Over");
			return;
		} else {
			System.out.println("히어로의 HP: " + hero.getHp());
		}
	}

	@Override
	public void img() {
		System.out.println("나는 오크다!");

	}

}
