package edu.ncsu.monopoly;

public class FreeParkingCell extends Cell {

	public FreeParkingCell() {
		setName("Free Parking");
	}

	public boolean playAction(String mess) {
		return true;
	}
}
