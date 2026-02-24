package in.sms.www;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private int sId;
	private String sName;
	private int sAge;
	private String sCourse;

	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public String getsCourse() {
		return sCourse;
	}
	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}
	@Override
	public String toString() {	
		return"Student Id: "+sId+" "+
			  " Student Name: "+sName+" "+
			  " Student Age: "+sAge+" "+
			  " Student Course: "+sCourse;
	}
}


public class StudentData {
	
    static ArrayList<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        int choice;
		do {
		
         System.out.println("-----STUDENT MANAGEMENT SYSTEM-----");
         System.out.println("1. Add Student");
         System.out.println("2. View Student");
         System.out.println("3. Search Student by StudentId");
         System.out.println("4. Update Student");
         System.out.println("5. Delete Student");
         System.out.println("6.Exit");
         System.out.println("--------------------------------------");

         choice = sc.nextInt();
         switch(choice) {
         case 1:
        	 addStudent();
        	 break;
         case 2:
        	 viewStudent();
        	 break;
         case 3:
        	 searchStudent();
        	 break;
         case 4:
        	 updateStudent();
       	     break;
         case 5:	 
        	 deleteStudent();
        	 break;
         case 6:
        	 exit();
        	 break;
         default:
        	 System.out.println("Invalid choice enter");
         }
		}while(choice!=6);
            
         
	}
	private static void addStudent() {
		Student s1 = new Student();
		System.out.println("Enter Student Id:");
		s1.setsId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Student Name:");
		s1.setsName(sc.nextLine());
		System.out.println("Enter Student Age:");
		s1.setsAge(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Student Choosen Course:");
		s1.setsCourse(sc.nextLine());
		studentList.add(s1);
        System.out.println("Student Added Successfully...");
	}
	private static void viewStudent() {
		if(studentList.isEmpty()) {
			System.out.println("Empty Student");
			return;
		}else {
		    for(Student s:studentList) {
			System.out.println(s);
		    }
		}
	}
	private static void searchStudent() {
		System.out.println("Enter Student Id:");
		int id = sc.nextInt();
		for(Student s:studentList) {
			if(s.getsId()==id) {
				System.out.println(s);
				return;
			}
				System.out.println("Invalid id");
			
		}
		
	}
	private static void updateStudent() {
	  System.out.println("Enter Student Id:");
	  int id = sc.nextInt();
	  sc.nextLine();
	  for(Student s:studentList) {
		  if(s.getsId()==id) {
			  System.out.println("Add course:");
			  s.setsCourse(sc.nextLine());
			  System.out.println("Students Data Updated..");
			  return;
		  }
	  }
    }
	private static void deleteStudent() {
		System.out.println("Enter Student Id :");
		int id = sc.nextInt();
		for(Student s:studentList) {
			
			if(s.getsId()==id) {
				studentList.remove(s);
				System.out.println("Students deleted Successfully...");
				return;
			}
				System.out.println("Invalid id ");
			
		}
	}
	private static void exit() {
        System.out.println("Exit Suceessfully...");		
	}
	
}
