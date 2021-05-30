package kr.ac.kopo;

import kr.ac.kopo.ui.BoardUI;

public class BoardMain {

	public static void main(String[] args) {

		//변경
		BoardUI ui = new BoardUI();
		try {
			ui.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
