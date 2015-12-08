package google.pc.service;

import java.io.IOException;
import java.util.Scanner;

import google.pc.dao.MemberDAO;
import google.pc.model.MemCommand;

public class MemberJoin {
	public static void join() throws IOException {
		Scanner scanner = new Scanner(System.in);
		MemberDAO memberDAO = new MemberDAO();
		String id = null;
		System.out.println();
		System.out.println("==회원 정보 입력 페이지==");

		System.out.print("아이디: ");
		id = scanner.next();
		System.out.print("비밀번호: ");
		String passwd = scanner.next();
		System.out.print("이름: ");
		String name = scanner.next();
		System.out.print("전화번호: ");
		String cel = scanner.next();
		MemCommand memberCommand = new MemCommand(0, 1, id, passwd, name, cel, "무료사용시간", "유료사용시간", 0, "가입일");
		memberDAO.join(memberCommand);
		return;
	}

	public static void main(String[] args) throws IOException {
		join();
		System.out.println("가입되었mmhjhhhhhh다고??????");
		System.out.println("가입되었다고?");
		System.out.println("testdddddd");
	}
}
