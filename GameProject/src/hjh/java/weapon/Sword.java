package hjh.java.weapon;

import hjh.java.has.Has;
import hjh.java.service.Weapon;

public class Sword extends Has implements Weapon {

	private int attackPower = SWORD_ATTACK_POWER;
	private String name = SWORD_NAME;

	public Sword() {

	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
