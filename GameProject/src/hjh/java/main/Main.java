package hjh.java.main;

import java.util.Scanner;

import hjh.java.job.Person;
import hjh.java.monster.Oak;
import hjh.java.service.Action;
import hjh.java.service.Monster;
import hjh.java.service.Weapon;
import hjh.java.weapon.Stone;

public class Main {
	public static void main(String[] args) {
		Monster[] inter = { new Oak() };
		Weapon[] weapons = { new Stone() };
		Scanner scan = new Scanner(System.in);
		
		Person person = new Person(weapons);
		System.out.println("choise Weapon");
		System.out.println("1.stone   2.누르지마 찌밤바");
		int inpunum = scan.nextInt()-1;
		person.setHasWeapon(weapons[inpunum]);
		System.out.println("start bettle");

		person.attack(inter[0]);

		// System.out.println(inter.getHp());
		// Person person = new Person();
		// WeaponInter[] weapons = { new Stone() };
		// WeaponInter weapon= weapons[0];
		//
		// person.setHasWeapon(weapon);
		// person.getHasWeapon();

	}
}
