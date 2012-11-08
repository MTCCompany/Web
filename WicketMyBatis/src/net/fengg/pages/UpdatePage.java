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
 
public class UpdatePage extends WebPage {
	//========================================================
	// 変数定義
	//========================================================
	// 画面
	private Form frm1;
	private Form frmHome;
	private TextField txtSubject;
	private List<String> typeList;
	private DropDownChoice cmbType;
	private TextField txtPrice;
	private TextArea txtComment;
	private Button btnLButton;
	private Button btnHome;
	// パラメータ
	private Book prm;
	
	//========================================================
	// コンストラクタ
	//========================================================
	public UpdatePage(){
		this(new Book());
	}
 
	public UpdatePage(final Book argPrm){
		
		prm = argPrm;
		
		// 各フォームの定義
		frm1 = new Form("frm1", new CompoundPropertyModel(prm));
		frmHome = new Form("frmHome");
		btnHome = new Button("home");
		btnHome = getHome();
		frmHome.add(btnHome);
		
		add(frm1);
		add(frmHome);
		
		// subject入力フィールド
		txtSubject = new TextField("subject");
		//txtSubject.setRequired(true);
		frm1.add(txtSubject);
		// typeリスト
		List<String> typeList = new ArrayList<String>();
		typeList.add("Essay");
		typeList.add("Documentary");
		typeList.add("Science Fiction");
		typeList.add("Romance");
		typeList.add("Fantasy");
		cmbType = new DropDownChoice("type", typeList );
		//cmbType.setRequired(true);
		frm1.add(cmbType);
		// price入力フィールド
		txtPrice = new TextField("price");
		//txtPrice.setRequired(true);
		frm1.add(txtPrice);
		// comment入力フィールド
		txtComment = new TextArea("comment");
		//txtComment.setRequired(true);
		frm1.add(txtComment);
		// 
		btnLButton = new Button("lButton");
		btnLButton = getLButton();
		frm1.add(btnLButton);
		
		add(new Label("id", String.valueOf(prm.getId())));
		add(new Label("subject", prm.getSubject()));
		add(new Label("type", prm.getType()));
		add(new Label("price", String.valueOf(prm.getPrice())));
		add(new Label("comment", prm.getComment()));
	}
	
	//========================================================
	// ページ遷移ボタン作成
	//========================================================
	// 更新ボタン
	private Button getLButton()
	{
		Button button = new Button("lButton"){
			@Override
			public void onSubmit(){
				Book book = new Book();
				BookDao bookDao = new BookDao();
				
				// update処理を実行
				bookDao.updateBook("updateBook", prm);
				
				setResponsePage(new ResultPage(prm));
			}
		};
		return button;
	}
	// ホーム画面へ遷移
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