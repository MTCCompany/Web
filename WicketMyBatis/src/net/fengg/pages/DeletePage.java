package net.fengg.pages;

import java.io.IOException;
import java.io.Reader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import net.fengg.data.Book;
import net.fengg.data.BookDao;
import net.fengg.data.BookMapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
 
public class DeletePage extends WebPage {
	//========================================================
	// �ϐ���`
	//========================================================
	// ���
	private Form frm1;
	private Form frmHome;
	private Button deleteBtn;
	private Button btnHome;
	// �p�����[�^
	private Book prm;
	
	//========================================================
	// �R���X�g���N�^
	//========================================================
	public DeletePage(){
		this(new Book());
	}
 
	public DeletePage(final Book argPrm){
		
		prm = argPrm;
		
		// �e�t�H�[���̒�`
		frm1 = new Form("frm1");
		frmHome = new Form("frmHome");
		btnHome = new Button("home");
		deleteBtn = new Button("deleteBtn");
		deleteBtn = getDButton();
		btnHome = getHome();
		
		frm1.add(deleteBtn);
		frmHome.add(btnHome);
		add(frm1);
		add(frmHome);
		
		add(new Label("id", String.valueOf(prm.getId())));
		add(new Label("subject", prm.getSubject()));
		add(new Label("type", prm.getType()));
		add(new Label("price", String.valueOf(prm.getPrice())));
		add(new Label("comment", prm.getComment()));
	}
	
	//========================================================
	// �y�[�W�J�ڃ{�^���쐬
	//========================================================
	// �폜�{�^��
	private Button getDButton()
	{
		Button button = new Button("deleteBtn"){
			@Override
			public void onSubmit(){
				Book book = new Book();
				BookDao bookDao = new BookDao();
				
				book = prm;
				
				// update���������s
				bookDao.deleteBook("deleteBook", prm);
				
				setResponsePage(new ResultPage(book));
			}
		};
		return button;
	}
	// �z�[����ʂ֑J��
	private Button getHome()
	{
		Button button = new Button("home"){
			@Override
			public void onSubmit()
			{
				setResponsePage(new ResultPage());
			}
		};
		return button;
	}
}