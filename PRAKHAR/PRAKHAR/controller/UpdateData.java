package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Scanner;

class UpdateData{
	public void updateData(){
		Scanner sc=new Scanner(System.in);
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prakhar?user=root&password=1234");
			String query="update student set student_name=? where student_no=?";
			PreparedStatement pst=con.prepareStatement(query);
			
			System.out.print("Enter Student_no:");
			int no=sc.nextInt();
			
			System.out.print("Enter New Name:");
			String name=sc.next();
			
			pst.setInt(2,no);
			pst.setString(1,name);
            
			if(pst.executeUpdate()==1){
				System.out.println("Update Sucessfully");
			
			pst.executeUpdate();
			con.close();
		}catch(ClassNotFoundException| SQLException e){
			e.printStackTrace();
		}
	}
}