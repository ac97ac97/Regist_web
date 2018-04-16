package com.sdbi.service;

import java.sql.SQLException;

import com.sdbi.domain.User;

public interface UserService {

	void regist(User user) throws SQLException;

}
