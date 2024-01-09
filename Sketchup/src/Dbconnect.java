import java.sql.*;
public class Dbconnect {
	
	public static void insertData()throws Exception{
String url="jdbc:mysql://127.0.0.1:3306/product";
String username="root";
String password="123456789";
String Query="insert into table_1 values(?,?,?)";//
Connection con=DriverManager.getConnection(url,username,password);
PreparedStatement pst=con.prepareStatement(Query);
pst.setInt(1, 5);
pst.setString(2, "dasalt");
pst.setString(3, "ajmir@gmail.com");
pst.executeUpdate();
con.close();
	
	}
	
	public static void main(String[]args) throws Exception {
		insertData();
	}
	

}