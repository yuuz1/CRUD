import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Deleteid {
	public static void main(String[]arg) throws Exception {
		insertData();
	}
	
	public static void insertData()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/product";// nameList is the Database that we are amending table	
		String username="root";
		String password="123456789";
		String Query="delete from table_1 where id=2" ;
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		int result=pst.executeUpdate();
		con.close();
		}
	
}
