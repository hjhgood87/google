package hjh.java.weapon;

public class Sword extends Weapon {

	public Sword() {
	}

	public Sword(int attackPower) {
		super(attackPower);
	}

	@Override
	public String toString() {
		return "검으로 교체!";
	}

	@Override
	public void img() {
		System.out.println("검으로 회침");
	}
}
