package hjh.java.main;

import java.util.Scanner;

import hjh.java.ammor.Pants;
import hjh.java.ammor.Shoes;
import hjh.java.has.Has;
import hjh.java.job.Person;
import hjh.java.monster.Oak;
import hjh.java.service.Monster;
import hjh.java.weapon.Stone;
import hjh.java.weapon.Sword;

public class Main {
	public static void main(String[] args) {
		Monster[] inter = { new Oak() };
		Has[] weapons = { new Stone(), new Sword() };
		Has[] ammors = { new Shoes(), new Pants() };
		Scanner scan = new Scanner(System.in);
		Person person = new Person(weapons, ammors);
		System.out.println("start bettle");
		boolean isTrue = true;
		while (isTrue) {

			System.out.println("1.공격   2.아이템확인 3.인벤토리  4.상태  5. 종료");

			int inpunum = Integer.parseInt(scan.nextLine());

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
				System.out.print("무기: ");
				for (int i = 0; i < weapons.length; i++) {
					System.out.print(weapons[i] + ", ");

				}
				System.out.println();
				System.out.print("방어구: ");
				for (int i = 0; i < ammors.length; i++) {

					System.out.print(ammors[i] + ", ");
				}
				System.out.println();
				System.out.println("1. 방어구 교체 2. 무기교체");
				inpunum = Integer.parseInt(scan.nextLine());
				if (inpunum == 1) {
					System.out.print("방어구: ");
					for (int i = 0; i < ammors.length; i++) {

						System.out.print(ammors[i] + ", ");
					}
					inpunum = Integer.parseInt(scan.nextLine());
					person.setHasAmmor(ammors[inpunum]);

				}
				System.out.println(person.getHasAmmor());
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
		scan.close();
	}
}
