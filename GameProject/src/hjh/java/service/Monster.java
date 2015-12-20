package hjh.java.service;

public abstract class Monster implements Action {
	protected int hp;
	protected int attackPower;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
}
