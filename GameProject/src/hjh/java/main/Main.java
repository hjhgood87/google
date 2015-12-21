package hjh.java.main;

import java.util.Scanner;

import hjh.java.ammor.Shoes;
import hjh.java.has.Has;
import hjh.java.job.Person;
import hjh.java.monster.Oak;
import hjh.java.service.Monster;
import hjh.java.weapon.Stone;

public class Main {
	public static void main(String[] args) {
		Monster[] inter = { new Oak() };
		Has[] weapons = { new Stone() };
		Has[] ammors = { new Shoes() };
		Scanner scan = new Scanner(System.in);
		Person person = new Person(weapons, ammors);
		System.out.println("start bettle");
		boolean isTrue = true;
		while (isTrue) {

			System.out.println("1.공격   2.아이템확인 3.인벤토리  4.상태 5. 종료");

			int inpunum = scan.nextInt();

			switch (inpunum) {
			case 1:
				person.personAttack(inter[0]);
				break;
			case 2:
				System.out.println("착용 아이템확인");
				System.out.println(person.getHasWeapon());
				System.out.println(person.getHasAmmor());
				// System.out.println(person.getHasAmmor().getName());
				break;
			case 3:
				System.out.println("인벤토리: ");
				for (int i = 0; i < weapons.length; i++) {
					System.out.println("무기: " + weapons[i]);
					System.out.println("방어구: " + ammors[i].getName());
				}
				break;
			case 4:
				System.out.println("상태: ");
				System.out.println("공격력: " + (person.getAttackPower()));
				System.out.println("방어: " + (person.getAmmor()));

				break;
			case 5:
				isTrue = false;

				break;

			default:
				break;
			}
		}
	}
}
