package CollectionImplementation;

import java.util.Stack;

public class StackRunner {

	public static void main(String[] args) {
	//	Stack st = new Stack();
		StackImpl stackObj = new StackImpl();
		stackObj.push(10);
		stackObj.push(15);
		stackObj.pop();
		stackObj.peek();
		stackObj.pop();
		stackObj.pop();
		stackObj.pop();
		stackObj.push(10);
		stackObj.push(15);
		stackObj.push(10);
		stackObj.push(15);	
		stackObj.push(15);
		stackObj.push(10);
		stackObj.push(15);
		stackObj.push(10);
		stackObj.push(15);	
		stackObj.push(123);
		stackObj.push(188);	
		

	}

}
