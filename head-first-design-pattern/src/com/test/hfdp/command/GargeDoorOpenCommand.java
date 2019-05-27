package com.test.hfdp.command;

public class GargeDoorOpenCommand implements Command {
	GarageDoor door;
	
	public GargeDoorOpenCommand(GarageDoor door) {
		this.door = door;
	}

	@Override
	public void execute() {
		door.up();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
}
