package CollectionImplementation;

public class StackImpl {

	private int[] stackRef;
	private int capacity;
	private int top = 0;
	// int stack

	StackImpl(int initialcapcity) {
		this.stackRef = new int[initialcapcity];
		this.capacity = initialcapcity;
	}

	StackImpl() {
		this(10);
	}

	// push(int)- inserting integer into stack

	public void push(int element) {
		if (isFull()) {
			System.out.println("Stack is full, Element can not inserted");
			return ;
		}
		stackRef[top] = element;
		System.out.println("Element " + element + " inserted into stack at position " + top);
		top++;
	}

	// pop()- remove top integer from stack
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		int removedElement = stackRef[--top];
		System.out.println("Element " + removedElement + " removed from stack at position " + top);
		return removedElement;
	}

	// peek()- return top integer from stack without remove element
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		int topElement = stackRef[top - 1];
		System.out.println("TOP Element is " + topElement + " in stack at position " + (top-1));
		return topElement;
	}

	public void showAllElements() {
		for (int stackIndex = 0; stackIndex < top; stackIndex++) {
			System.out.println(stackRef[stackIndex]);
		}
	}

	public int stackSize() {
		return top;
	}

	public boolean isEmpty() {
		return (top == 0);
	}

	public boolean isFull() {
		return (top == capacity);
	}

}
