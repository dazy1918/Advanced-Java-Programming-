package dbProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;


public class prg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Deep@123");
			System.out.println("database connected");
			
			con.setAutoCommit(false);
			Statement st=con.createStatement();
//			st.executeUpdate("insert into student1 values(13,'DevDeep')");
			// save point similar to save points in game where the game start from when we die in middle
//			st.executeUpdate("insert into student1 values(15,'kavita')");
//			Savepoint sp=con.setSavepoint("SP1");
//			
//			st.executeUpdate("insert into student1 values(16,'gaurav')");
//			con.rollback(sp);
//			
//			
//			con.commit();
			
			
			st.executeUpdate("insert into student1 values(30,'A')");
			st.executeUpdate("insert into student1 values(31,'B')");

			Savepoint sp = con.setSavepoint("SP1");

			st.executeUpdate("insert into student1 values(32,'C')");

			// rollback only last insert
			con.rollback(sp);

			con.commit();
			
			
			System.out.println("Completed");
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
