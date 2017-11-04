package com.sts.controller.admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sts.manager.impl.AdminLoginManager;
import com.sts.vo.AdminVO;

/**
 * Servlet implementation class AdminLoginController
 */
@WebServlet(name="AdminLoginController",urlPatterns={"/admin/login/AdminLoginController"})
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginController() {
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
		String name = request.getParameter("name").trim();
		String password = request.getParameter("password").trim();
		AdminVO vo = new AdminVO();
		vo.setAccount(name);
		vo.setPassword(password);
		AdminLoginManager ad = new AdminLoginManager();
		try {
			if(ad.adminLogin(vo)){
				response.sendRedirect("/admin/main.jsp");
				
			}else{
				request.setAttribute("login_fail", "Y");
				request.getRequestDispatcher("/admin/login.jsp").forward(request, response);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
