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
	public void insertAfterGivenNode(INodeIF<K> myNode,INodeIF<K> newNode)
	{
		INodeIF<K> tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
		
		
	}
	
	public void insertAfterGivenKey(K key,INodeIF<K> newNode)
	{
		
		INodeIF<K> tempNode=search(key);
		if(tempNode==this.tail)
		{
			appendNode(newNode);
		}
		else
		{
			newNode.setNext(tempNode.getNext());
			tempNode.setNext(newNode);
		}
		
	}
	
	public int size()
	{
		int listSize=0;
		INodeIF<K> tempNode=head;
		if(tempNode!=null)
		while(tempNode!=tail)
		{
			listSize++;
			tempNode=tempNode.getNext();
			
		}
		listSize++;
		
		return listSize;
	}
	public INodeIF<K> pop()
	{
		if(head==tail)
		{
			INodeIF<K> tempNode= head;
			this.head=null;
			this.tail=null;
			return tempNode;  
		}
		else
		{
			INodeIF<K> tempNode=head;
			this.head=head.getNext();
			
			return tempNode;
			
			
		}
		
	}
	public INodeIF<K> popLast()
	{
		if(head==tail)
		{
			INodeIF<K> tempNode= head;
			this.head=null;
			this.tail=null;
			return tempNode; 
		}
		else
		{
			INodeIF<K> tempNode= head;
			while(tempNode.getNext()!=tail)
			{
				
				tempNode=tempNode.getNext();
				
			}
			
			this.tail=tempNode;
			tempNode=tempNode.getNext();
			this.tail.setNext(null);
			return tempNode;
			
		}
		
		
	}
	public INodeIF<K> deleteGivenKeyNode(K key)
	{
		INodeIF<K> tempNode=search(key);
		
		if(tempNode==head)
		{
			tempNode=pop();
		}
		else if(tempNode==tail)
		{
			tempNode=popLast();
		}
		else
		{
			INodeIF<K> previousNode=head;
			while(previousNode.getNext()!=tempNode)
			{
				previousNode=previousNode.getNext();
			}
			
			previousNode.setNext(tempNode.getNext());
			
		}
		return tempNode;
		
	}
	public INodeIF<K> search(K key)
	{
		INodeIF<K> tempNode = head;
		INodeIF<K> requiredNode=null;
		if(tempNode!=null)
		{
			while( (tempNode.getNext()!=null) && (tempNode.getKey().equals(key)==false))
			{
				
				
				tempNode=tempNode.getNext();
			}
			if(tempNode.getKey().equals(key))
			{
				requiredNode=tempNode;
			}
			
		}
			
			
		return requiredNode;
		
		
	}
	
	
	
	public void  printMyNodes()
	{
		 System.out.println("My nodes: "+ head);
	}
	
	@Override
	public String toString()
	{
		
		return "MyLinkedListNodes{"+ head+'}';
	}
	public boolean isEmpty()
	{
		if(head==null || tail==null)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	

}
