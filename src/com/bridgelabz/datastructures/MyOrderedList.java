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
	
	public void addDecreasingOrder(INodeIF<K> newNode)
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
			
			while(tempNode.getKey().compareTo(newNode.getKey())>0 && tempNode.getNext()!=null)
			{
				prevNode=tempNode;
				tempNode=tempNode.getNext();
			}
			
			if(tempNode==this.linkedlist.tail && tempNode.getKey().compareTo(newNode.getKey())>0)
			{
				
					tempNode.setNext(newNode);
					this.linkedlist.tail=newNode;
				
				
			}
			else if(tempNode==this.linkedlist.head && tempNode.getKey().compareTo(newNode.getKey())<0)
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
	
	public INodeIF<K> deleteGivenKeyNode(K key)
	{
		return linkedlist.deleteGivenKeyNode(key);
		
	}
	
	public INodeIF<K> pop()
	{
		
		INodeIF<K> tempNode= linkedlist.head;
		while(tempNode.getNext()!=linkedlist.tail)
		{
			
			tempNode=tempNode.getNext();
			
		}
		this.linkedlist.tail=tempNode;
		this.linkedlist.tail.setNext(null);
		tempNode=tempNode.getNext();
		return tempNode;
		
	}
	
	public int size()
	{ 
		return linkedlist.size();
	}

	public boolean isEmpty()
	{
		return linkedlist.isEmpty();
		
	}
	
	public int findIndex(K key)
	{
		int index=0;
		
		INodeIF<K> tempNode = linkedlist.head;

		while(tempNode.getNext()!=null && tempNode.getKey()!=key)
		{
			
			tempNode=tempNode.getNext();

			index++;
		}
		if(tempNode.getKey()==key)
		{
			return index;
		}
		else
			return -1;
		
		
		
		
	}
	
	public INodeIF<K> search(K key)
	{

		return linkedlist.search(key);
		
	}
	
	public INodeIF<K> remove(K key)
	{
		
		 return linkedlist.deleteGivenKeyNode(key);
		
		
	}
	
	public String toString()
	{
		return linkedlist.toString();
	}
	
	
	public void  printMyNodes()
	{
		
		linkedlist.printMyNodes();
	}
	
}