package classAlma;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
public class JDBCDemo6 {
	public static void main(String[] args)throws Exception {
		//Step 1 - Load the Driver or register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
			//Step 2 - Establish a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/alma","root","fiza1055");
		
		CallableStatement cs=con.prepareCall("{call proc1(?,?)}");
		
		cs.setInt(1, 5);
		
		cs.registerOutParameter(2, Types.VARCHAR);
		
		cs.execute();
		
		System.out.println("The name of userid 3 is..:"+cs.getString(2));
		
	}
}
