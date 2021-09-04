package com.bridgelabz.datastructures;

public class MyNode<K extends Comparable<K>> implements INodeIF<K>

{
	
	private K key;
	private INodeIF<K> next;

	

	public MyNode(K key)
	{
		
		this.key=key;
		this.next=null;
	}
	
	public INodeIF<K> getNext() 
	{
		return next;
	}

	@Override
	public void setNext(INodeIF<K> next) 
	{
		this.next = next;
		
	}

	

	@Override
	public K getKey() 
	{
		return key;
	}

	@Override
	public void setKey(K key) 
	{
		this.key=key;
	}
	
	public String toString()
	{
		StringBuilder myNodeString = new StringBuilder();
		myNodeString.append("MyNode{"+"key=").append(key).append("}");
		if(next!=null)
			myNodeString.append("->").append(next);
		return myNodeString.toString();
		
	}

	

}
