package com.InnerClass;

public class InnerClassDemo {

	private static int outerInt = 10;
	String outerString = "Outer Class";

	// Static Inner Class
	public static class Inside {

		int innerInt = 50;
		String innerString = "Inner Class";
		int doubleOuter = outerInt * 2;
		// String ConcateString = outerString + innerString;
	}

	public void show() {
		System.out.println("this is InnerClass Demo Class ");
	}

	public static void main(String[] args) {
		System.out.println("This is main method");

		InnerClassDemo outer = new InnerClassDemo();
		System.out.println("Outer class element " + outer.outerInt);
		System.out.println("Outer class element " + outer.outerString);

		System.out.println("Create object of Inner class");

		InnerClassDemo.Inside in;// = new Inside();
		// in = outer.new Inside();
		// static class
		in = new InnerClassDemo.Inside();
		int temp = InnerClassDemo.outerInt;

		System.out.println(in.innerInt);
		System.out.println(in.doubleOuter);

		System.out.println(in.innerString);
		// System.out.println(in.ConcateString);

		// System.out.println(in.outerInt);

	}

}
