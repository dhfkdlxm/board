package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.BoardVO;

public class SearchAllUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		List<BoardVO> list = service.전체게시글조회서비스();
		
		System.out.println("----------------------------------------------------");
		System.out.println("\t전체 게시글 조회");
		System.out.println("----------------------------------------------------");
		System.out.println("번호\t글쓴이\t등록일\t\t제목");
		
		if(list.size() ==0) {
			System.out.println("\t조회할 게시물이 업습니다.");
		}else {
			for (BoardVO boardVO : list) {
				System.out.println(boardVO.getNo()+"\t"+boardVO.getWriter()+"\t"+ boardVO.getRegDate() + "\t"+  boardVO.getTitle());
			}
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		
	}

}
