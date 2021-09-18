package controller;

import java.util.*;


public class CRUD{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your choice:\n");
		System.out.println("1.Add\t");
		System.out.println("2.Read\t");
		System.out.println("3.Update\t");
		System.out.println("4.Delete");
		
		int choice=sc.nextInt();

		if(choice==1){
			AddData a=new AddData();
		    a.addData();
		}else if(choice==2){
			FetchData fd=new FetchData();
			fd.fetchData();
		}else if(choice==3){
			UpdateData ud=new UpdateData();
			ud.updateData();
		}else if(choice==4){
			DeleteData dd=new DeleteData();
			dd.deleteData();
		}
		else{
			System.out.println("Invalid choice");
		}
	}	

}