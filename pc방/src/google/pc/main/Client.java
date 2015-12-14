package google.pc.main;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import google.pc.dao.MemMethod;
import google.pc.dao.MemberDAO;
import google.pc.dao.SalesDAO;
import google.pc.model.SalesCommand;
import google.pc.service.MemberJoin;
import google.pc.service.MemberLogin;

public class Client {
	public static void main(String[] args) {
		int inputno;
		long start = 0;
		long end = 0;
		long real;
		int pay;
		Scanner scanner = new Scanner(System.in);
		MemMethod memMethod = new MemMethod();
		String menu1[] = { "로그인", "회원가입" };
		System.out.println("번호를 선택하세요.");
		System.out.print("번호 입력: ");
		inputno = scanner.nextInt();
		while (true) {
			switch (inputno) {
			case 1:
				MemberLogin memberLogin = new MemberLogin();
				memberLogin.login();
				start = System.currentTimeMillis();
				break;
			case 2:
				MemberJoin memberJoin = new MemberJoin();
				try {
					memberJoin.join();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.exit(0);
				break;
			}
			String menu2[] = { "사용종료", "상품주문", "사용시간보기" };
			memMethod.memnuList(menu2);
			System.out.println("번호를 선택하세요.");
			System.out.print("번호 입력: ");
			inputno = scanner.nextInt();

			switch (inputno) {
			case 1:
				System.out.println("사용종료");
				// System.out.println(new Date());
				end = System.currentTimeMillis();
				real = end - start;
				pay = (int) (real / 1000) * 1000;
				System.out.println(real / 1000 + "초");
				SalesDAO salesDAO = new SalesDAO();
				SalesCommand salesCommand = new SalesCommand(0, "PC", pay, null);
				salesDAO.sales(salesCommand);
				System.exit(0);
				break;
			case 2:
				System.out.println("상품주문");
				break;
			case 3:
				System.out.println("사용시간보기");
				end = System.currentTimeMillis();
				Date startdate = new Date(start);
				Date endDate = new Date(end);
				SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
				String strStartDate = df.format(startdate);
				String strEndDate = df.format(endDate);
				System.out.println(strStartDate + " ~ " + strEndDate);
				break;

			}

		}
	}
}
