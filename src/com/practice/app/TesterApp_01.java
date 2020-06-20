package com.practice.app;

import com.practice.bean.Employee;

public class TesterApp_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Added by kishor
		Employee ki01 = new Employee(101, "Kishor", 501);
		System.out.println("existing : "+ki01);
		
		// Modification by Kishor after Sagar's branch - 1
		
		Employee ki02 = new Employee(104, "Kumar", 502);
		System.out.println("newly added "+ki02);

	}

}
