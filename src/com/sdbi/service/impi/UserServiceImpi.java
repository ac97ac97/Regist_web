package com.sdbi.service.impi;

import java.sql.SQLException;

import com.sdbi.dao.UserDao;
import com.sdbi.dao.impi.UserDaoImpl;
import com.sdbi.domain.User;
import com.sdbi.service.UserService;

public class UserServiceImpi implements UserService{

	@Override
	//业务层用户的注册的方法:
	public void regist(User user) throws SQLException {
		// 将数据存入数据库
		UserDao userDao = new UserDaoImpl();
		userDao.regist(user);
		//发送一封激活邮件
		
	}

}
