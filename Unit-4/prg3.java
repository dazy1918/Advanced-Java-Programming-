package dbProject;
import java.util.*;
import java.sql.*;
public class prg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

//			String url = "jdbc:oracle:thin:@localhost:1521:XE";
//			String user = "system";
//			String pass = "Deep@123";
//
//			Connection con = DriverManager.getConnection(url, user, pass);
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Deep@123");
			

			System.out.println("Connected successfully");
			
		
			
			Scanner sc=new Scanner(System.in);
			System.out.println("1 for insert\n 2 for update \n 3 for delete \n 4 for retrieve \n 5 for exit ");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			while(choice!=5) {
				switch(choice) {
					case 1:		System.out.println("enter the student id and name");
								int id=sc.nextInt();
								sc.nextLine();
								String name=sc.nextLine();
								String query="insert into student1(id,name) values(?,?)";
								PreparedStatement ps=con.prepareStatement(query);
								ps.setInt(1,id);
								ps.setString(2,name);
								ps.executeUpdate();
								ps.close();
						break;
//					case 2:update();
//						break;
//					case 3:delete();
//						break;
//					case 4:retrieve();
//						break;
					default:System.out.println("wrong input");
					
				}
				System.out.println("enter your choice");
				choice=sc.nextInt();
			}
			sc.close();
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}



	
		