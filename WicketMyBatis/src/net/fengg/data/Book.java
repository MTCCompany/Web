package net.fengg.data;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
	//========================================================
	// íËêîíËã`
	//========================================================
	public static final String ID_COL = "id";
	public static final String SU_COL = "subject";
	public static final String PR_COL = "price";
	public static final String TY_COL = "type";
	public static final String CO_COL = "comment";
	
	//========================================================
	// ïœêîíËã`
	//========================================================
    private int id;					// ID
    private String subject;			// SUBJECT
    private String type;			// TYPE
    private int price;				// PRICE
    private String comment;			// COMMENT

    public Book() {}
    
    public Book(int id, String subject, String type, int price, String comment) {
        this.id = id;
        this.subject = subject;
        this.type = type;
        this.price = price;
        this.comment = comment;
    }
    
	//========================================================
	// get/setíËã`
	//========================================================
    // ID
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    // SUBJECT
    public String getSubject() { return subject; }
    public void setSubject(String Subject) { this.subject = Subject; }
    // TYPE
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    // Price
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
    // COMMENT
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    @Override
    public String toString() { return "ID: " + id + ", Subject: " + subject + ", Type: " + type 
    		+ ", Price: " + price + ", Comment: " + comment; }
}