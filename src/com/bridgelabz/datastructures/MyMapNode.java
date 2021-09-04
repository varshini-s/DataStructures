package com.bridgelabz.datastructures;
import com.bridgelabz.datastructures.*;


public class MyMapNode<K,V> implements INodeIF<K>
{
	K key;
	V value;
	MyMapNode<K, V> next;
	
	
	public MyMapNode(K key,V value) 
	{
		this.key=key;
		this.value=value;
		next=null;
		
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

	@Override
	public INodeIF<K> getNext() 
	{
		return next;
	}

	@Override
	public void setNext(INodeIF<K> next) 
	{
		this.next=(MyMapNode<K, V>) next;
		
	}
	
	public V getValue()
	{
		return value;
	}
	
	public void setValue(V value)
	{
		
		this.value=value;
	}
	
	public String toString()
	{
		StringBuilder myMapNodesString = new StringBuilder();
		myMapNodesString.append("MyMapNode("+"K=").append(this.key)
						.append(" V=").append(value).append("}");
		
		if(next!=null)
		{
			myMapNodesString.append("->").append(next);
		}
		
		return myMapNodesString.toString();
		
	}
	
	

}
