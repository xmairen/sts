package com.sts.manager.inteface;

import java.sql.SQLException;
import java.util.List;

import com.sts.vo.ExamAddVO;

public interface ExamManagerInterface {
	public void addExam(ExamAddVO vo);
	public List<ExamAddVO> getExamList() throws ClassNotFoundException, SQLException;
}
