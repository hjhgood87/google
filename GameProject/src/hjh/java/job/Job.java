package hjh.java.job;

import hjh.java.service.Action;
import hjh.java.service.Monster;
import hjh.java.service.Weapon;

public class Job implements Action{


	protected Weapon[] weapons;
	protected String[] ammors;
	protected String[] items;
	protected Weapon hasWeapon;
	protected String hasAmmor;
	protected String hasItem;
	protected int hp;
	protected int miss;
//	private int attackPower;
	
//	public int getAttackPower() {
//		return attackPower;
//	}
//	public void setAttackPower(int attackPower) {
//		this.attackPower = attackPower;
//	}
	
	@Override
	public void attack(Monster monsterInter) {
		// TODO Auto-generated method stub
		
	}
	public Weapon[] getWeapons() {
		return weapons;
	}
	public void setWeapons(Weapon[] weapons) {
		this.weapons = weapons;
	}
	public String[] getAmmors() {
		return ammors;
	}
	public void setAmmors(String[] ammors) {
		this.ammors = ammors;
	}
	public String[] getItems() {
		return items;
	}
	public void setItems(String[] items) {
		this.items = items;
	}
	public Weapon getHasWeapon() {
		return hasWeapon;
	}
	public void setHasWeapon(Weapon hasWeapon) {
		this.hasWeapon = hasWeapon;
	}
	public String getHasAmmor() {
		return hasAmmor;
	}
	public void setHasAmmor(String hasAmmor) {
		this.hasAmmor = hasAmmor;
	}
	public String getHasItem() {
		return hasItem;
	}
	public void setHasItem(String hasItem) {
		this.hasItem = hasItem;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMiss() {
		return miss;
	}
	public void setMiss(int miss) {
		this.miss = miss;
	}
	@Override
	public void monsterAttack(Job job) {
		// TODO Auto-generated method stub
		
	}
	
	
}
