package com.test.misc;

public class LookAndSaySequence {
public static void main(String[] args) {
	String a = "1";
	String b = "";
	
	for(int i = 0; i < 30; i++) {
		int j = 0;
		int k = 0;
		while(j < a.length()) {
			while(k < a.length() && a.charAt(j) == a.charAt(k)) {
				k += 1;
			}
			b += String.valueOf(k - j) + a.charAt(j);
			j = k;
		}
		System.out.println(b);
		a = b;
		b = "";
	}
	System.out.println(a.length());
	
	/*for i in range(0,30):
			    j = 0
			    k = 0
			    while j < len(a):
			        while k < len(a) and a[k] == a[j]:
			            k += 1
			        b += str(k-j) + a[j]
			        j = k
			    print(b)
			    a = b
			    b = ''
			print(len(a))*/

}
}
