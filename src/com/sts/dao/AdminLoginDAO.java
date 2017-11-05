package com.sts.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;

public class AdminLoginDAO extends BasicDAO{

	public String getPassword(String account) throws ClassNotFoundException, SQLException{
		String sql = "select password from admin where account = ?";
		PreparedStatement pstm = getPreparedStatement(sql);
		pstm.setString(1, account);
		ResultSet rs = pstm.executeQuery();
		String password = "";
		while(rs.next()){
			password = rs.getString("password");
		}
		this.closeConnection();
		return password;
	}
}
