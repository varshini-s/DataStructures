package com.bridgelabz.datastructures;

public class MyBinaryTree<K extends Comparable<K>>

{
	private MyBinaryNode<K> root;
	
	public void add(K key)
	{
		this.root=this.addRecursively(root,key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) 
	
	{
		
		if(current==null)
			return new MyBinaryNode<>(key);
		int compareResult=key.compareTo(current.key);
		if (compareResult==0) return current;
		if(compareResult<0)
		{
			current.left=addRecursively(current.left,key);
		}
		else
		{
			current.right=addRecursively(current.right, key);
		}
		return current;
	}
	
	public int getSize()
	{
		return getSizeRecursively(root);
	}

	private int getSizeRecursively(MyBinaryNode<K> current) 
	{
		
		return (current==null)?0:1 +getSizeRecursively(current.left)+getSizeRecursively(current.right);
	}
	
	public boolean search(K key)
	{
		
		MyBinaryNode<K> current=root;
		while(current!=null)
		{
			if((current.key.compareTo(key))<0)
			{
				current=current.right;
			}
			else if((current.key.compareTo(key))>0)
			{
				current=current.left;
				
			}
			else
			{
				return true;
			}
		}
		
	
		return false;
	}

}
