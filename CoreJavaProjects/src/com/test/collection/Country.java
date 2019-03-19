package com.test.collection;

public class Country {

	String name;
	long population;

	public Country(String name, long population) {
		super();
		this.population = population;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
	  this.population = population;
	 }
	
	@Override
	public int hashCode() {
		int result = 1;
		final int prime = 31;
		result = result * prime + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		Country c = (Country) obj;
		if(c.getName().equals(name)) {
			return true;
		}
		return false;
	}
}