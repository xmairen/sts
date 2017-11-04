package com.sts.manager.inteface;

import java.sql.SQLException;

import com.sts.vo.AdminVO;

public interface AdminLoginManagerInterface {
	public boolean adminLogin(AdminVO adminVO) throws ClassNotFoundException, SQLException;

}
