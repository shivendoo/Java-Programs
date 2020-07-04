package com.InnerClass;

import com.InnerClass.InnerClassDemo.Inside;

public class InnerClassObject {

	public static void main(String[] args) {
		
		System.out.println("This is main method");
//
		InnerClassDemo outer = new InnerClassDemo();
//		System.out.println("Outer class element " + outer.outerInt);
//		System.out.println("Outer class element " + outer.outerString);
//		
//		System.out.println("Create object of Inner class");
		
		Inside in ;//= new Inside();
		// Non static Ineer class object reference 
		//in = outer.new Inside();
		// Static Ineer class object reference 
		in = new InnerClassDemo.Inside();
		
		System.out.println(in.innerInt);
		System.out.println(in.doubleOuter);
		
		System.out.println(in.innerString);
	//	System.out.println(in.ConcateString);
		

	}

}
