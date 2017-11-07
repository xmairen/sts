package com.sts.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public  List<ExamAddVO> getExamList() throws ClassNotFoundException, SQLException{
		List<ExamAddVO> list = new ArrayList<ExamAddVO>();
		String sql = "select id, contans,answerA,answerB,answerC,answerD,answer from exam order by id";
		Statement tm = getStatement();
		ResultSet rs = tm.executeQuery(sql);
		ExamAddVO vo;
		while(rs.next()){
			vo = new ExamAddVO();
			vo.setId(rs.getInt("id"));
			vo.setContans(rs.getString("contans"));
			vo.setAnswerA(rs.getString("answerA"));
			vo.setAnswerB(rs.getString("answerB"));
			vo.setAnswerC(rs.getString("answerC"));
			vo.setAnswerD(rs.getString("answerD"));
			vo.setAnswer(rs.getString("answer"));
			list.add(vo);
		}	
		this.closeConnection();
		return list;
	}
	
	
	public void deleteExam(ExamAddVO vo) throws ClassNotFoundException, SQLException{
		String sql = "DELETE FROM exam where id=?";
		PreparedStatement pstm = getPreparedStatement(sql);
		pstm.setInt(1, vo.getId());
		pstm.execute();
		this.closeConnection();
	}
	
}
