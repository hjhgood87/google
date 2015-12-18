package hjh.java.weapon;

public class water extends Weapon {

	public water() {
	}

	public water(int attackPower) {
		super(attackPower);
	}

	@Override
	public String toString() {
		return "분무기로 교체!";
	}

	@Override
	public void img() {
		System.out.println("분무기 발사!");
	}
}
