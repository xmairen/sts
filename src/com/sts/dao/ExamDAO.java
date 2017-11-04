package com.sts.dao;

import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.sts.vo.ExamAddVO;

public class ExamDAO extends BasicDAO{
	
	public void addExam(ExamAddVO vo) throws ClassNotFoundException, SQLException{
		String sql = "insert into exam (contans, answerA, answerB, answerC, answerD, answer) VALUES (?,?,?,?,?,?)";
		PreparedStatement pstm = getPreparedStatement(sql);
		pstm.setString(1, vo.getContans());
		pstm.setString(2, vo.getAnswerA());
		pstm.setString(3, vo.getAnswerB());
		pstm.setString(4, vo.getAnswerC());
		pstm.setString(5, vo.getAnswerD());
		pstm.setString(6, vo.getAnswer());
		pstm.execute();
		this.closeConnection();
	}
	
	public static void getExamList(ExamAddVO vo){
		String sql = "SELECT * FROM exam ORDER BY id";

		
	}
	
}
