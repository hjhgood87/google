package hjh.java.has;

import hjh.java.service.Ammor;
import hjh.java.service.Weapon;

public class Has implements Weapon, Ammor {
	private int attackPower;
	private int ammor;
	private String name;

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	public String getName() {
		return name;
	}

	public int getAmmor() {
		return ammor;
	}

	public void setAmmor(int ammor) {
		this.ammor = ammor;
	}

	public void setName(String name) {
		this.name = name;
	}
}
