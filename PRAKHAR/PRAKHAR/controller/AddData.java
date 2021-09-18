package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import model.*;

public class AddData{
	public void addData(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prakhar?user=root&password=1234");
			
			String query="insert into student(STUDENT_NO,STUDENT_NAME,STUDENT_DOB,STUDENT_DOJ) value(?,?,?,?)";

			PreparedStatement pst=con.prepareStatement(query);
			Student s=new Student();
			s.getEnteredData();

		
			pst.setInt(1,s.getStudentNo());
			pst.setString(2,s.getStudentName());
			pst.setDate(3,s.getStudentDOB());
			pst.setDate(4,s.getStudentDOJ());

			if(pst.executeUpdate()==1){
				System.out.println("Data inserted sucessfully");
			}

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}

	}
	
}