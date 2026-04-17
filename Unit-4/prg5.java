package dbProject;
import java.util.*;
import java.sql.*;
public class prg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Deep@123");
			
			System.out.println("database connected");
			
			// updatable ResultSet
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			ResultSet rs=st.executeQuery("select name,id from student1");
			
			// go to particular row
			rs.absolute(2);
			
			
			// update variable
			rs.updateString("name","sita" );
			
			// update row in database table
			rs.updateRow();
			
			System.out.println("data updated");
			
			// 
//			rs.moveToInsertRow();
//			rs.updateInt("id", 6);
//			rs.updateString("name", "ram");
//			rs.insertRow();
			
			
//			rs.moveToInsertRow();
//			rs.updateInt("id", 7);
//			rs.updateString("name", "Abhinav");
//			rs.insertRow();
			
		
//			rs.absolute(4);
//			rs.deleteRow();
			
			
			// to search according to id
			
			while(rs.next()) {
				int r=rs.getInt("id");
				if(r==3) {
					rs.updateString("name", "harsh joshi");
					rs.updateRow();
					break;
				}
			}
			
			
			System.out.println("Execute Successfully");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
