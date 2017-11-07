package com.sts.controller.exam;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sts.manager.impl.ExamManagerIMP;
import com.sts.manager.inteface.ExamManagerInterface;
import com.sts.tools.Tools;
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
		request.setCharacterEncoding("UTF-8");
		String method = request.getParameter("method");
		if(Tools.objectIsNullOrNot(method)){
			ExamManagerInterface getlist = new ExamManagerIMP();
			try {
				ExamAddVO vo = new ExamAddVO();
				List<ExamAddVO> question_list = getlist.getExamList();
				request.setAttribute("exam_vo", vo);
				request.setAttribute("question_list", question_list);
				request.getRequestDispatcher("/admin/question.jsp").forward(request, response);
				return;
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}
		if(method.equals("add")){
			ExamManagerIMP add = new ExamManagerIMP();
			ExamAddVO vo = new ExamAddVO();
			vo.setContans(request.getParameter("question_content"));
			vo.setAnswerA(request.getParameter("answer_a"));
			vo.setAnswerB(request.getParameter("answer_b"));
			vo.setAnswerC(request.getParameter("answer_c"));
			vo.setAnswerD(request.getParameter("answer_d"));
			vo.setAnswer(request.getParameter("answer"));
			add.addExam(vo);
			response.sendRedirect("/admin/QuestionController");
		}
		
		if(method.equals("delete")){
			ExamManagerIMP delete = new ExamManagerIMP();
			ExamAddVO vo = new ExamAddVO();
			vo.setId(Integer.parseInt(request.getParameter("id")));
			delete.deleteExam(vo);
			response.sendRedirect("/admin/QuestionController");
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
