package com.InnerClass;

public class AnonymousInnerClassdemo extends InnerClassDemo {

	int outerInt = 60;

	InnerClassDemo obj = new InnerClassDemo() {
		public void show() {
			System.out.println("this is show method inside class AnonymousInnerClassdemo");
		}

	};

	public static void main(String[] args) {
		System.out.println("This is main method ");
		AnonymousInnerClassdemo anonym = new AnonymousInnerClassdemo();
		anonym.obj.show();
		
		System.out.println("call method from super class");
		AnonymousInnerClassdemo obj1 =  (AnonymousInnerClassdemo)  anonym;
		obj1.show();
	}

}
