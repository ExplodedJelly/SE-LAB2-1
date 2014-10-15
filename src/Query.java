import java.sql.*;
import com.opensymphony.xwork2.ActionSupport;
public class Query extends ActionSupport {
	private String name;
	public String execute(){
		String reslut = "Failed";
		Connection conn = null;
		try{
			String URL = "jdbc:mysql://localhost/selab2";
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = DriverManager.getConnection(URL, "root", "wcwj1234");
		}catch(Exception e){
			reslut= "Failed";
		}finally{
			if(conn!=null){
				try{
					conn.close();
				}catch(Exception e){
					
				}
			}
		}
		return reslut;
		
	}
}
