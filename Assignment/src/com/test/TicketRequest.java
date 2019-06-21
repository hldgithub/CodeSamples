package com.test;

public class TicketRequest {

	private String name;
	private int requestSeat;
	private String message;
	
	public TicketRequest(String name,  int requestSeat){
		this.name = name;
		this.requestSeat = requestSeat;
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public int getRequestSeat() {
		return requestSeat;
	}
}
