package com.test.exception;

public class OnlineStockTrading {
	public static void main(String args[]) throws ClassNotFoundException {
		Class.forName("com.test.exception.StockTrading");
		System.out.println("StockTrading class successfully loaded");
	}
}
