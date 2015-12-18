package hjh.java.person;

import hjh.java.monster.Monster;
import hjh.java.weapon.Weapon;

public class Hero {
	public Weapon[] weapons;
	private Weapon hasWeapon;
	private int hp = 100;

	public Hero() {
	}

	public Weapon[] getWeapons() {
		return weapons;
	}

	public void setWeapons(Weapon[] weapons) {
		this.weapons = weapons;
	}

	public Weapon getHasWeapon() {
		return hasWeapon;
	}

	public void setHasWeapon(Weapon hasWeapon) {
		this.hasWeapon = hasWeapon;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Hero(Weapon[] weapons, int Hp) {
		super();
		this.weapons = weapons;
		hasWeapon = weapons[0];
		this.hp = Hp;

	}

	public void attack(Monster monster) {
		hasWeapon.attack(monster);
	}

	public void chageWeapon(int inputNum) {

		if (weapons.length - 1 < inputNum) {
			inputNum = weapons.length - 1;
		}
		hasWeapon = weapons[inputNum];
		System.out.println(hasWeapon);
	}
}
