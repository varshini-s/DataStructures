package com.bridgelabz.datastructures;
import com.bridgelabz.datastructures.*;


public class MyQueue<K>
{
	private final MyLinkedList myLinkedList;

	public MyQueue() 
	{
		this.myLinkedList = new MyLinkedList();
	}

	
	public void enqueue(INodeIF<K> newNode)
	{
		myLinkedList.appendNode(newNode);
		
	}
	
	public void printQueue()
	{
		myLinkedList.printMyNodes();
	}
	
	public INodeIF<K> dequeue()
	{
		
		return myLinkedList.pop();
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
