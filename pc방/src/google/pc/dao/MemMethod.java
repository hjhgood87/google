package google.pc.dao;

public class MemMethod {
	public void memnuList(String menu[]) {
		for (int i = 0; i < menu.length; i++) {
			System.out.print(i + 1 + ". " + menu[i] + "\t");
		}
		System.out.println();
	}
}
