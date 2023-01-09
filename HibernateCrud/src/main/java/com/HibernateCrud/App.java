package com.HibernateCrud;

import java.util.Scanner;

import com.HibernateCrud.Daolmpl.StudentDaolmpl;

public class App 
{
    public static void main( String[] args )
    {
    	StudentDaolmpl dao=new StudentDaolmpl();
    	char c = 0;
    	do {
    		Scanner sc=new Scanner(System.in);
    		System.out.println("PRESS 1 FOR add student \n PRESS 2 for display student \n"
    				+"PRESS 3 for update \n PRESS 4 for delete \n PRESS 5 for exit");
    		int a=sc.nextInt();
    		switch(a) {
    		case 1:dao.addStudent();break;
    		case 2:dao.fetchStudent();break;
    		case 3:dao.updateStudent();break;
    		case 4:dao.deleteStudent();break;
    		case 5:System.exit(0);break;
    		default:System.out.println("Invalid choice!");
    		}
    	}while(c=='y'||c=='y');
    	System.out.println("Thank you");
    }
}
