package com.lambda;

class  AnonymousClassDemo {

	public void printClassName () {		
		System.out.println("This is outer class - AnonymousClassDemo");
	}
	
 public static void main(String[] args) {
	
	 System.out.println("THis is main method in class AnonymousClassDemo");
	 AnonymousClassDemo innerClassObject = new AnonymousClassDemo(){
			public void printClassName () {		
				System.out.println("This is overridden method in Annonymous inner class");
			}			
	 };
	 
	 System.out.println("**Calling method with object of outer class AnonymousClassDemo");
	 AnonymousClassDemo anonymousClassDemo = new AnonymousClassDemo();
	 anonymousClassDemo.printClassName();
	 
	 System.out.println("##Calling method with object of Annonymous inner class");
	 innerClassObject.printClassName();
	 
}
	
}
