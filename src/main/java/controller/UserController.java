package controller;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import user.domain.User;

public class UserController {

	public static void main(String[] args) throws Exception {
		
		InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
		SqlSession session = sqlSessionFactory.openSession();
 		User user = session.selectOne("getUserById","123");
		
		System.out.println(user.toString());
	}
	
}
