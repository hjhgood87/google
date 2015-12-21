package hjh.java.weapon;

import hjh.java.has.Has;
import hjh.java.service.Weapon;

public class Stone extends Has implements Weapon {

	private int attackPower = STONE_ATTACK_POWER;
	private String name = STONE_NAME;

	public Stone() {

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
