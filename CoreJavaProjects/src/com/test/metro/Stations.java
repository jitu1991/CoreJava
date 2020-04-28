package com.test.metro;

public enum Stations {
	A1(1), A2(2), A3(3), A4(4), A5(5), A6(6), A7(7), A8(8), A9(9), A10(10);

	private int id;

	Stations(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public int distance(Stations other) {
		return Math.abs(other.getId() - this.getId());
	}
}
