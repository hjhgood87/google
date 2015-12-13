package google.pc.main;

import java.io.IOException;
import java.util.Scanner;

import google.pc.dao.MemMethod;
import google.pc.dao.MemberDAO;
import google.pc.service.MemberJoin;

public class Admin {

	public static void main(String[] args, Scanner scanner) {
		// scanner = new Scanner(System.in);
		MemMethod memMethod = new MemMethod();
		String menu1[] = { "멤버관리", "물품관리" };
		memMethod.memnuList(menu1);
		System.out.print("1.멤버관리\t");
		System.out.print("2.물품관리\t");
		System.out.print("3.컴퓨터관리\t");
		System.out.print("4.매출관리\t");
		System.out.println("5.직원관리");

		System.out.println("번호를 선택하세요.");
		System.out.print("번호 입력: ");
		int num = scanner.nextInt();

		System.out.print("1.회원가입");
		System.out.print("2.회원조회");

		System.out.println("번호를 선택하세요.");
		System.out.print("번호 입력: ");

		switch (num) {
		case 1:
			MemberJoin memberJoin = new MemberJoin();
			try {
				memberJoin.join();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			MemberDAO memberDAO = new MemberDAO();
			memberDAO.memberList();

			break;
		}

	}
}
