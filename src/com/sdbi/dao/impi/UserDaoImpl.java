package com.sdbi.dao.impi;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.sdbi.dao.UserDao;
import com.sdbi.domain.User;
import com.sdbi.utils.JDBCUtils;

public class UserDaoImpl implements UserDao {

	@Override
	// Dao 中保存用户的方法
	public void regist(User user) throws SQLException {

		QueryRunner queryRunner;
		try {
			queryRunner = new QueryRunner(JDBCUtils.getDataSource());
			String sql = "insert into user values(?,?,?,?,?,?,?)";
			Object[] params = { user.getUid(), user.getUsername(), user.getPassword(), user.getNickname(), user.getEmail(),
					user.getState(), user.getCode() };
			queryRunner.update(sql, params);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	
	
	}

}
