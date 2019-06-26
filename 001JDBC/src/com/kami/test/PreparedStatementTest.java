package com.kami.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PreparedStatementTest {

	public static final String DB_RUL = "jdbc:mysql://localhost:3306/my_db?useSSL=false&serverTimezone=PRC";
	public static final String DB_USER = "root";
	public static final String DB_PASS = "cxz159";
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(DB_RUL, DB_USER, DB_PASS);
		
//		addPersons(con);
		
		addOrders(con);
		
		
		con.close();
		
	}
	
	public static void addPersons(Connection con) throws SQLException{
		for (int i = 0; i < 10; i++){
			String sql = "INSERT INTO my_db.persons(last_name, first_name, address, city) VALUES (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, "zhou" + i);
			ps.setString(2, "chen" + i);
			ps.setString(3, "美心翡翠明庭" + i);
			ps.setString(4, "广州");
			
			int rs = ps.executeUpdate();
			if(rs == 1){
				System.out.println("操作成功");
			}
			else{
				System.out.println("操作失败");
			}
			ps.close();
		}
	}
	
	public static void addOrders(Connection con) throws SQLException{
		for (int i = 0; i < 1; i++){
			String sql = "INSERT INTO my_db.orders(name, date, time, id_p) VALUES (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, "玩具" + i);
			Date date = new Date();
			ps.setDate(2, new java.sql.Date(date.getTime()));
			
			ps.setTime(3, new java.sql.Time(date.getTime()));
			
			ps.setInt(4, 1);
			
			int rs = ps.executeUpdate();
			if(rs == 1){
				System.out.println("操作成功");
			}
			else{
				System.out.println("操作失败");
			}
			ps.close();
		}
	}

}
