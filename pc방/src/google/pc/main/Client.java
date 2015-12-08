package google.pc.main;

import java.io.IOException;
import java.util.Scanner;

import google.pc.dao.MemberDAO;
import google.pc.service.MemberJoin;

public class Client {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("1.회원가입");
		System.out.print("2.회원조회");

		System.out.println("번호를 선택하세요.");
		System.out.print("번호 입력: ");
		int num = scanner.nextInt();

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
