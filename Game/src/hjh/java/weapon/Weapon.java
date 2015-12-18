package hjh.java.weapon;

import hjh.java.monster.Monster;

public abstract class Weapon {
	private int attackPower;

	public Weapon() {
		// TODO Auto-generated constructor stub
	}

	public Weapon(int attackPower) {
		super();
		this.attackPower = attackPower;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	public void attack(Monster monster) {
		img();
		int bHp = monster.getHp();
		int aHp = bHp - attackPower;
		if (aHp <= 0) {
			System.out.println("으앜!");
			return;
		} else {
			monster.setHp(aHp);
			System.out.println("몬스터HP: " + aHp);
		}
	}

	public abstract void img();

}
