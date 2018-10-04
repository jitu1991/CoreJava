package com.test.java;

class LinkedList {
	Node1 head; // head of list

	/* Linked list Node */
	static class Node1 {
		int data;
		Node1 next;

		// Constructor to create a new node
		// Next is by default initialized as null
		Node1(int d) {
			data = d;
		}
	}
	
	/* This function is in LinkedList class. Inserts a
	   new Node at front of the list. */
	public void push(int new_data) {

	    /* 1 & 2: Allocate the Node &
	              Put in the data*/
		Node1 newNode = new Node1(new_data);
		
		 /* 3. Make next of new Node as head */
	    newNode.next = head;
	 
	    /* 4. Move the head to point to new Node */
	    head = newNode;
	}
	
	public void insert(int data) {

	    Node1 new_node = new Node1(data);
	    if (head == null)
	    {
	        head = new Node1(data);
	        return;
	    }
	    new_node.next = null;
	    
	    Node1 last = head; 
	    while (last.next != null)
	        last = last.next;
	 
	    /* 6. Change the next of last node */
	    last.next = new_node;
	    
	    return;
	
	}
	
	/* This function is in LinkedList class.
	   Inserts a new node after the given prev_node. This method is 
	   defined inside LinkedList class shown above */
	public void insertAfter(Node1 prev_node, int new_data)
	{
	    /* 1. Check if the given Node is null */
	    if (prev_node == null)
	    {
	        System.out.println("The given previous node cannot be null");
	        return;
	    }
	 
	    /* 2. Allocate the Node &
	       3. Put in the data*/
	    Node1 new_node = new Node1(new_data);
	 
	    /* 4. Make next of new Node as next of prev_node */
	    new_node.next = prev_node.next;
	 
	    /* 5. make next of prev_node as new_node */
	    prev_node.next = new_node;
	}
	
	/* Appends a new node at the end.  This method is 
	   defined inside LinkedList class shown above */
	public void append(int new_data)
	{
	    /* 1. Allocate the Node &
	       2. Put in the data
	       3. Set next as null */
	    Node1 new_node = new Node1(new_data);
	 
	    /* 4. If the Linked List is empty, then make the
	           new node as head */
	    if (head == null)
	    {
	        head = new Node1(new_data);
	        return;
	    }
	 
	    /* 4. This new node is going to be the last node, so
	         make next of it as null */
	    new_node.next = null;
	 
	    /* 5. Else traverse till the last node */
	    Node1 last = head; 
	    while (last.next != null)
	        last = last.next;
	 
	    /* 6. Change the next of last node */
	    last.next = new_node;
	    return;
	}
	
	public void printList() {
		Node1 n = head;
		
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		//LinkedList lList = new LinkedList();
		
		/*lList.head = new Node1(1);
		Node1 second = new Node1(2);
		Node1 third = new Node1(3);*/
		
		/* Three nodes have been allocated  dynamically.
        We have refernces to these three blocks as first,  
        second and third

        llist.head        second              third
           |                |                  |
           |                |                  |
       +----+------+     +----+------+     +----+------+
       | 1  | null |     | 2  | null |     |  3 | null |
       +----+------+     +----+------+     +----+------+ */
		
		//lList.head.next = second; // Link first node with the second node
		 
        /*  Now next of first Node refers to second.  So they
            both are linked.
 
         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  | null |     |  3 | null |
        +----+------+     +----+------+     +----+------+ */
		
		//second.next = third; // Link second node with the third node
		 
        /*  Now next of second Node refers to third.  So all three
            nodes are linked.
 
         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  |  o-------->|  3 | null |
        +----+------+     +----+------+     +----+------+ */
		
		
		 /* Start with the empty list */
        LinkedList llist = new LinkedList();
 
        // Insert 6.  So linked list becomes 6->NUllist
        //llist.append(6);
 
        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        //llist.push(7);
 
        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        //llist.push(1);
 
        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        //llist.append(4);
 
        // Insert 8, after 7. So linked list becomes
        // 1->7->8->6->4->NUllist
        //llist.insertAfter(llist.head.next, 8);
        
        llist.insert(9);
        llist.insert(8);
        llist.insert(7);
 
        System.out.println("\nCreated Linked list is: ");
		llist.printList();
	}
}
