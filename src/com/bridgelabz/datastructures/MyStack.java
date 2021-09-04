package com.bridgelabz.datastructures;

import com.bridgelabz.datastructures.*;

public class MyStack<K> 

{
	private final MyLinkedList myLinkedList;
	
	public MyStack() 
	{
		this.myLinkedList = new MyLinkedList();
	}
	
	public void push(INodeIF<K> newNode)
	{
		myLinkedList.appendNode(newNode);
		
	}
	
	public void printStack()
	{
		myLinkedList.printMyNodes();
	}
	
	public INodeIF<K> peek()
	{
		return myLinkedList.head;
	}
	
	public INodeIF<K> pop()
	{
		return myLinkedList.popLast();
	}
	
	public boolean isEmpty()
	{
		return myLinkedList.isEmpty();
	}
	
	public int size()
	{
		return myLinkedList.size();
	}
	public String toString()
	{
		return myLinkedList.toString();
		
	}
	
}
