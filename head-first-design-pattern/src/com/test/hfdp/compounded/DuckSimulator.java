package com.test.hfdp.compounded;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		//simulator.simulate();
		AbstractDuckFactory factory = new CountingDuckFactory();
		simulator.simulate(factory);
	}

	public void simulate() {
		/*Quackable mallardDuck = new MallardDuck();
		Quackable readheadDuck = new ReadheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		Quackable goose = new GooseAdaaptor(new Goose());*/
		
		//To wrap objects in decorator for counting quacks
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable readheadDuck = new QuackCounter(new ReadheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable goose = new GooseAdaptor(new Goose());
		

		System.out.println("\nDuck Simulator");

		simulate(mallardDuck);
		simulate(readheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(goose);
		
		System.out.println("Ducks quakced: " + QuackCounter.getQuacks() +  " times");
	}

	public void simulate(Quackable duck) {
		duck.quack();
	}
	
	public void simulate(AbstractDuckFactory factory) {
		Quackable mallardDuck = factory.createMallardDuck();
		Quackable readheadDuck = factory.createReadheadDuck();
		Quackable duckCall = factory.createDuckCall();
		Quackable rubberDuck = factory.createRubberDuk();
		Quackable goose = new GooseAdaptor(new Goose());
		
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(readheadDuck);
		flockOfDucks.add(duckCall);
		
		Flock flockOfMullards = new Flock();
		
		Quackable mallardDuck1 = factory.createMallardDuck();
		Quackable mallardDuck2 = factory.createMallardDuck();
		Quackable mallardDuck3 = factory.createMallardDuck();
		Quackable mallardDuck4 = factory.createMallardDuck();
		
		flockOfMullards.add(mallardDuck1);
		flockOfMullards.add(mallardDuck2);
		flockOfMullards.add(mallardDuck3);
		flockOfMullards.add(mallardDuck4);
		
		flockOfDucks.add(flockOfMullards);

		/*simulate(mallardDuck);
		simulate(readheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(goose);*/
		
		System.out.println("Whole Flock Simulation");
		simulate(flockOfDucks);
		
		System.out.println("Whole Mallard Simulation");
		simulate(flockOfMullards);

		System.out.println("\nDuck Simulator with Observer");

		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		simulate(flockOfDucks);
		
		System.out.println("Ducks quakced: " + QuackCounter.getQuacks() +  " times");
	}
}
