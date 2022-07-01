package balachandran_oopsGradedAssignmentOne.main;

import balachandran_oopsGradedAssignmentOne.departments.AdminDepartment;
import balachandran_oopsGradedAssignmentOne.departments.HrDepartment;
import balachandran_oopsGradedAssignmentOne.departments.TechDepartment;

public class Main {

	
	public static void main(String[] args) {
		final String welcomeExtension="  Welcome to ";
		//Admin
		AdminDepartment adminObj=new AdminDepartment();
		System.out.println(welcomeExtension+adminObj.departmentName());
		System.out.println(adminObj.getTodaysWork());
		System.out.println(adminObj.getWorkDeadline());
		System.out.println(adminObj.isTodayAHoliday());
		System.out.println();
		
		//HR
		HrDepartment hrObj=new HrDepartment();
		System.out.println(welcomeExtension+hrObj.departmentName());
		System.out.println(hrObj.doActivity());
		System.out.println(hrObj.getTodaysWork());
		System.out.println(hrObj.getWorkDeadline());
		System.out.println(hrObj.isTodayAHoliday());
		System.out.println();
		
		//TECH
		TechDepartment techObj=new TechDepartment();
		System.out.println(welcomeExtension+techObj.departmentName());
		System.out.println(techObj.getTodaysWork());
		System.out.println(techObj.getWorkDeadline());
		System.out.println(techObj.getTechStackInformation());
		System.out.println(techObj.isTodayAHoliday());
		System.out.println();



		

	}

	
	 

}
