package hjh.java.job;

import hjh.java.has.Has;
import hjh.java.service.Ammor;
import hjh.java.service.Item;
import hjh.java.service.Job;
import hjh.java.service.Monster;
import hjh.java.service.Weapon;

public class Person implements Job {
	private Has[] weapons = null;
	private Has[] ammors = null;
	private Item[] items = null;
	private Has hasWeapon = null;
	private Has hasAmmor = null;
	private Item hasItem = null;
	private int miss = 0;
	private int hp = PERSON_HP;
	private int attackPower = PERSON_ATTACK_POWER;
	private int ammor = PERSON_AMMOR;

	public Person(Has[] weapons, Has[] ammors) {
		hasWeapon = weapons[0];
		hasAmmor = ammors[0];
		if (hasWeapon == null) {
			attackPower += hasWeapon.getAttackPower();
		} else {
			attackPower += hasWeapon.getAttackPower();
		}

		if (hasAmmor == null) {
			ammor += hasAmmor.getAmmor();
		} else {
			ammor += hasAmmor.getAmmor();
		}

	}

	public int getAmmor() {
		return ammor;
	}

	public void setAmmor(int ammor) {
		this.ammor = ammor;
	}

	public Weapon[] getWeapons() {
		return weapons;
	}

	public void setWeapons(Has[] weapons) {
		this.weapons = weapons;
	}

	public Ammor[] getAmmors() {
		return ammors;
	}

	public void setAmmors(Has[] ammors) {
		this.ammors = ammors;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public Weapon getHasWeapon() {
		return hasWeapon;
	}

	public void setHasWeapon(Has hasWeapon) {
		this.hasWeapon = hasWeapon;
	}

	public Ammor getHasAmmor() {
		return hasAmmor;
	}

	public void setHasAmmor(Has hasAmmor) {
		this.hasAmmor = hasAmmor;
	}

	public Item getHasItem() {
		return hasItem;
	}

	public void setHasItem(Item hasItem) {
		this.hasItem = hasItem;
	}

	public int getMiss() {
		return miss;
	}

	public void setMiss(int miss) {
		this.miss = miss;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	@Override
	public void personAttack(Monster monster) {
		monster.setHp(monster.getHp() - attackPower);
		System.out.println("몬스터 HP:" + monster.getHp());

	}

	@Override
	public void monsterAttack(Job job) {
	}

}
