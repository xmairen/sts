package com.sts.manager.impl;

import java.sql.SQLException;

import com.sts.dao.ExamDAO;
import com.sts.manager.inteface.ExamAddInterface;
import com.sts.vo.ExamAddVO;

public class ExamAddIMP implements ExamAddInterface{

	public void addExam(ExamAddVO vo) {
		ExamDAO dao = new ExamDAO();
		try {
			dao.addExam(vo);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	}

