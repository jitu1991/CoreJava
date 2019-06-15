package com.test.hfdp.proxy;

public class PersonBeanImpl implements PersonBean {

	String name;
	String gender;
	String interests;
	int rating;
	int ratingCount = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	
	@Override
	public int getHotOrNotRating() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setHotOrNotRating(int i) {
		// TODO Auto-generated method stub
		
	}
}
