package com.test.hackerrank;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day23Solution {

	static void levelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		
		if(root!=null) {
			queue.add(root);
		}
		
		while(!queue.isEmpty()) {
			TreeNode n = queue.remove();
			System.out.println(n.data);
			if(n.left!=null) {
				queue.add(n.left);
			}
			if(n.right!=null) {
				queue.add(n.right);
			}
		}
			

		
		
		/*if(root == null) {
			System.out.println("Invalid Input");
		} else {
			if(root.left != null) {
				System.out.println(root.data);
				//levelOrder(root.left);
			}
			if(root.right != null) {
				System.out.println(root.left.data);
			}
		}*/
	}

	public static TreeNode insert(TreeNode root, int data) {
		if (root == null) {
			return new TreeNode(data);
		} else {
			TreeNode cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		TreeNode root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}
}
