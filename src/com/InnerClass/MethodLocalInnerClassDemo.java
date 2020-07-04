package com.InnerClass;

public class MethodLocalInnerClassDemo {

	private int outerInt = 10;

	public void localDemo() {
		int methodInnerInt = 5000;
		
		// Method Local Inner Class
		class ClassInsideMethod {
			int num1 = methodInnerInt;
			int num2 = outerInt;

			void add() {
				int add = this.num1 + this.num2;
				System.out.println("Addition of number inside method = " + add);
			}
		}

		ClassInsideMethod cl = new ClassInsideMethod();
		cl.add();
	}

	public static void main(String[] args) {
		System.out.println(" THis is main method");

		MethodLocalInnerClassDemo demo = new MethodLocalInnerClassDemo();
		demo.localDemo();

	}

}
