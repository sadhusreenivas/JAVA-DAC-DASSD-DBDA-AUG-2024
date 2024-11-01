package jdbc;
import java.sql.*;
public class JDBCDemo {

	public static void main(String[] args) throws Exception {

       //1. Load the driver
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   
	   // 2. establish the connection
	   String uname = "root";
	   String pwd = "root";
	   String url = "jdbc:mysql://localhost:3306/student";
	   
	   Connection con = DriverManager.getConnection(url,uname,pwd);

	   if(con != null)
		   System.out.println("DB Connection Success");
	

	// 3. Create Statements
	Statement st = con.createStatement();
	
	// Execute Query and process results
	 ResultSet rs = st.executeQuery("select * from student_details");
	 
	 while(rs.next()) {
		 System.out.println(rs.getInt(1)+" "+rs.getString(4));
	 }
	 
	 con.close();
}
}
