package net.fengg.data;

import net.fengg.pages.PagePrm;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class BookDao {
	//========================================================
	// �ϐ���`
	//========================================================
	public static final String MAX_ID   = "selectMaxId";
	public static final String SEL_ALL  = "selectBookAll";
	public static final String SEL_ID   = "selectBook";
	public static final String INS_BOOK = "insertBook";
	public static final String UDT_BOOK = "updateBook";
	public static final String DEL_BOOK = "deleteBook";
	
	private Book book = new Book();
	private List<Book> bookList;
	private PagePrm prm = new PagePrm();
	
	//==========================================================
	// ���\�b�h���FselectBook
	// �����@�@  �FString strSql = SQL��ID��
	// �@�@�@�@�@�@�@�FBook Prm = SQL���s�p�̃p�����[�^
	// �߂�l�@  :�Ȃ�
	// ���l�@�@  �Fbook�e�[�u������select����
	//==========================================================
	public void selectBook(String strSql, Book Prm){
		// �Z�b�V�����J�n
		SqlSession session = DBConnection.getSessionFactory().openSession();
		BookMapper bookMap = session.getMapper(BookMapper.class);
		
		if(strSql.equals(SEL_ALL)){
			this.bookList = bookMap.selectBookAll();
		}else if(strSql.equals(SEL_ID)){
			this.book = bookMap.selectBook(Prm.getId());
		}else if(strSql.equals(MAX_ID)){
			this.book = bookMap.selectMaxId();
		}

		// �Z�b�V�������N���[�Y
		session.close();
	}
	
	//==========================================================
	// ���\�b�h���FinsertBook
	// �����@�@  �FString strSql = SQL��ID��
	// �@�@�@�@�@�@�@�FBook Prm = SQL���s�p�̃p�����[�^
	// �߂�l�@  :�Ȃ�
	// ���l�@�@  �Fbook�e�[�u����1���R�[�h�ǉ�
	//==========================================================
	public void insertBook(String strSql, Book prm){
		// �Z�b�V�����J�n
		SqlSession session = DBConnection.getSessionFactory().openSession();
		BookMapper bookMap = session.getMapper(BookMapper.class);
		
		// insert�����̎��s
		bookMap.insertBook(prm);
		
		session.commit();
		
		// �Z�b�V�������N���[�Y
		session.close();
	}
	
	
	//==========================================================
	// ���\�b�h���FupdateBook
	// �����@�@  �FString strSql = SQL��ID��
	// �@�@�@�@�@�@�@�FBook Prm = SQL���s�p�̃p�����[�^
	// �߂�l�@  :�Ȃ�
	// ���l�@�@  �Fbook���̃A�b�v�f�[�g
	//==========================================================
	public void updateBook(String strSql, Book prm){
		// �Z�b�V�����J�n
		SqlSession session = DBConnection.getSessionFactory().openSession();
		BookMapper bookMap = session.getMapper(BookMapper.class);
		
		// insert�����̎��s
		bookMap.updateBook(prm);
		
		session.commit();
		
		// �Z�b�V�������N���[�Y
		session.close();
	}
	
	//==========================================================
	// ���\�b�h���FdeleteBook
	// �����@�@  �FString strSql = SQL��ID��
	// �@�@�@�@�@�@�@�FBook Prm = SQL���s�p�̃p�����[�^
	// �߂�l�@  :�Ȃ�
	// ���l�@�@  �Fbook���̃A�b�v�f�[�g
	//==========================================================
	public void deleteBook(String strSql, Book prm){
		// �Z�b�V�����J�n
		SqlSession session = DBConnection.getSessionFactory().openSession();
		BookMapper bookMap = session.getMapper(BookMapper.class);
		
		// insert�����̎��s
		bookMap.deleteBook(prm.getId());
		
		session.commit();
		
		// �Z�b�V�������N���[�Y
		session.close();
	}
	
	//========================================================
	// get/set��`
	//========================================================
	public Book getBook(){ return this.book; }
	public void setBook(Book book){ this.book = book; }
	public List<Book> getBookList(){ return this.bookList; }
	public void setBookList(List<Book> bookList){ this.bookList = bookList; }
}