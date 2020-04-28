package com.test.hfdp.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		Customer cust1 = new Customer.CustomerBuilder("Leena", "Kadam", "Pune").age(45).phone("9090234567")
				.email("leena@yahoo.com").build();

		System.out.println(cust1);

		Customer cust2 = new Customer.CustomerBuilder("Meena", "Pathak", "Goa") // HERE NOT SENDING email
				.age(32).phone("786795655").build();
		System.out.println(cust2);

		Customer cust3 = new Customer.CustomerBuilder("Sita", "Mane", "Mumbai") // HERE NOT SENDING age, phone, email
				.build();

		System.out.println(cust3);
	}

}
