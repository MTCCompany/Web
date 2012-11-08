package net.fengg.pages;

import java.io.Serializable;
import java.util.Date;

public class PagePrm implements Serializable {
	//========================================================
	// 定数定義
	//========================================================
	public static final String ID_COL = "id";
	public static final String SU_COL = "subject";
	public static final String PR_COL = "price";
	public static final String TY_COL = "type";
	public static final String CO_COL = "comment";
	
	//========================================================
	// 変数定義
	//========================================================
	private int searchKey;				// 検索キー
	private int id;						// パラメータ：Id
	private String subject;				// パラメータ：Subject
	private String type;				// パラメータ：Type
	private int price;					// パラメータ：Date
	private String comment;				// パラメータ：Comment
	private int deleteId;				// 削除ID
	
	//========================================================
	// get/set定義
	//========================================================
	// 検索キー
	public int getSearchKey(){ return this.searchKey; }
	public void setSearchKey(int searchKey){ this.searchKey = searchKey; }
	// パラメータ：Id
	public int getId(){ return this.id; }
	public void setId(int id){ this.id = id; }
	// パラメータ：Name
	public String getSubject(){ return this.subject; }
	public void setSubject(String subject){ this.subject = subject; }
	// パラメータ：Age
	public String getType(){ return this.type; }
	public void setType(String type){ this.type = type; }
	// パラメータ：Price
	public int getPrice(){ return this.price; }
	public void setPrice(int price){ this.price = price; }
	// パラメータ：Comment
	public String getComment(){ return this.comment; }
	public void setComment(String comment){ this.comment = comment; }
	// 削除ID
	public int getDeleteId(){ return this.deleteId; }
	public void setDeleteId(int deleteId){ this.deleteId = deleteId; }
}



