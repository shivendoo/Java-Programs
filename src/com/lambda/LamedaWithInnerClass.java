package com.lambda;
import java.util.function.*;

// Interface FunctionalInterfaceDemo me 1 abstract method hai -  method1
public class LamedaWithInnerClass 
{
	public void method1() {
		System.out.println("this is method1 implementation in class LamedaWithInnerClass");
	}


	public static void main(String[] args) {
		System.out.println("This is main methos");
		// inner class implementation 
		AnonymousClassDemo lm = new AnonymousClassDemo() {
			public void printClassName() {
				System.out.println("This is Inner class implementation in class LamedaWithInnerClass");
			}
		};
		lm.printClassName();
		
		// Now Implementing method of a interface via lambda
		// FunctionalInterfaceDemo obj = ()->{};
		
		FunctionalInterfaceDemo abc = num ->System.out.println("This is Lambada implementation with sigle row ->"+num);
			
		FunctionalInterfaceDemo cd = num ->{System.out.println("This is Lambada implementation with multiple row ->"+num);
		System.out.println("Doule is -->"+ num*2);
		System.out.println("Triple is -->"+ num*3);
		};
			
		System.out.println("Lambada with single line");
		abc.method1(100);
		System.out.println("Lambada with multiple line");
		cd.method1(200);
		
		
		// using PreExisting methos of java.util.function package which input one integer and reurne none-void smae as interface 
		//java.util.function.Consumer - method accept(<T>)-Returns a composed Consumer that performs, in sequence, this operation
		// followed by the after operation.
		Consumer consumerInterfaceObject = s -> System.out.println("Print value of object whcih passed in accept method->"+s); 
		consumerInterfaceObject.accept("shivendra");
		consumerInterfaceObject.accept(1505675);
		

	}

}
