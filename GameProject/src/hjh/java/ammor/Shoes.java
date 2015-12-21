package hjh.java.ammor;

import hjh.java.has.Has;
import hjh.java.service.Action;
import hjh.java.service.Ammor;
import hjh.java.service.Job;
import hjh.java.service.Monster;

public class Shoes extends Has implements Action {
	private int ammor = SHOES_AMOR;
	private String name = SHOES_NAME;

	public Shoes() {

	}

	public int getAmmor() {
		return ammor;
	}

	public void setAmmor(int ammor) {
		this.ammor = ammor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public void personAttack(Monster monsterInter) {
	}

	@Override
	public void monsterAttack(Job job) {
	}

}
