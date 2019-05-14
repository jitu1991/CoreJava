package com.test.hfdp;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("silence");		
	}

}
