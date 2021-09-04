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

}
