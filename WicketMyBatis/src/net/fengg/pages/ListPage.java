package net.fengg.pages;

import net.fengg.data.Book;
import net.fengg.data.BookDao;
import net.fengg.data.BookMapper;
import java.io.IOException;
import java.io.Reader;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.ReuseIfModelsEqualStrategy;
import org.apache.wicket.markup.html.form.Radio;
import org.apache.wicket.markup.html.form.RadioGroup;
import org.apache.wicket.ajax.markup.html.navigation.paging.AjaxPagingNavigator;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.Model;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.TextArea;


public class ListPage extends WebPage{
	//========================================================
	// �ϐ���`
	//========================================================
	// ���
	private Form frm1;
	private Form frmHome;
	private Button btnHome;
	private ListView view;
	
	// �p�����[�^
	private Book prm;

	//========================================================
	// �R���X�g���N�^
	//========================================================
	public ListPage(){
		// �e�t�H�[���̒�`
		frm1 = new Form("frm1");
		frmHome = new Form("frmHome");
		btnHome = new Button("home");
		btnHome = getHome();
		frmHome.add(btnHome);
		
		add(frm1);
		add(frmHome);
		
		
		Book book = new Book();
		BookDao bookDao = new BookDao();
		bookDao.selectBook("selectBookAll", book);
		
		List<Book> bookList = bookDao.getBookList();
		
		// ���X�g�̒�`
		view = getView(bookList);
		
		frm1.add(view);
		
	}
	
	//========================================================
	// book�ꗗ���X�g�̍쐬
	//========================================================
	private ListView getView(List<Book> bookList){
		ListView view = new ListView("bookTable", bookList){
			@Override
			protected void populateItem(ListItem item){
				final Book listPrm = (Book) item.getModelObject();
				item.setModel(new CompoundPropertyModel(listPrm));
				// ���X�g���̃A�C�e����ǉ�
				item.add(new Label("id"));
				item.add(new Label("subject"));
				item.add(new Label("price"));
				item.add(new Label("type"));
				item.add(new Label("comment"));
				item.add(new Button("updateBtn"){
					@Override
					public void onSubmit(){
						setResponsePage(new UpdatePage(listPrm));
					}
				});
				item.add(new Button("deleteBtn"){
					@Override
					public void onSubmit(){
						setResponsePage(new DeletePage(listPrm));
					}
				});
			}
		};
		return view;
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
//	// �X�V�{�^������������
//	private Button getUButton()
//	{
//		Button button = new Button("updateBtn"){
//			@Override
//			public void onSubmit(){
//				setResponsePage(new UpdatePage(prm));
//			}
//		};
//		return button;
//	}
//	// �폜�{�^������������
//	private Button getDButton()
//	{
//		Button button = new Button("updateBtn"){
//			@Override
//			public void onSubmit(){
//				setResponsePage(new DeletePage(prm));
//			}
//		};
//		return button;
//	}
}


