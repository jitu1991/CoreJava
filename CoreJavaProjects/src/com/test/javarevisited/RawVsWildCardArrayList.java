package com.test.javarevisited;

import java.util.ArrayList;

public class RawVsWildCardArrayList {

	/** Java Program to demonstrate difference between ArrayList and ArrayList */
	    public static void main(String args[]) {
	    	
	        ArrayList<String> names = new ArrayList<String>();
	        names.add("Java");
	        
	        // you can pass any type of ArrayList of to both methods
	        printRawTypeList(names);
	        printWildcardList(names);
	    }
	    /*
	     * Java method which takes an ArrayList of raw types and print elements on console */
	    public static void printRawTypeList(ArrayList rawType){
	        for(Object obj : rawType){
	            System.out.println(obj);
	        }
	        
	        rawType.add(101); // OK
	        rawType.add("101");  // OK
	        rawType.add(121.00);  // OK
	    }

	    /* Java method which prints ArrayList of unbounded wildcard */
	    public static void printWildcardList(ArrayList<?> unbounded){
	        
	        // since ? doesn't specify any type, you can simply use object
	        for(Object obj : unbounded){
	            System.out.println(obj);
	        }
	        
	        //unbounded.add("101");  //  NOT OK
	        //unbounded.add(101); // NOT OK
	        //unbounded.add(121.00);  // NOT OK
	    }
	}
	