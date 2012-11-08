package net.fengg.data;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.wicket.RestartResponseException;

public class DBConnection {
	private static DBConnection sqlFactory = null;
	private static SqlSessionFactory sessionFactory = null;
 
	private DBConnection() {
	}
 
    /*-------------------------------------------------------------------------------
	　* 機能概要　：インスタンス生成
	　* 引数　　　：
	　* 戻り値　　：生成したインスタンス情報を渡す
	　* 備考　　　：
	　*-------------------------------------------------------------------------------
	*/
	private static DBConnection getInstance() {
		String resource = null;
		Reader reader = null;
        try {
            if(sqlFactory == null) {
                resource = "net/fengg/data/sqlMap.xml";
                reader = Resources.getResourceAsReader(resource);

                sqlFactory = new DBConnection();
                sqlFactory.sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            }
        }catch(Exception e)
        {
//            throw new RestartResponseException(new ErrorPage(e));
        }
        return sqlFactory;
	}
 
    /*-------------------------------------------------------------------------------
	　* 機能概要　：セッションファクトリを渡す
	　* 引数　　　：
	　* 戻り値　　：セッションファクトリを渡す
	　* 備考　　　：
	　*-------------------------------------------------------------------------------
	*/
	public static synchronized SqlSessionFactory getSessionFactory(){
		if(sqlFactory == null) {
			getInstance();
		}
		return sessionFactory;
	}
 
    @Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}