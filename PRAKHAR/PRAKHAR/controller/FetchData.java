package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.io.Console;
import java.sql.ResultSet;

class FetchData{
	public void fetchData(){
		Console cons=System.console();
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prakhar?user=root&password=1234");
			String query="select * from student";
			PreparedStatement pst=con.prepareStatement(query);
			
			ResultSet rs=pst.executeQuery();
			System.out.println();
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDate(3)+"\t"+rs.getDate(4));
			}
			con.close();
		}catch(ClassNotFoundException| SQLException e){
			e.printStackTrace();
		}
	}
}