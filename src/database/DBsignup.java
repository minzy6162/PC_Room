package database;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JTextField;

//ȸ�������� ���� db����
public class DBsignup {
	java.sql.Connection conn;
	java.sql.Statement stmt;
	java.sql.ResultSet rs;
	PreparedStatement ps;
	
	
	public DBsignup(){  //������
		connect();
	}
	//�ش� ����̹��� Ŭ������ �̿��Ͽ� DB����(_conn)
	//DB�� ��ɾ ������ �� �ִ� ��ü ����(_stmt)
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
	//������
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
	public static void createCustomer(String t_SName,String t_SId, String t_Password) {
		try {
			DBsignup ot=new DBsignup();
			//DBsignup info=new DBsignup();
			
			ot.Undate("INSERT INTO members (name, id, password)" + "VALUES('" + t_SName + "','" + t_SId + "','" + t_Password + "','" +  "')");
			
			ot.select("SELECT * FROM members");
			ot.rs.beforeFirst();
			
		}//try
		catch(Exception e) {
			System.out.println("getString error:" + e);
		}
	}
	
}

