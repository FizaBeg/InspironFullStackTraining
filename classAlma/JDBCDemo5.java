package classAlma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCDemo5 {
	public static void main(String[] args)throws Exception {
		//Step 1 - Load the Driver or register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
	//Step 2 - Establish a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/alma","root","fiza1055");
		
		PreparedStatement ps=con.prepareStatement("insert into users values (?,?,?,?)");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter user id..:");
		int userid=scan.nextInt();
		System.out.println("Enter user name..:");
     	String username=scan.next();
		System.out.println("Enter password..:");
		String password=scan.next();
		System.out.println("Enter flag value..:");
		int flag=scan.nextInt();
		
		ps.setInt(1, userid);
		ps.setString(2, username);
		ps.setString(3, password);
		ps.setInt(4, flag);
		
		int n=ps.executeUpdate();
		System.out.println("No of rows inserted..:"+n);

}
}
