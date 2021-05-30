package kr.ac.kopo.service;

public class BoardSequence {
	private static int no = 1;
	
	
	//synchronized - 동기화걸어줌 
	public static synchronized int getNo() {
		return BoardSequence.no++;
	}
}
