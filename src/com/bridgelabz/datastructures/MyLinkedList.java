package com.bridgelabz.datastructures;

public class MyLinkedList<K>

{
	public INodeIF<K> head;
	public INodeIF<K> tail;
	
	public MyLinkedList() 
	
	{
		this.head=null;
		this.tail=null;
		
	}
	
	public void  addNode(INodeIF<K> newNode)
	{
		if(this.tail==null)
		{
			this.tail=newNode;
		}
		if(this.head==null)
		{
			this.head=newNode;
		}
		else
		{
			INodeIF<K> tempNode=this.head;
			this.head=newNode;
			this.head.setNext(tempNode);
		}
		
	}
	public void appendNode(INodeIF<K> newNode)
	{
		if(this.head==null)
		{
			this.head=newNode;
		}
		if(this.tail==null)
		{
			this.tail=newNode;
		}
		else
		{
			
			
			this.tail.setNext(newNode);
			this.tail=newNode;
		}
		
		
	}
	
	

}
