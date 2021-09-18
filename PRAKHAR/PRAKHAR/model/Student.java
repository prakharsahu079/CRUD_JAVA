package model;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Scanner;
import java.text.ParseException;

public class Student{
	private int studentNo;
	private String studentName;
	private Date studentDOB;
	private Date studentDOJ;
	
	public void setStudentNo(int studentNo){
		this.studentNo=studentNo;
	}

	public int getStudentNo(){
		return studentNo;
	}

	public void setStudentName(String studentName){
		this.studentName=studentName;
	}

	public String getStudentName(){
		return studentName;
	}

	public void setStudentDOB(Date studentDOB){
		this.studentDOB=studentDOB;
	}

	public Date getStudentDOB(){
		return studentDOB;
	}

	public void setStudentDOJ(Date studentDOJ){
		this.studentDOJ=studentDOJ;
	}
	
	public Date getStudentDOJ(){
		return studentDOJ;
	}

	public void getEnteredData(){
		String dob="",doj="";
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Student No:\n");
		studentNo=sc.nextInt();
		setStudentNo(studentNo);
		
		
		System.out.println("Enter Student Name:\n");
		studentName=sc.next();
		setStudentName(studentName);
	
		
		System.out.println("Enter Student DOB:\n");
		dob=sc.next();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm-yy");
        
		try{

		java.util.Date udob = sdf1.parse(dob);
        java.sql.Date sqdob = new java.sql.Date(udob.getTime());
        
		setStudentDOB(sqdob);
		}catch(ParseException e){
			e.printStackTrace();
		}

		System.out.println("Enter Student DOJ (yyyy-mm-dd):\n");
		doj=sc.next();
		//for date of joining(yyyy-mm-dd)
        java.sql.Date sqdoj = java.sql.Date.valueOf(doj);
		setStudentDOJ(sqdoj);
	}
}