/*-------------------------------------------------------------------------------
　* システム名称　：wicket+mybatisを使用したサンプルプログラム
　* ファイルＩＤ　：UserMapper
　* ファイル名称　：UserMapper.java
　* 機能概要　　　：テーブル「UserMapper」のデータ格納用
　*
　* 改訂履歴　　　：
　*
　*-------------------------------------------------------------------------------
*/
package net.fengg.data;

import java.util.List;

public interface BookMapper {
	//@Select("select * from")
	List<Book> selectBookAll();
	//@Select("select * from book where id = #{id}")
	Book selectBook(int id);
	//@Select idmax
	Book selectMaxId();
	//@Insert
	void insertBook(Book book);
	//@update
	void updateBook(Book book);
	//@delete
	void deleteBook(int id);
}