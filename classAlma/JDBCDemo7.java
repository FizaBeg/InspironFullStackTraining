package classAlma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class JDBCDemo7 {
	public static void main(String[] args)throws Exception {
		//Step 1 - Load the Driver or register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
			//Step 2 - Establish a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/alma","root","fiza1055");
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select * from users");
		
		ResultSetMetaData rsmd=rs.getMetaData();
		
		int colcount=rsmd.getColumnCount();
		
		System.out.println("No of columns...:"+colcount);
		for(int i=1;i<=colcount;i++) {
			System.out.print(rsmd.getColumnName(i)+"\t");
		}
		System.out.println("\n..............................................\n");
		while(rs.next()) {
			for(int i=1;i<=colcount;i++) {
				System.out.print(rs.getString(i)+"\t");
			}
			System.out.println();
		}
	}
}