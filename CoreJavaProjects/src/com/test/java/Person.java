package com.test.java;

public class Person implements Comparable {

	private int person_id;
	private String name;
	
	public Person(String a) {
		this.name = a;
	}
	
	public Person(int id, String a) {
		person_id = id;
		this.name = a;
	}
	
	
	public int getPerson_id() {
		return person_id;
	}


	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString(){
		return String.valueOf(person_id);
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
		//return 11;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int compareTo(Object o) {
		Person e1 = (Person) o;
		
		if(e1.person_id == this.person_id)
		return 0;
		else if(e1.person_id < this.person_id)
			return 1;
		else return -1;
	}
	
}
