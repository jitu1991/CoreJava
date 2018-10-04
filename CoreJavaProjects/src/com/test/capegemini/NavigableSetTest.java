package com.test.capegemini;
import static java.lang.System.out;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {
	public static void main(String[] args) {
		NavigableSet<String> strSet = new TreeSet<String>();
		Collections.addAll(strSet, "set","shell","soap","swan");
		out.println(strSet.headSet("soap", true));
		out.println(strSet.headSet("soap", false));
		out.println(strSet.tailSet("soap", true));
		out.println(strSet.tailSet("soap", false));
	}
}
