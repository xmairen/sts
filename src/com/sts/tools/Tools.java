package com.sts.tools;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.sts.dao.AdminLoginDAO;

public class Tools {
	
	public static void main(String[] args){
		AdminLoginDAO adminDAO = new AdminLoginDAO();
		try {
			String password = adminDAO.getPassword("admin");
			System.out.println("admin password is "+ password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static boolean objectIsNullOrNot(Object object){
		boolean result = false;
		if(object==null){
			return true;
		}
		if(object instanceof String && ((String)object).trim()==""){
			return true;
		}
		if(object instanceof List && ((List)object).size()==0){
			return true;
		}
		if(object instanceof Map && ((Map)object).size()==0){
			return true;
		}
		return result;
	}
	
	public HttpSession getSession(HttpServletRequest request){
		return request.getSession();
	}

}
