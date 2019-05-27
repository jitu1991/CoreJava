package com.test.hfdp.command;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for(int i=0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = onCommand;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n --- Remote Control --- \n");
		for(int i = 0; i< onCommands.length; i++) {
			sb.append("[Slot: " + i + onCommands[i].getClass().getName() + "]");
		}
		return sb.toString();
	}

	public void onButtonWasPushed(int i) {
		onCommands[i].execute();
		undoCommand = onCommands[i];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}

	public void offButtonWasPushed(int i) {
		// TODO Auto-generated method stub
		
	}
}
