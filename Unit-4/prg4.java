package dbProject;
import java.util.*;
import java.sql.*;
public class prg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Deep@123");
			System.out.println("connected");
			
			// 
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=st.executeQuery("select * from student1");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			}
			System.out.println("----backward----");
			while(rs.previous()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			}
			
			// next(), previous(), absolute(), first(), last(), beforeFirst(), afterLast() are move the cursor at position and return boolean 
			rs.absolute(3);
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
