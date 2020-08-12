import java.util.Vector;

class MyStack {
	int tos; // Top Of Stack
	final int MAX;
	Vector<String> stk;
	
	MyStack(){
		// Default Constructor
		MAX = 20;
		tos = 0;
		stk = new Vector<String>(); // 10
	}
	
	void push(String str) {
		if(tos < MAX) {
			stk.add(str);
			tos++;
		}
	}
	
	String pop() {
		if(isEmpty()) {
			return null;
		} else {
			return stk.get(--tos);
		}
	}
	
	String peek() {
		if(isEmpty()) {
			return null;
		} else {
			return stk.get(tos - 1);
		}
	}
	
	boolean isEmpty() {
		if(tos == 0) {
			return true;
		} else {
			return false;
		}
	}
}

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack myStk = new MyStack();
		myStk.push("Apple");
		myStk.push("Straberry");
		myStk.push("Banana");
		
		System.out.println(myStk.pop());	// Banana
		System.out.println(myStk.peek());	// Straberry
		System.out.println(myStk.pop());	// Straberry
		System.out.println(myStk.peek());	// Apple
	}

}
