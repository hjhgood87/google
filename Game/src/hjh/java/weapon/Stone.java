package hjh.java.weapon;

public class Stone extends Weapon {

	public Stone() {
	}

	@Override
	public String toString() {
		return "짱돌을 든다.";
	}

	public Stone(int attackPower) {
		super(attackPower);
	}

	@Override
	public void img() {
		System.out.println("짱돌로 찍어");
	}
}
