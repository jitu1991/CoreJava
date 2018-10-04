package com.test.capegemini;
class Hash1 {
	private int i1;
	public int hashCode() {
		return 1;
	}
}
class Hash2 {
	private int i1;
	public int hashCode() {
		return -1;
	}
}
public class OverrideHashcode {
	private int i1;
	public int hashCode() {
		return i1;
	}
}
