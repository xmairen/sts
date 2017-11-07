package com.sts.manager.impl;

import java.sql.SQLException;
import java.util.List;

import com.sts.dao.ExamDAO;
import com.sts.manager.inteface.ExamManagerInterface;
import com.sts.vo.ExamAddVO;

public class ExamManagerIMP implements ExamManagerInterface{
	
	@Override
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

	@Override
	public List<ExamAddVO> getExamList() throws ClassNotFoundException, SQLException {
		ExamDAO dao = new ExamDAO();
		return dao.getExamList();
	}
	
	@Override
	public void deleteExam(ExamAddVO vo) {
		ExamDAO dao = new ExamDAO();
		try {
			dao.deleteExam(vo);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	

	}

