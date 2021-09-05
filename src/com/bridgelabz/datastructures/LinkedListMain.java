package com.bridgelabz.datastructures;

public class LinkedListMain {

	public static void main(String[] args) 
	
	{
		
		
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode= new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyNode<Integer> fourthNode = new MyNode<Integer>(20);

		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addNode(firstNode);
		myLinkedList.appendNode(thirdNode);
		myLinkedList.insertAfterGivenNode(firstNode, secondNode);
		
		Integer key=30;
		System.out.println("Searching node with given key value "+key);
		if(myLinkedList.search(key)!=null)
		System.out.println("Key found :"+myLinkedList.search(key).getKey());
		else
			System.out.println("Key not found in linked list");
		
		
		MyNode<Integer> newNode = new MyNode<Integer>(40);
		myLinkedList.insertAfterGivenKey(30, newNode);
		
		Integer keyToDelete=30;
		System.out.println(myLinkedList);
		System.out.println("before deleting, size of linked list is: "+myLinkedList.size());
		myLinkedList.deleteGivenKeyNode(keyToDelete);
		System.out.println("After deleting, size of linked list is: "+myLinkedList.size());
		myLinkedList.printMyNodes();
		myLinkedList.popLast();
		myLinkedList.printMyNodes();
		
		MyNode<Integer> newNode2 = new MyNode<Integer>(2);
		MyNode<Integer> newNode3 = new MyNode<Integer>(3);
		MyNode<Integer> newNode4 = new MyNode<Integer>(4450);
		myLinkedList.printMyNodes();

		myLinkedList.addNode(newNode4);
		myLinkedList.addNode(newNode3);
		myLinkedList.addNode(newNode2);
		myLinkedList.printMyNodes();

		System.out.println(myLinkedList.getIndex(56));
		
		System.out.println("Ordered list :");
		
		MyOrderedList<Integer> orderedList = new MyOrderedList<Integer>();
		MyNode<Integer> FirstNodeForOrdered = new MyNode<Integer>(4);
		MyNode<Integer> secondNodeForOrdered= new MyNode<Integer>(5);
		MyNode<Integer> thirdNodeForOrdered = new MyNode<Integer>(3);
		MyNode<Integer> fourthNodeForOrdered = new MyNode<Integer>(20);
		orderedList.addIncreasingOrder(FirstNodeForOrdered);
		orderedList.addIncreasingOrder(secondNodeForOrdered);
		orderedList.addIncreasingOrder(thirdNodeForOrdered);
		orderedList.addIncreasingOrder(fourthNodeForOrdered);
		orderedList.printMyNodes();
		
		
		
		
		

	}

}
