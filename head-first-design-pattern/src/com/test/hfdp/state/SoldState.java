package com.test.hfdp.state;

public class SoldState implements State {
	GumballMachine machine = new GumballMachine(5);

	public SoldState(GumballMachine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("please wait, we are trying to give a gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("already turned the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("cant turn twice");
	}

	@Override
	public void dispense() {
		machine.releaseBall();
		if(machine.getCount() > 0 ) {
			machine.setState(machine.getNoQuarterState());
		} else {
			System.out.println("out of gumballs");
			machine.setState(machine.getSoldOutState());
		}
	}
}