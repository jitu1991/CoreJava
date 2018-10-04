package com.test.hackerrank;

import java.util.Scanner;

class Node {
	int data;
	TreeNode next;
	Node(int d) {
        data = d;
        next = null;
    }
}

public class Day15Solution {/*
	
	public static TreeNode insert(TreeNode head,int data) {
		
		TreeNode newData = new TreeNode(data);
		if(head == null) {
			return new TreeNode(data);
		}
		
		newData.next = null;
		TreeNode lastNode = head;
		
		while(lastNode.next != null) {
			lastNode = lastNode.next;
		}
		lastNode.next = newData;
		
		return head;
		Node temp = new Node(data);
		Node current = head;

		if (current != null) {
			while (current.next != null) {
				current = current.next;
			}
			current.next = temp;
		} else {
			head = temp;
		}
		    
		    return head;
		
		
		if(head == null) {
			return new Node(data);
		} else if(head.next == null){
			head.next = new Node(data);
		} else {
			insert(head.next, data);
		}
		return head;
    }
	
	public static void display(TreeNode head) {
        TreeNode start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
	
	  public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        TreeNode head = null;
	        int N = sc.nextInt();

	        while(N-- > 0) {
	            int ele = sc.nextInt();
	            head = insert(head,ele);
	        }
	        display(head);
	        sc.close();
	    }

*/}
