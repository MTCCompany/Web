package net.fengg.pages;

import java.io.IOException;
import java.io.Reader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
 
public class InsertPage extends WebPage {
	//========================================================
	// �ϐ���`
	//========================================================
	// ���
	private Form form1;
	private Form form2;
	private Button btnHome;
	private TextField txtId;
	private TextField txtSubject;
	private List<String> typeList;
	private DropDownChoice cmbType;
	private TextField txtPrice;
	private TextArea txtComment;
	private TextField txtDeleteId;
	private Button btnIButton;
	// �p�����[�^
	private Book prm;
	
	public InsertPage(){
		this(new Book());
	}
 
	//========================================================
	// �R���X�g���N�^
	//========================================================
	public InsertPage(final Book argPrm){
		
		prm = argPrm;
		
		// �e�t�H�[���̒�`
		form1 = new Form("frm1", new CompoundPropertyModel(prm));
		form2 = new Form("frmHome");
		btnHome = new Button("home");
		btnHome = getHome();
		form2.add(btnHome);
		
		add(form1);
		add(form2);
		
		//========================================================
		// ��ʃR���|�[�l���g�쐬�E�ǉ�
		//========================================================
		// subject���̓t�B�[���h
		txtSubject = new TextField("subject");
		//txtSubject.setRequired(true);
		form1.add(txtSubject);
		// type���X�g
		List<String> typeList = new ArrayList<String>();
		typeList.add("Essay");
		typeList.add("Documentary");
		typeList.add("Science Fiction");
		typeList.add("Romance");
		typeList.add("Fantasy");
		cmbType = new DropDownChoice("type", typeList );
		//cmbType.setRequired(true);
		form1.add(cmbType);
		// price���̓t�B�[���h
		txtPrice = new TextField("price");
		//txtPrice.setRequired(true);
		form1.add(txtPrice);
		// comment���̓t�B�[���h
		txtComment = new TextArea("comment");
		//txtComment.setRequired(true);
		form1.add(txtComment);
		// �o�^�{�^��
		btnIButton = new Button("iButton");
		btnIButton = getIButton();
		form1.add(btnIButton);
	}
	
	//========================================================
	// �y�[�W�J�ڃ{�^���쐬
	//========================================================
	// �o�^�{�^������������
	private Button getIButton()
	{
		Button button = new Button("iButton"){
			@Override
			public void onSubmit(){
				Book book = new Book();
				BookDao bookDao = new BookDao();
				
				bookDao.selectBook("selectMaxId", book);
				
				book = bookDao.getBook();
				
				book.setId(book.getId() + 1);
				prm.setId(book.getId());
				book.setSubject(prm.getSubject());
				book.setPrice(prm.getPrice());
				book.setType(prm.getType());
				book.setComment(prm.getComment());
				
				// 
				bookDao.insertBook("insertBook", book);
				
				setResponsePage(new ResultPage(prm));
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
				setResponsePage(new MainPage());
			}
		};
		return button;
	}
}