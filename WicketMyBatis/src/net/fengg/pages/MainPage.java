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

public class MainPage extends WebPage {
	//========================================================
	// �ϐ���`
	//========================================================
	// ���
	private Form form1;
	private Link lnkList;
	private Link lnkNew;
	// ��ʓ���
	private Book prm;
	
	//========================================================
	// �R���X�g���N�^
	//========================================================
	public MainPage(){
		this(new Book());
	}
	
	public MainPage(final Book argPrm) {
		
		prm = argPrm;
		
		//========================================================
		// ��ʃR���|�[�l���g�쐬�E�ǉ�
		//========================================================
		// �e�t�H�[���̒�`
		form1 = new Form("frm1", new CompoundPropertyModel(prm));
		add(form1);
		// book�ꗗ�����N�{�^��
		lnkList = new Link("linkList"){
			public void onClick(){
				setResponsePage(new ListPage());
			}
		};
		add(lnkList);
		
		// book�V�K�o�^�����N�{�^��
		lnkNew = new Link("linkNew"){
			public void onClick(){
				setResponsePage(new InsertPage(prm));
			}
		};
		add(lnkNew);
	}
}