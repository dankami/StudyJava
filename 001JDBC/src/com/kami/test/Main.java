package com.kami.test;

import java.sql.*;
public class Main 
{
    public static String url_encrypt="jdbc:mysql://localhost:3306/my_db?useSSL=false&serverTimezone=UTC";
    public static String user="root";
    public static String password="cxz159";

    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //�������ݿ����
        Connection conn  = DriverManager.getConnection(url_encrypt,user,password);
        //������������
        Statement stmt= conn.createStatement();
        //�����
        ResultSet rs = stmt.executeQuery("select * from persons");
        //����������������
        while(rs.next()){
        System.out.println(
            rs.getInt(1) + "\t"
           +rs.getString(2)+"\t"
           +rs.getString(3)+"\t"
           +rs.getString(4)+"\t"
           +rs.getString(5));
        }
        //���ιرս�����������������ݿ����
        if(rs!=null){
            rs.close();
        }
        if(stmt!=null){
            stmt.close();
        }
        if(conn!=null){
            conn.close();
        }
    }
}

