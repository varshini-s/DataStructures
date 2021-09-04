package com.bridgelabz.datastructures;
import com.bridgelabz.datastructures.MyLinkedList;

public class MyOrderedList<K extends Comparable<K>>

{
	private final MyLinkedList<K> linkedlist;
	
	public MyOrderedList() 
	{
		this.linkedlist=new MyLinkedList<K>();
	}
	
	public void addIncreasingOrder(INodeIF<K> newNode)
	{
		if(this.linkedlist.tail==null)
		{
			this.linkedlist.tail=newNode;
		}
		if(this.linkedlist.head==null)
		{
			this.linkedlist.head=newNode;
		}
		else
		{
			INodeIF<K> tempNode=linkedlist.head;
			INodeIF<K> prevNode=linkedlist.head;
			
			while(tempNode.getKey().compareTo(newNode.getKey())<0 && tempNode.getNext()!=null)
			{
				prevNode=tempNode;
				tempNode=tempNode.getNext();
			}
			
			if(tempNode==this.linkedlist.tail && tempNode.getKey().compareTo(newNode.getKey())<0)
			{
				
					tempNode.setNext(newNode);
					this.linkedlist.tail=newNode;
				
				
			}
			else if(tempNode==this.linkedlist.head && tempNode.getKey().compareTo(newNode.getKey())>0)
			{
				newNode.setNext(linkedlist.head);
				this.linkedlist.head=newNode;
				
			}
			else
			{
				prevNode.setNext(newNode);
				newNode.setNext(tempNode);
			}
			
			
		}
		
	
	
}