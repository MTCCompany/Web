package net.fengg.pages;

import java.io.Serializable;
import java.util.Date;

public class PagePrm implements Serializable {
	//========================================================
	// �萔��`
	//========================================================
	public static final String ID_COL = "id";
	public static final String SU_COL = "subject";
	public static final String PR_COL = "price";
	public static final String TY_COL = "type";
	public static final String CO_COL = "comment";
	
	//========================================================
	// �ϐ���`
	//========================================================
	private int searchKey;				// �����L�[
	private int id;						// �p�����[�^�FId
	private String subject;				// �p�����[�^�FSubject
	private String type;				// �p�����[�^�FType
	private int price;					// �p�����[�^�FDate
	private String comment;				// �p�����[�^�FComment
	private int deleteId;				// �폜ID
	
	//========================================================
	// get/set��`
	//========================================================
	// �����L�[
	public int getSearchKey(){ return this.searchKey; }
	public void setSearchKey(int searchKey){ this.searchKey = searchKey; }
	// �p�����[�^�FId
	public int getId(){ return this.id; }
	public void setId(int id){ this.id = id; }
	// �p�����[�^�FName
	public String getSubject(){ return this.subject; }
	public void setSubject(String subject){ this.subject = subject; }
	// �p�����[�^�FAge
	public String getType(){ return this.type; }
	public void setType(String type){ this.type = type; }
	// �p�����[�^�FPrice
	public int getPrice(){ return this.price; }
	public void setPrice(int price){ this.price = price; }
	// �p�����[�^�FComment
	public String getComment(){ return this.comment; }
	public void setComment(String comment){ this.comment = comment; }
	// �폜ID
	public int getDeleteId(){ return this.deleteId; }
	public void setDeleteId(int deleteId){ this.deleteId = deleteId; }
}



