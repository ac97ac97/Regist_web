package com.sdbi.dao;

import java.sql.SQLException;

import com.sdbi.domain.User;

public interface UserDao {

	void regist(User user) throws SQLException;
	

}
