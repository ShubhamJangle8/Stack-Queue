package com.linkedlist.mystack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyQueueTest {

	@Test
	public void whenEnqueueCalled_shouldReturn_true() {
		MyNode<Integer> first = new MyNode<Integer>(56);
		MyNode<Integer> second = new MyNode<Integer>(30);
		MyNode<Integer> third = new MyNode<Integer>(70);
		MyQueue<Integer> myQueue = new MyQueue<>();
		assertTrue(myQueue.enqueue(first));
		assertTrue(myQueue.enqueue(second));
		assertTrue(myQueue.enqueue(third));
		System.out.println("Current queue after adding nodes : ");
		myQueue.printQueue();
	}

	@Test
	public void whenDequeued_shouldRemoveAndReturn_FirstNode() {
		MyNode<Integer> first = new MyNode<Integer>(56);
		MyNode<Integer> second = new MyNode<Integer>(30);
		MyNode<Integer> third = new MyNode<Integer>(70);
		MyQueue<Integer> myQueue = new MyQueue<>();
		myQueue.enqueue(first);
		myQueue.enqueue(second);
		myQueue.enqueue(third);
		System.out.println("Current queue before dequeue: ");
		myQueue.printQueue();
		assertTrue(first.equals(myQueue.dequeue()));
		System.out.println("Current queue after dequeue : ");
		myQueue.printQueue();
	}
}