package dbProject;
import java.util.*;
import java.sql.*;
import java.io.*;
public class prg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Deep@123");
			System.out.println("database connected");
			
			con.setAutoCommit(false);
			Statement st=con.createStatement();
			
			PreparedStatement pst=con.prepareStatement("insert into file1 values(?,?,?,?)");
			pst.setInt(1, 1);
			pst.setString(2, "deepak");
			FileInputStream fin=new FileInputStream("D:\\photo.jpg");
			
			pst.setBlob(3, fin);
			
			FileReader fr=new FileReader("D:\\p1.txt");
			pst.setClob(4, fr);
			
			System.out.println("data save");
			
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
