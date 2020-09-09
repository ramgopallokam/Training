package ram.gopal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Jdbcdemos {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection cone=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","dxcfs", "pass");
			
			String sql1="insert into testing values('sam','akkineni')";
			PreparedStatement state1=cone.prepareStatement(sql1);
			state1.executeUpdate();
			System.out.println("insert completetd");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

}
