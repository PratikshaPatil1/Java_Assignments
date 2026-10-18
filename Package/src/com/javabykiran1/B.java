package com.javabykiran1;

import com.jbk1.A;

public class B {

	public static void main(String[] args) {

		A aa = new A();
		
		//aa.m1(); // private: Error
		//aa.m2(); //default: Error
		//aa.m3(); //protected: Error
		aa.m4(); //public: Valid
	}

}
