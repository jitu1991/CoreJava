package com.test.pattern.decorator;

public class CurrencyCheck {

	 public static void main(String[] args) {

	  // without adding decorators
	  Currency curr = new Doller();
	  System.out.println(curr.getCurrencyDescription() +" dollar. "+curr.cost(2.0));

	  //adding decorators
	  Currency curr2 = new USDDecorator(new Doller());
	  System.out.println(curr2.getCurrencyDescription() +" dollar. "+curr2.cost(4.0));
	  Currency curr3 = new SGDDecorator(new Doller());
	  System.out.println(curr3.getCurrencyDescription() +" dollar. "+curr3.cost(4.0));
	}

}