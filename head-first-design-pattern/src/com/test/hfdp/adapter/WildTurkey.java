package com.test.hfdp.adapter;

public class WildTurkey implements Turkey {

	@Override
	public void fly() {
		System.out.println("wild turkey fly");
	}

	@Override
	public void qobble() {
		System.out.println("wild turkey qobble");
	}

}
