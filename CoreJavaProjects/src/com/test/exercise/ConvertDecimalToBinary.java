package com.test.exercise;

public class ConvertDecimalToBinary {
	public static void main(String[] args) {
		int num = 4;//524275;//1111111111111110011
		String binaryNum = "";
		while(num/2 != 0) {
			//System.out.println("num "+num);
			binaryNum = binaryNum+num%2;
			num = num/2;
			//System.out.println("num%2 "+num);
		}
		binaryNum = binaryNum+Integer.toString(num%2);
		System.out.println(binaryNum);
		System.out.println(new StringBuffer(binaryNum).reverse());
		System.out.println(isBinaryNum(13001));
	}
	
	public static boolean isBinaryNum(int num) {
		boolean isBinary = true;
		while(true) {
			if(num == 0) {
				break;
			} else {
				int temp = num%10;
				if(temp > 1) {
					isBinary = false;
					break;
				}
				num = num/10;
			}
		}
		return isBinary;
	}
}
