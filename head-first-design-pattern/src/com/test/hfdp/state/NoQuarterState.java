package com.test.hfdp.state;

public class NoQuarterState implements State {

	GumballMachine machine = new GumballMachine(5);
	
	public NoQuarterState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("you inserted a quarter");
		machine.setState(machine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("you havent inserted a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("you turned but there are no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("you need to pay first");
	}

}
