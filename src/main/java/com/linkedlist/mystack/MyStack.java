package com.linkedlist.mystack;

public class MyStack<k> {
	MyLinkedList<k> myLinkedList;

	public MyStack() {
		myLinkedList = new MyLinkedList<k>();
	}

	public boolean push(INode<k> node) {
		if (myLinkedList.addAtHead(node))
			return true;
		return false;
	}

	public void printStack() {
		myLinkedList.printStack();
	}
}
