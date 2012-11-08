/*-------------------------------------------------------------------------------
�@* �V�X�e�����́@�Fwicket+mybatis���g�p�����T���v���v���O����
�@* �t�@�C���h�c�@�FUserMapper
�@* �t�@�C�����́@�FUserMapper.java
�@* �@�\�T�v�@�@�@�F�e�[�u���uUserMapper�v�̃f�[�^�i�[�p
�@*
�@* ���������@�@�@�F
�@*
�@*-------------------------------------------------------------------------------
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