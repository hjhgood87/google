package hjh.java.weapon;

public class Spear extends Weapon {

	public Spear() {
	}

	public Spear(int attackPower) {
		super(attackPower);
	}

	@Override
	public String toString() {
		return "창으로 교체";
	}

	@Override
	public void img() {
		System.out.println("창으로 존나 찔러");
	}
}
