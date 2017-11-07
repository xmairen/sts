package com.sts.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class BasicDAO {
	 static String url = "jdbc:mysql://127.0.0.1:3308/sts";
	 static String password = "123";
	 static String user = "root";
	
	public PreparedStatement pstm;
	public ResultSet rs;
	
		
	public static   Connection createConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = (Connection) DriverManager.getConnection(url, user, password);
		return conn;
	}


	public static Statement getStatement() throws SQLException, ClassNotFoundException{
		
		if(createConnection() == null){
			createConnection();
		}
		Statement statement = (Statement) createConnection().createStatement();
		return statement;
	}
	
	



	public PreparedStatement getPreparedStatement(String sql2) throws SQLException, ClassNotFoundException{
		
		if(createConnection() == null){
			createConnection();
		}
		PreparedStatement pstm = (PreparedStatement) createConnection().prepareStatement(sql2);
		return pstm;
	}
	
	public void closeConnection() throws SQLException, ClassNotFoundException{
		if(rs != null){
			createConnection().close();
		}
		if(getStatement() != null){
			getStatement().close();
		}
		if(createConnection() !=null){
			createConnection().close();
		}
		
	}
	
	
	
}