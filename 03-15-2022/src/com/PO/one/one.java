package com.PO.one;

import java.util.ArrayList;

public class one {

	public static void main(String[] args) {
		
		
		MyList listA = new MyList();
		MyList listB = new MyList();
		
		listA.addNode(2);
		listA.addNode(5);
		listA.addNode(10);
		listA.addNode(7);
		
		listB.addNode(3);
		listB.addNode(7);
		listB.addNode(24);
		listB.addNode(12);

		findIntersection(listA, listB);

	}
	

	public static void findIntersection(MyList a, MyList b) {
		int result =-1;
		
		ArrayList<Integer> hold = new ArrayList<Integer>();
		Node currentA = a.head;
		Node currentB = b.head;
		
		do {
			hold.add(currentA.data);
			currentA = currentA.next;
		}while (currentA != null);
		
		do {
			if(hold.contains(currentB.data)) {
				result = currentB.data;
				break;
			}
			currentB = currentB.next;
		}while (currentB !=null);
		
		System.out.println("The node that the list intersect at contains: " + result);
		
	}

}



class MyList{
	
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int in) {
		Node newNode = new Node(in);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
		
	}
	
}

class Node{
	
	int data;
	Node next;
	
	public Node(int in) {
		this.data = in;
		this.next = null;
	}
	
}