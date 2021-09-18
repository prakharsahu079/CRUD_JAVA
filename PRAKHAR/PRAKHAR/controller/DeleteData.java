package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.*;
class DeleteData{
	public void deleteData(){
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prakhar?user=root&password=1234");
			String query="delete from student where student_no=?";
			PreparedStatement pst=con.prepareStatement(query);
			
			System.out.print("Enter Student_no:\n");
			int no=sc.nextInt();		
			pst.setInt(1,no);
			
			if(pst.executeUpdate()==1){
				System.out.println("Record Deleted Sucessfully");
			}
			
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}finally{
			try{ con.close(); } catch(SQLException e){ e.printStackTrace();}
		}
	}
}