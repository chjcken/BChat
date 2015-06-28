package com.bchat.item;

public class Contact {
	private String id;
	private String name;
	private String email;
	
	public Contact(String id, String name, String email){
		this.id = id;
		this.name = name;
		this.email = email;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	

}
