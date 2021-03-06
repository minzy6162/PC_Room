package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JTextField;

import solmin.member;

//회원가입을 위한 db연동
public class DBTime {
	java.sql.Connection conn;
	java.sql.Statement stmt;
	java.sql.ResultSet rs;
	PreparedStatement ps;
	
	
	public DBTime(){  //생성자
		connect();
	}
	//해당 드라이버의 클래스를 이용하여 DB접속(_conn)
	//DB에 명령어를 전달할 수 있는 객체 생성(_stmt)
	void connect() {
		String dbinfor="jdbc:mysql://127.0.0.1:3306/member?serverTimezone=UTC";
		String dbID="root";
		String dbPW="6162";
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.conn=java.sql.DriverManager.getConnection(dbinfor,dbID,dbPW);
		this.stmt=this.conn.createStatement();
	}catch(Exception e){
		System.out.println("connection error:" + e);
	}
}//connect()
	void Undate(String dbCommand) {
		try {
			this.stmt.executeUpdate(dbCommand);
		}catch(Exception e) {
			System.out.println("undate error : " + e);
		}
		
	}//undate()
	//실행결과
	void select(String dbSelect) {
		try {
			this.rs=this.stmt.executeQuery(dbSelect);
		}catch(Exception e) {
			System.out.println("select error : " + e);
		}
	}//select()
	void close() {
		try {
			conn.close();
		}catch(Exception e){
			System.out.println("close error :" +e);
		}
	}
	public static void createCustomer(String t_time) {
		try {
			DBsignup ot=new DBsignup();
			//DBsignup info=new DBsignup();
			
			ot.Undate("INSERT INTO members (time)" + "VALUES('" + t_time +  "')");
			
			ot.select("SELECT * FROM times");
			ot.rs.beforeFirst();
			
		}//try
		catch(Exception e) {
			System.out.println("getString error:" + e);
		}
	}
	
	public member getmember(int time) {
		member m = new member();
		
        Connection conn = null;       //연결
        PreparedStatement ps = null; //명령
        ResultSet rs = null;         //결과
       
        try {
           
            conn = getConn();
            String sql = "select * from member where id=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, time);
           
            rs = ps.executeQuery();
           
            if(rs.next()){
                m.settime(rs.getString("job"));
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }      
       
        return m;    
    }
	
	public Vector getTimeList() {

        Vector data = new Vector();  //Jtable에 값을 쉽게 넣는 방법 1. 2차원배열   2. Vector 에 vector추가
       
           
        Connection conn = null;       //연결
        PreparedStatement ps = null; //명령
        ResultSet rs = null;         //결과
       
        try{
           
            conn = getConn();
            String sql = "select * from member order by name asc";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
           
            while(rs.next()){
                Integer time = rs.getInt("time");
               
                Vector row = new Vector();
                row.add(time);
               
                data.add(row);             
            }//while
        }catch(Exception e){
            e.printStackTrace();
        }
        return data;
	}
	private Connection getConn() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


