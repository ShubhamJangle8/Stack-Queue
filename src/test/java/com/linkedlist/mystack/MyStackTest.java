package com.linkedlist.mystack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyStackTest {

	@Test
	public void whenPushed_shouldReturn_true() {
		MyNode<Integer> first = new MyNode<Integer>(70);
		MyNode<Integer> second = new MyNode<Integer>(30);
		MyNode<Integer> third = new MyNode<Integer>(56);
		MyStack<Integer> myStack = new MyStack<>();
		assertTrue(myStack.push(first));
		assertTrue(myStack.push(second));
		assertTrue(myStack.push(third));
		System.out.println("Current stack is : ");
		myStack.printStack();
	}

	@Test
	public void whenPeeked_shouldReturn_TopNode() {
		MyNode<Integer> first = new MyNode<Integer>(70);
		MyNode<Integer> second = new MyNode<Integer>(30);
		MyNode<Integer> third = new MyNode<Integer>(56);
		MyStack<Integer> myStack = new MyStack<>();
		myStack.push(first);
		myStack.push(second);
		myStack.push(third);
		assertTrue(third.equals(myStack.peek()));
	}

	@Test
	public void whenPopped_shouldRemoveAndReturn_TopNode() {
		MyNode<Integer> first = new MyNode<Integer>(70);
		MyNode<Integer> second = new MyNode<Integer>(30);
		MyNode<Integer> third = new MyNode<Integer>(56);
		MyStack<Integer> myStack = new MyStack<>();
		myStack.push(first);
		myStack.push(second);
		myStack.push(third);
		assertTrue(third.equals(myStack.pop()));
		System.out.println("Current stack after popping is : ");
		myStack.printStack();
	}

}