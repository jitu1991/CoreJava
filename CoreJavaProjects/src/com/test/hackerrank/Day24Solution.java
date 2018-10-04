package com.test.hackerrank;

import java.util.Scanner;

class ListNode {
	int data;
	ListNode next;

	ListNode(int d) {
		data = d;
		next = null;
	}

}

public class Day24Solution {

	public static ListNode removeDuplicates(ListNode head) {
		if(head == null) {
			return head;
		} else {
			ListNode cur = head;
			while (cur.next != null) {
				if(cur.data != cur.next.data) {
					cur = cur.next;
				} else {
					cur.next = cur.next.next;
				}

			}
			return head;
		}

	}

	public static ListNode insert(ListNode head, int data) {
		ListNode p = new ListNode(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			ListNode start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(ListNode head) {
		ListNode start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ListNode head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		
		//head = removeDuplicates(head);
		//display(head);

	}
}
