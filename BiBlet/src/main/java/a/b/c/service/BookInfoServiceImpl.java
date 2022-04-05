package a.b.c.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import a.b.c.model.AppraisalVO;
import a.b.c.model.BookInfoVO;
import a.b.c.repository.AppraisalDAO;

@Service
public class BookInfoServiceImpl implements BookInfoService {

	private AppraisalDAO appraisalDAO;
	
	// appraisalDAOsetter
	@Autowired
	public void setAppraisalDAO(AppraisalDAO appraisalDAO) {
		this.appraisalDAO = appraisalDAO;
	}

	// 도서 전체 목록
	@Override
	public List<BookInfoVO> findAllBook() {
		return appraisalDAO.findAllBook();
	}

	// 도서 상세보기
	@Override
	public BookInfoVO bookDetail(String isbn) {
		return appraisalDAO.bookDetail(isbn);
	}

	//평가(코멘트) 작성
//	@Override
//	public void writComment(AppraisalVO comment) {
//		return ;
//	}
}
