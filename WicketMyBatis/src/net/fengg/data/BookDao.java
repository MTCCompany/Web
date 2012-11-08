package net.fengg.data;

import net.fengg.pages.PagePrm;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class BookDao {
	//========================================================
	// 変数定義
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
	// メソッド名：selectBook
	// 引数　　  ：String strSql = SQLのID名
	// 　　　　　　　：Book Prm = SQL実行用のパラメータ
	// 戻り値　  :なし
	// 備考　　  ：bookテーブルからselect処理
	//==========================================================
	public void selectBook(String strSql, Book Prm){
		// セッション開始
		SqlSession session = DBConnection.getSessionFactory().openSession();
		BookMapper bookMap = session.getMapper(BookMapper.class);
		
		if(strSql.equals(SEL_ALL)){
			this.bookList = bookMap.selectBookAll();
		}else if(strSql.equals(SEL_ID)){
			this.book = bookMap.selectBook(Prm.getId());
		}else if(strSql.equals(MAX_ID)){
			this.book = bookMap.selectMaxId();
		}

		// セッションをクローズ
		session.close();
	}
	
	//==========================================================
	// メソッド名：insertBook
	// 引数　　  ：String strSql = SQLのID名
	// 　　　　　　　：Book Prm = SQL実行用のパラメータ
	// 戻り値　  :なし
	// 備考　　  ：bookテーブルへ1レコード追加
	//==========================================================
	public void insertBook(String strSql, Book prm){
		// セッション開始
		SqlSession session = DBConnection.getSessionFactory().openSession();
		BookMapper bookMap = session.getMapper(BookMapper.class);
		
		// insert処理の実行
		bookMap.insertBook(prm);
		
		session.commit();
		
		// セッションをクローズ
		session.close();
	}
	
	
	//==========================================================
	// メソッド名：updateBook
	// 引数　　  ：String strSql = SQLのID名
	// 　　　　　　　：Book Prm = SQL実行用のパラメータ
	// 戻り値　  :なし
	// 備考　　  ：book情報のアップデート
	//==========================================================
	public void updateBook(String strSql, Book prm){
		// セッション開始
		SqlSession session = DBConnection.getSessionFactory().openSession();
		BookMapper bookMap = session.getMapper(BookMapper.class);
		
		// insert処理の実行
		bookMap.updateBook(prm);
		
		session.commit();
		
		// セッションをクローズ
		session.close();
	}
	
	//==========================================================
	// メソッド名：deleteBook
	// 引数　　  ：String strSql = SQLのID名
	// 　　　　　　　：Book Prm = SQL実行用のパラメータ
	// 戻り値　  :なし
	// 備考　　  ：book情報のアップデート
	//==========================================================
	public void deleteBook(String strSql, Book prm){
		// セッション開始
		SqlSession session = DBConnection.getSessionFactory().openSession();
		BookMapper bookMap = session.getMapper(BookMapper.class);
		
		// insert処理の実行
		bookMap.deleteBook(prm.getId());
		
		session.commit();
		
		// セッションをクローズ
		session.close();
	}
	
	//========================================================
	// get/set定義
	//========================================================
	public Book getBook(){ return this.book; }
	public void setBook(Book book){ this.book = book; }
	public List<Book> getBookList(){ return this.bookList; }
	public void setBookList(List<Book> bookList){ this.bookList = bookList; }
}