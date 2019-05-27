package com.test.hfdp.command;

public class RemoteLoader {
	public static void main(String[] args) {
		
		RemoteControl remoteControl = new RemoteControl();
		Light roomLight = new Light();
		Light kitchenLight = new Light();
		GarageDoor door = new GarageDoor();
		Stereo stereo = new Stereo();
		
		LightOnCommand roomLightOnCommand = new LightOnCommand(roomLight);
		LightOffCommand roomLightOffCommand = new LightOffCommand(roomLight);
		LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
		GargeDoorOpenCommand doorOpenCommand = new GargeDoorOpenCommand(door);
		StereoOnWithCDCommand stereoOnWithCdcCommand = new StereoOnWithCDCommand(stereo);
		
		remoteControl.setCommand(0, roomLightOnCommand, roomLightOffCommand);
		remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
		remoteControl.setCommand(2, doorOpenCommand, null);
		remoteControl.setCommand(3, stereoOnWithCdcCommand, null);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
	}
}
