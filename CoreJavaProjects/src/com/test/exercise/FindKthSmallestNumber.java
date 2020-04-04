package com.test.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindKthSmallestNumber {
	public static void main(String[] args) {
		int a[] = { 7, 10, 4, 3, 20, 15 };
		int k = 3;
		Arrays.sort(a);
		System.out.println(a[k-1]);
		
		/*List<Integer> nums = new ArrayList<Integer>();
		nums.add(7);
		nums.add(10);
		nums.add(4);
		nums.add(3);
		nums.add(20);
		nums.add(15);
		
		Set s = new TreeSet<>(nums);
		//System.out.println(s);
		List<Integer> nums1 = new ArrayList<>(s);
		System.out.println(nums1.get(k-1));*/
	}
}
