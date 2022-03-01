package classAlma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBCDemo3 {
	public static void main(String[] args)throws Exception {
		//Step 1 - Load the Driver or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish a connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/alma","root","root");
			
			System.out.println(con);
			
			//Step 3 - Create a statement
			Statement stmt=con.createStatement();
			
			int n=stmt.executeUpdate("insert into users values (1,'mohan','secret',0)");
			n=n+stmt.executeUpdate("insert into users values (2,'john','secret',0)");
			n=n+stmt.executeUpdate("insert into users values (3,'mann','secret',0)");
			
			System.out.println("No of Rows Updated...:"+n);
			
			n=stmt.executeUpdate("update users set flag=1");
			System.out.println("No of rows updated...:"+n);
			
		//	n=stmt.executeUpdate("delete from users");
		//	System.out.println("No of rows deleted..:"+n);
			
			ResultSet rs= stmt.executeQuery("select * from users");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString("upass"));
				System.out.println(rs.getInt("flag"));
			}
			
	}
}
