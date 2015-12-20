package hjh.java.monster;

import hjh.java.person.Hero;

public abstract class Monster {
	private int attackPower;

	@Override
	public String toString() {
		return "Monster [attackPower=" + attackPower + ", hp=" + hp + "]";
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	private int hp;

	public Monster() {
		// TODO Auto-generated constructor stub
	}

	public Monster(int attackPower) {
		super();
		this.attackPower = attackPower;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	public void attack(Hero hero) {
		img();
		int attackPower = (int) (Math.random() * 100) + 1;
		hero.setHp(hero.getHp() - attackPower);

		if (hero.getHp() <= 0) {
			System.out.println("Game Over");
			return;
		} else {
			System.out.println("히어로의 HP: " + hero.getHp());
		}
	}

	public abstract void img();

}
