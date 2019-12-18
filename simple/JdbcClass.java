package simple;
import java.sql.*;
public class JdbcClass {
public static void main(String[] args) {
	
	try{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","India123");
		Statement st = con.createStatement();
		//st.execute("INSERT  INTO staff_master (Staff_Code,Staff_Name,Design_Code,Dept_Code) VALUES(100011,'KARTHIK',102,30) ");
		//st.execute("insert into student1 values(1)");
		//st.execute("UPDATE staff_master SET  staff_name = 'Rehaman' where staff_code=100 ");
		/*st.execute("DELETE FROM staff_Master WHERE STAFF_CODE=100");*/
		 PreparedStatement ps=con.prepareStatement("insert into tbn1 values(?,?)");
		ResultSet rs=st.executeQuery("select Staff_Code,staff_name from STAFF_MASTER");
		try(PreparedStatement pstmt = con.prepareStatement("INSERT  INTO staff_master (Staff_Code,Staff_Name,Design_Code,Dept_Code) VALUES(100011,'KARTHIK',102,30)",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)){
			rs=ps.executeQuery();
			rs.first();
			rs.last();
			rs.previous();
			rs.next();
		}catch(SQLException e){
			System.out.println(e);
		}
		while(rs.next()){
			int id=rs.getInt(1);
			String a= rs.getString(2);
			
			System.out.println(id+" "+a);
		}
	}
	catch(SQLException e){
		System.out.println(e);
	}
}}
