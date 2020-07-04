package com.shiven;

public interface InterfaceExample {
	
 void method1(int num);
 
 default String  method2(String str) {
	 return "Hi "+str+" Good Day ";
 }
 
 default String  method3(String str) {
	 return "Hi "+str+" Good Day ";
 }


}
