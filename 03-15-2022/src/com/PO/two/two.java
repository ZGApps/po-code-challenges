package com.PO.two;

import java.util.HashMap;
import java.util.Stack;

public class two {

	public static void main(String[] args) {
		
		customStack stack = new customStack();
		
		stack.push(5);
		
		stack.push(11);
		
		stack.push(10);
		
		stack.push(8);
		
		System.out.println("max is " + stack.max());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("max is " + stack.max());
		
	}
	
	

}

class customStack {
	
	HashMap<Integer, Integer> myStack = new HashMap<Integer, Integer>();
	
	Stack<Integer> tracker = new Stack<Integer>();
	
	
	int top = -1;
	int nextTop = 0;
	int bottom = 0;



	public void push(int in){
		myStack.put(nextTop, in);
		System.out.println("added " + in + " to myStack");
		if(nextTop==0) {
			tracker.push(in);
			System.out.println("added " + in + " to tracker");
		}else if(in>tracker.peek()) {
			tracker.push(in);
			System.out.println("added " + in + " to tracker");
		}
		top = nextTop;
		nextTop +=1;
		
	}

	public int max() {
		if(top<bottom) {
			throw new IndexOutOfBoundsException("Stack is Empty");
		}
		return tracker.peek();
	}

	public int pop() {
	
		if(top<bottom) {
			throw new IndexOutOfBoundsException("Stack is Empty");
		}
	
		int result = myStack.get(top);
		myStack.remove(top);
		System.out.println("removed" +result+ " from myStack");
		if(result == tracker.peek()) {
			tracker.pop();
			System.out.println("removed " + result + " from tracker");
		}

		top -=1;
		nextTop -=1;
		return result; 
	}

}
