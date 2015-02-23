package edu.ncsu.monopoly;

public class GoCell extends Cell {
	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	public boolean playAction(String mess) {
		return true;
	}
	
	void setName(String name) {
	}
}
