package com.test.test;

class Node {
	public int data;
	public Node prev;
	public Node next;

	Node(int data) {
		this.data = data;
	}
	Node() {

	}
}

class DLinkedList {
	Node head;
	void swapAdjacentData() {
		Node current = head;

		while (current!= null && current.next != null) {
			int temp = current.data;
			current.data = current.next.data;
			current.next.data = temp;

			current = current.next.next;
		}
	}

	public void printElement() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}

public class DoubleyLinkedListTest {
	public static void main(String[] args) {

		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);

		DLinkedList dLinkedList = new DLinkedList();
		dLinkedList.head = first;
		dLinkedList.head.next = second;
		dLinkedList.head.next.prev = dLinkedList.head;


		dLinkedList.head.next.next = third;
		dLinkedList.head.next.next.prev = dLinkedList.head.next;

		dLinkedList.head.next.next.next = fourth;
		dLinkedList.head.next.next.next.prev = dLinkedList.head.next.next;


		dLinkedList.printElement();
		dLinkedList.swapAdjacentData();
		System.out.println("After swap:");
		dLinkedList.printElement();
	}


}