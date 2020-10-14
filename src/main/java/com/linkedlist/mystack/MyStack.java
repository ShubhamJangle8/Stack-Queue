package com.linkedlist.mystack;

public class MyStack<k> {
	MyLinkedList<k> myLinkedList;

	public MyStack() {
		myLinkedList = new MyLinkedList<k>();
	}

	/**
	 * UC 1 push method pushes new node to stack
	 * 
	 * @param node
	 * @return
	 */
	public boolean push(INode<k> node) {
		if (myLinkedList.addAtHead(node))
			return true;
		return false;
	}

	public void printStack() {
		myLinkedList.printStack();
	}

	/**
	 * UC 2 returns top node of stack
	 * 
	 * @return
	 */
	public INode<k> peek() {
		return myLinkedList.head;
	}

	/**
	 * UC2 removes top element of stack and returns it
	 * 
	 * @return
	 */
	public INode<k> pop() {
		return myLinkedList.pop();
	}
}
