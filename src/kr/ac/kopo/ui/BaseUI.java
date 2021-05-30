package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.service.BoardService;
import kr.ac.kopo.service.BoardServiceFactory;

public abstract class BaseUI implements IBoardUI{

	private Scanner sc;
	protected BoardService service;
	public BaseUI() {
		sc = new Scanner(System.in);
		service = BoardServiceFactory.getInstance();
	}

	//문자를 입력받는 메소드
	protected String scanStr(String msg) {
		System.out.println(msg);
		String str = sc.nextLine();
		return str;
	}
	
	//숫자를 입력받는 메소드
	protected int scanInt(String msg) {
		int num = Integer.parseInt(scanStr(msg));
		return num;
	}
	
	
	
	
	
	
	
	
	
	
	
}
