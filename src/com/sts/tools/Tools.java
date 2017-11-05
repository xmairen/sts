package com.sts.tools;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.sts.dao.AdminLoginDAO;
import com.sts.manager.impl.ExamManagerIMP;
import com.sts.vo.ExamAddVO;

public class Tools {
	
	public static void main(String[] args){
		ExamManagerIMP que_list = new ExamManagerIMP();
		try {
			List<ExamAddVO> list = que_list.getExamList();
			ExamAddVO vo;
			for(int i=0;i<list.size();i++){
				vo = list.get(i);
				System.out.println(vo.getId());
				System.out.println(vo.getContans());
				System.out.println(vo.getAnswerA());
			}
			
		} catch (ClassNotFoundException | SQLException e) {
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
