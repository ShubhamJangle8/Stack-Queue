package com.linkedlist.mystack;

public class MyQueue<K> {
	MyLinkedList<K> myLinkedList;

	public MyQueue() {
		myLinkedList = new MyLinkedList<K>();
	}

	public boolean enqueue(INode<K> node) {
		return myLinkedList.addAtTail(node);
	}

	public INode<K> dequeue() {
		return myLinkedList.pop();
	}	
	
	public void printQueue() {
		myLinkedList.printNodes();
	}
}

