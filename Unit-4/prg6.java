package dbProject;
import java.util.*;
import java.sql.*;
public class prg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Deep@123");
			System.out.println("database connected");
			
			Statement s=con.createStatement();
			s.addBatch("insert into student1 values(9,'ria')");
			s.addBatch("update student1 set name='java' where id=1");
			s.addBatch("insert into student1 values(10,'sia')");
			
			// return an array how many rows are affected by you batch query
			s.executeBatch();
			
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
