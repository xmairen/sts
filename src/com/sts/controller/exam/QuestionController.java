package com.sts.controller.exam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sts.manager.impl.ExamAddIMP;
import com.sts.vo.ExamAddVO;

/**
 * Servlet implementation class QuestionController
 */
@WebServlet({ "/QuestionController", "/admin/QuestionController" })
public class QuestionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		if(method.equals("add")){
			ExamAddIMP add = new ExamAddIMP();
			ExamAddVO vo = new ExamAddVO();
			vo.setContans(request.getParameter("question_content"));
			vo.setAnswerA(request.getParameter("answer_a"));
			vo.setAnswerB(request.getParameter("answer_b"));
			vo.setAnswerC(request.getParameter("answer_c"));
			vo.setAnswerD(request.getParameter("answer_d"));
			vo.setAnswer(request.getParameter("answer"));
			add.addExam(vo);
			response.sendRedirect("/admin/question.jsp");
		}
	}

}
