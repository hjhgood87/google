package hjh.java.main;

import java.util.Scanner;

import hjh.java.monster.Monster;
import hjh.java.monster.Oak;
import hjh.java.monster.Ouger;
import hjh.java.person.Hero;
import hjh.java.weapon.Spear;
import hjh.java.weapon.Stone;
import hjh.java.weapon.Weapon;
import hjh.java.weapon.water;

public class Main {
	public static void main(String[] args) {
		Monster[] monster = { new Oak(20), new Ouger(10) };
		Weapon[] weapons = { new Spear(10), new Stone(99), new water(15) };
		Hero hero = new Hero(weapons, 500);

		Scanner s = new Scanner(System.in);

		int mon = (int) (Math.random() * monster.length - 1) + 1;
		Monster ranmon = monster[mon];

		while (ranmon.getHp() >= 0) {
			System.out.println("무기를 선택하세요");
			for (int i = 0; i < weapons.length; i++) {
				System.out.print((i + 1) + "." + weapons[i] + " ");
			}
			int inputNum = s.nextInt();
			hero.chageWeapon(inputNum - 1);
			hero.attack(ranmon);
			ranmon.attack(hero);
		}

	}
}
