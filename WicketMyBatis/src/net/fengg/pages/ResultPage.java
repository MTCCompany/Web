package net.fengg.pages;

import java.io.IOException;
import java.io.Reader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import net.fengg.data.Book;
import net.fengg.data.BookMapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.CompoundPropertyModel;
 
public class ResultPage extends WebPage {
	//========================================================
	// �ϐ���`
	//========================================================
	// ���
//	private WebPage formerPage;
	private Form form;
	private Button btnHome;
	// �p�����[�^
	private Book prm;
	
	//========================================================
	// �R���X�g���N�^
	//========================================================
	public ResultPage(){
		this(new Book());
	}
 
	public ResultPage(final Book argPrm){
		
		prm = argPrm;
		
		// �e�t�H�[���̒�`
		form = new Form("frm1");
		btnHome = new Button("home");
		btnHome = getHome();
		form.add(btnHome);
		
		add(form);
		
		add(new Label("id", String.valueOf(prm.getId())));
		add(new Label("subject", prm.getSubject()));
		add(new Label("type", prm.getType()));
		add(new Label("price", String.valueOf(prm.getPrice())));
		add(new Label("comment", prm.getComment()));
	}
	
	//========================================================
	// �y�[�W�J�ڃ{�^���쐬
	//========================================================
	// �z�[����ʂ֑J��
	private Button getHome()
	{
		Button button = new Button("home"){
			@Override
			public void onSubmit()
			{
				setResponsePage(new MainPage());
			}
		};
		return button;
	}
}