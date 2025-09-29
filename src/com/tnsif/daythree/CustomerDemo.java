package com.tnsif.daythree;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer C1 = new Customer();
		C1.setId(101);
		C1.setName("Rose");
		C1.setCity ("Chennai");
		Customer C2 = new Customer();                   
		C2.setId (102);
		C2.setName( "Sam");
		C2.setCity ("Mumbai");
		System.out.println(C2);
		System.out.println(C1);
		System.out.println(C2);
		
	}

}
