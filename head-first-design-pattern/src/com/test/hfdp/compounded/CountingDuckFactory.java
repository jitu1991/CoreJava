package com.test.hfdp.compounded;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createReadheadDuck() {
		return new QuackCounter(new ReadheadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuk() {
		return new QuackCounter(new RubberDuck());
	}

}
