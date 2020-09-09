package ram.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDemo {

public static void main(String[] args) {

try
{
// external class
Class.forName("oracle.jdbc.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "dxcfs","pass");

String sql="insert into ppr values('gopal','lokam')";
String sql1="insert into ppr values('dream','job')";
PreparedStatement stat=con.prepareStatement(sql);
PreparedStatement stat1=con.prepareStatement(sql1);
stat.executeUpdate();
stat1.executeUpdate();


System.out.println("Connected");
}
catch (Exception e) {
e.printStackTrace();
}
}

}