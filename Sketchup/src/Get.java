import java.sql.*;
public class Get {
     public static void selectData() throws Exception {
    	 String url="jdbc:mysql://127.0.0.1:3306/product";
 		String username="root";
 		String password="123456789";
 		String Query="select * from table_1 where id=3";//replace table name on 'user'.
 		Connection con=DriverManager.getConnection(url,username,password);
 		Statement smt=con.createStatement();
 		ResultSet rs=smt.executeQuery(Query);
 		while(rs.next()) {
 			System.out.println("student id "+rs.getInt(1));
 			System.out.println("student name "+rs.getString(2));
 			System.out.println("student email "+rs.getString(3));
 		}
 		con.close();
 ;	}
     
	
	
	public static void main (String[]args) throws Exception {
		
		selectData();
}
}