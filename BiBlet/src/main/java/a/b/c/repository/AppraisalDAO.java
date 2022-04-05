package a.b.c.repository;

import java.util.List;

import a.b.c.model.AppraisalVO;
import a.b.c.model.BookInfoVO;

public interface AppraisalDAO {
	public List<BookInfoVO> findAllBook();	//전체 도서 목록 
	public BookInfoVO bookDetail(String isbn);	//도서 상세보기
	public void writeComment(AppraisalVO appraisal);	//평가(코멘트) 작성
	
}
