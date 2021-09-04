package com.bridgelabz.datastructures;

import com.bridgelabz.datastructures.MyLinkedList;

public class MyHashMap<K,V>

{
	MyLinkedList<K> myLinkedList;
	
	public MyHashMap() 
	
	{
		this.myLinkedList=new MyLinkedList<>();
	}

	public V get(K key)
	{
		
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
		return (myMapNode==null)? null : myMapNode.getValue();
	}


	public void add(K key,V value) 
	{
		MyMapNode<K, V> newNode= (MyMapNode<K, V>) this.myLinkedList.search(key);
		if(newNode==null)
		{
			newNode=new MyMapNode<>(key,value);
			this.myLinkedList.appendNode(newNode);
		}
		else
		{
			newNode.setValue(value);
		}
		
		
	}
	
	public String toString()
	{
		return "MYHashMapNodes{"+ myLinkedList+'}';
	}
}
