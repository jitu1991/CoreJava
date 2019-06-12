package com.test.hfdp.state;

import java.util.Random;

public class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine machine = new GumballMachine(5);

	
	public HasQuarterState(GumballMachine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("you cacnt insert a quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("quarter returned");
		machine.setState(machine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("you turned");
		
		int winner = randomWinner.nextInt(10);
		if(winner == 0 && machine.getCount() > 1) {
			machine.setState(machine.getWinnerState());
		} else {
			machine.setState(machine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("no gumball dispensed");
	}
}
