package com.sdbi.service.impi;

import java.sql.SQLException;

import com.sdbi.dao.UserDao;
import com.sdbi.dao.impi.UserDaoImpl;
import com.sdbi.domain.User;
import com.sdbi.service.UserService;

public class UserServiceImpi implements UserService{

	@Override
	//ҵ����û���ע��ķ���:
	public void regist(User user) throws SQLException {
		// �����ݴ������ݿ�
		UserDao userDao = new UserDaoImpl();
		userDao.regist(user);
		//����һ�⼤���ʼ�
		
	}

}
