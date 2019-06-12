package com.test.hfdp.state;

public class SoldOutState implements State {

	GumballMachine machine = new GumballMachine(5);

	public SoldOutState(GumballMachine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("cant insert quarter as machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("cant eject havent inserted a quarter yet");
	}

	@Override
	public void turnCrank() {
		System.out.println("turned but there are no gumballs");
	}

	@Override
	public void dispense() {
		System.out.println("no gumball dispensed");
	}

}
