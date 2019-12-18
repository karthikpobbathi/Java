package simple;
import java.sql.*;
public class JdbcClass1 {
	




	    public static void main(String[] args) throws ClassNotFoundException {
	        // TODO Auto-generated method stub
	        try{
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","India123");
	            Statement stat=con.createStatement();
	            
	            
	            
	            //stat.execute("create table tbn1(eid number(10),ename varchar2(10))");
	            PreparedStatement ps=con.prepareStatement("insert into tbn1 values(?,?)");
	            
	            //ps.setInt(1,105);
	            //ps.setString(2,"suraj");
	            //ps.execute();
	            
	           /* 
	            stat.execute("update tbn1 set ename='nikhil' where eid=104");
	            stat.execute("delete from tbn1 where eid=104");*/
	           // st.execute("INSERT  INTO staff_master (Staff_Code,Staff_Name,Design_Code,Dept_Code) VALUES(100011,'KARTHIK',102,30) ");
	            ResultSet rs=stat.executeQuery("select * from tbn1");
	            
	            while(rs.next()){
	                int eid=rs.getInt(1);
	                String ename=rs.getString(2);
	                System.out.println(eid +" "+ ename);
	            }
	        }
	        catch(SQLException e){
	            System.out.println("Invalid"+e);
	        }


	    }


	}








}
