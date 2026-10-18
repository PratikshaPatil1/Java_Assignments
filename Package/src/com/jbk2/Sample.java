package com.jbk2;

public class Sample {

	public static void main(String[] args) {

		A obj = new A ();
		
		//System.out.println(obj.data); // Private: Error
		System.out.println(obj.data1);
		//obj.msg(); // compile time error
	}

}
