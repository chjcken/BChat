package com.bchat.item;

public class Message {
	private String message;
	private boolean isMine;
	
	public Message(String message, boolean isMine){
		this.isMine = isMine;
		this.message = message;
	}

	public String getMessage(){
		return this.message;
	}
	
	public boolean isMine(){
		return isMine;
	}
}
