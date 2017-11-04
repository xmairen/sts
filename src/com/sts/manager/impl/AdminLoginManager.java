package com.sts.manager.impl;

import java.sql.SQLException;

import com.sts.dao.AdminLoginDAO;
import com.sts.manager.inteface.AdminLoginManagerInterface;
import com.sts.tools.Tools;
import com.sts.vo.AdminVO;

public class AdminLoginManager implements AdminLoginManagerInterface {
	
	
	@Override
	public boolean adminLogin(AdminVO adminVO) throws ClassNotFoundException, SQLException{
		AdminLoginDAO adminLoginDAO = new AdminLoginDAO();
		String password = adminLoginDAO.getPassword(adminVO.getAccount());
		if(!Tools.objectIsNullOrNot(password)){
			if(password.equals(adminVO.getPassword())){
				return true;
			}else{
				return false;
			}
			
		}else{
			return false;
		}
		
		
}
}
