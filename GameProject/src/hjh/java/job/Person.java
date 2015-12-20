package hjh.java.job;

import hjh.java.service.Monster;
import hjh.java.service.Weapon;

public class Person extends Job{
	public Person(Weapon[] weapons){
		hp=2000;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Monster mon) {
		System.out.println(mon.getHp());
		mon.setHp(mon.getHp()-hasWeapon.getAttackPower());
		System.out.println(mon.getHp());
	}
	@Override
	public void monsterAttack(Job job) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
