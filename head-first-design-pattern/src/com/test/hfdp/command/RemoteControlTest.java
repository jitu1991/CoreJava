package com.test.hfdp.command;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		
		remote.setSlot(lightOnCommand);
		remote.buttonWasPressed();
		
		GarageDoor garageDoor= new GarageDoor();
		GargeDoorOpenCommand doorOpen = new GargeDoorOpenCommand(garageDoor);
		
		remote.setSlot(doorOpen);
		remote.buttonWasPressed();
	}
}
