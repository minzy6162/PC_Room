package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import java.sql.*;
public class DBConnection {
	public static void main(String[] args) {
		String jdbc_driver="com.mysql.cj.jdbc.Driver";
		Connection conn=null;
		Statement stmt=null;
		try {
			Class.forName(jdbc_driver);
			String dbURL="jdbc:mysql://127.0.0.1:3306/hello?serverTimezone=UTC";
			conn=DriverManager.getConnection(dbURL,"root","6162");
			System.out.println("연결 성공");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}catch(Exception e) {
			System.out.println(e.toString());
			System.out.println("연결 실패");
		}finally{
            try{
                if( conn != null && !conn.isClosed()){
                    conn.close();
                }
            }
            catch( SQLException e){
                e.printStackTrace();
            }
	 }
	}
	
}

