package dbProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class prg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Deep@123");
			System.out.println("database connected");
			
			con.setAutoCommit(false);
			Statement st=con.createStatement();
			st.executeUpdate("insert into student1 values(13,'DevDeep')");
			// commit by self
			con.commit();
			
			// if you want to roll back then no commit before roll back
//			con.rollback();
			
			
			
			
			// do connection close before connection auto commit change
//			con.close();
		}
		catch(Exception e) {
			try {
		        if(con != null) {
		            con.rollback();
		        }
		    } catch(Exception ex) {
		        ex.printStackTrace();
		    }
		    e.printStackTrace();
		}
	}

}
