//package dbProject;
//import java.sql.*;
//public class prg1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");// to set driver
//			
//			// for connect to dbms use connection interface
//			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Deep@123");
//			// in get connection (url, username, password)
//			
//			System.out.println("connected");
//			// for checking connection is establish or not
//			
//			
//			Statement st=con.createStatement();
//			String query ="create table student1(id number primary key, name varchar(20))";
//			String query1="insert into student1(id,name) values(001,'Aakash')";
//			st.executeUpdate(query);
//			System.out.println("Query executed");
//			
////			String query2="insert into sudent1 values(2,alex)";
////			st.executeUpdate(query2);
////			System.out.println("insert database successfull");
//			
//			
//			
//			st.close();
//			con.close();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//}


package dbProject;
import java.util.*;
import java.sql.*;

public class prg1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE",
                "system",
                "Deep@123"
            );

            System.out.println("Connected");

            Statement st = con.createStatement();

            // Create table
//            String query = "create table student1(id number primary key, name varchar(20))";
//            st.executeUpdate(query);
//            System.out.println("Table created");

            // Insert data
//            String query1 = "insert into student1(id,name) values(1,'Aakash')";
//            String query2 = "insert into student1(id,name) values(2,'Aaditya')";
//            st.executeUpdate(query2);
//            System.out.println("Data inserted");
            
//            String query="insert into student1 values(3,'roshan')";
//            	st.executeUpdate(query);
//            System.out.println("execute successfully");
            
//            String query="update student1 set name='deepak' where id=2";
//            st.executeUpdate(query);
//            System.out.println("Executed successfully");
            
            
//            String query="delete from student1 where id=3";
//            int n=st.executeUpdate(query);
//            System.out.println(n+"rows affected");
            
            
//            // enter data from user to add data in database
//            System.out.println("enter the number of datas");
//            int num=sc.nextInt();
//            int ids[]=new int[num];
//            String names[]=new String[num];
////            int preId=
//            System.out.println("enter the id after  and name of user");
//            for(int i=0;i<num;i++) {
//            	ids[i]=sc.nextInt();
//            	sc.nextLine();
//            	names[i]=sc.nextLine();
//            
//            }
//            
//            // prepaire statement for data safety
//            String query="insert into student1(id,name) values(?,?)";
//            PreparedStatement pst=con.prepareStatement(query);
//           
//            for(int i=0;i<num;i++) {
//            	
//            	pst.setInt(1, ids[i]);
//            	pst.setString(2,names[i]);
//            	pst.executeUpdate();
//            }
//            System.out.println("data save successfully");
//            
            
            // to show the data from the database we need to use Resultset interface
            
//            String query="select * from student1";
//            ResultSet rs=st.executeQuery(query);
//            while(rs.next()) {
////            	int id=rs.getInt("id");
//            	int id=rs.getInt(1);
//            	// 1 and 2 are column number 
//            	
////            	String name=rs.getString("name");
//            	String name=rs.getString(2);
//            	System.out.print(id+"    "+name);
//            	System.out.println();
//            }
            
            
            
            String query="select * from student1";
            PreparedStatement pst=con.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            while(rs.next()) {
            	System.out.print(rs.getInt(1)+"         "+rs.getString(2));
            	System.out.println();
            }

            
            st.close();
            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
