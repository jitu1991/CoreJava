package com.test.hfdp.state;

public class GumballMachine {
	/*final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
	
	int state = SOLD_OUT;
	int count = 0;

	public GumballMachine(int count) {
		this.count = count;
	}
	
	public void insertQuarter() {
		if(state == HAS_QUARTER) {
			System.out.println("Cant Insert more quarter");
		} else if(state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("quarter inserted");
		} else if(state == SOLD_OUT) {
			System.out.println("The machine is sold out");
		} else if(state ==  SOLD) {
			System.out.println("please wait, already giving you a gumball");
		}
	}
	
	public void ejectQuarter() {
		if(state == HAS_QUARTER) {
			System.out.println("quarter returned");
			state = NO_QUARTER;
		} else if(state == NO_QUARTER) {
			System.out.println("you havent inserted a quarter");
		} else if(state == SOLD_OUT) {
			System.out.println("Sorry already turned the crank");
		} else if(state ==  SOLD) {
			System.out.println("you cant eject, you havent inserted a quarter yet");
		}
	}
	
	public void turnCrank() {
		if(state == SOLD) {
			System.out.println("cant turn twice");
		} else if(state == NO_QUARTER) {
			System.out.println("turned but no quarter");
		} else if(state == SOLD_OUT) {
			System.out.println("turned but no quarter");
		} else if(state ==  HAS_QUARTER) {
			System.out.println("you turned");
			state = SOLD;
			dispense();
		}
	}

	public void dispense() {
		if(state == SOLD) {
			System.out.println("a gumball comes rolling out");
			count = count - 1;
			if(count == 0) {
				System.out.println("out of gumballs");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if(state == NO_QUARTER) {
			System.out.println("you need to pay fkrst");
		} else if(state == SOLD_OUT) {
			System.out.println("no gumballs dispensed");
		} else if(state == HAS_QUARTER) {
			System.out.println("no gumballs dispensed");
		}
	}*/
	
	State noQuarterState;
	State soldOutState;
	State soldState;
	State hasQuarterState;
	State winnerState;
	
	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int count) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = count;
		if(count > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void releaseBall() {
		System.out.println("a ball comes rolling out");
		if(count != 0) {
			count = count - 1;
		}
	}

	
	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	public State getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
	}

	@Override
	public String toString() {
		return "Inventory: " + count + " gumballs";
	}
}