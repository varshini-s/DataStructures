package com.bridgelabz.datastructures;

public class MyDeque<K>

{


	private final MyLinkedList myLinkedList;

	public MyDeque() 
	{
		this.myLinkedList = new MyLinkedList();
	}


	
	public void addRear(INodeIF<K> newNode)
	{
		myLinkedList.appendNode(newNode);
		
	}
	
	
	public void addFront(INodeIF<K> newNode)
	{
		myLinkedList.addNode(newNode);
		
	}
	
	
	public INodeIF<K> removeFront()
	{
		
		return myLinkedList.pop();
	}
	public INodeIF<K> removeRear()
	{
		
		return myLinkedList.popLast();
	}
	
	
	public void printQueue()
	{
		myLinkedList.printMyNodes();
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
