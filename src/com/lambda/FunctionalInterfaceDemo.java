package com.lambda;

// annotation for functional interface, in functional interface there could be only one ABSTRACT method but might be 
// multiple default method definition

@FunctionalInterface
public interface FunctionalInterfaceDemo {

	void method1(int num);

	default void method3() {
		System.out.println("this is default method");
	}
	
	default void method4() {
		System.out.println("this is default method 4");
	}
	
	default void method5() {
		System.out.println("this is default method 4");
	}
	
	static void StaticMethod(){
		System.out.println("This is static method inside interface");
	}
}
