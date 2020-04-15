package Demo;
import java.sql.*;

public class Demo {

	public static void main(String[] args)
	{
		try
		{
		String url="jdbc:mysql://localhost:3306/world";
		String usr="root";
		String pass="1234";
		String query="select * from country";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,usr,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString("code");
		System.out.println(name);
		st.close();
		con.close(); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		
	}

}
