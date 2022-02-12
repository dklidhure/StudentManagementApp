package com.Student.Manage;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		System.out.println("Welcome to Student Management App");
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to delete student");
			System.out.println("Press 3 to display student");
			System.out.println("Press 4 to update Student");
			System.out.println("Press 5 to exit");
			int c=sc.nextInt();
			
			
			if(c==1)
			{
				//add student
				System.out.println("Enter student name: ");
				String name=sc.next();
				
				System.out.println("Enter student phone: ");
				String phone =sc.next();
				
				System.out.println("Enter student city: ");
				String city=sc.next();
				
				Student st= new Student(name,phone,city);
				
			
			}

	}

	}
}
