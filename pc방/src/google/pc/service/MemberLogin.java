package google.pc.service;

import java.util.Scanner;

import google.pc.dao.MemberDAO;
import google.pc.main.Client;
import google.pc.model.MemCommand;

public class MemberLogin {
	public void login() {

		Scanner scanner = new Scanner(System.in);
		MemberDAO memberDAO = new MemberDAO();
		MemCommand memCommand = new MemCommand();
		System.out.println("아이디를 입력해주세요.");
		String id = scanner.next();
		System.out.println("비밀번호를 입력해주세요.");
		String passwd = scanner.next();
		memCommand = memberDAO.memberLogin(id, passwd);
		if (memCommand == null) {
			System.out.println("회원정보가 없습니다.");
			Client.main(null);
		}else{
			System.out.println(memCommand.getName() + "님 로그인 되었습니다.");
			
		}
	
	}
}
