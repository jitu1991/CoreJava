package com.test.hfdp.strategy;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mullardDuck = new MallardDuck();
		mullardDuck.performQuack();
		mullardDuck.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();
	}
}
