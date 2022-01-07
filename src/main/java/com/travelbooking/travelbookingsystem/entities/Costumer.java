package com.travelbooking.travelbookingsystem.entities;

public class Costumer {
	
	private int user_id;
	private int ticket_id;
	private int booked_id;
	private int user_seats;
	
	public Costumer(int user_id, int ticket_id, int booked_id, int user_seats) {
		super();
		this.user_id = user_id;
		this.ticket_id = ticket_id;
		this.booked_id = booked_id;
		this.user_seats = user_seats;
	}

	public Costumer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

	public int getBooked_id() {
		return booked_id;
	}

	public void setBooked_id(int booked_id) {
		this.booked_id = booked_id;
	}

	public int getUser_seats() {
		return user_seats;
	}

	public void setUser_seats(int user_seats) {
		this.user_seats = user_seats;
	}

	@Override
	public String toString() {
		return "Costumer [user_id=" + user_id + ", ticket_id=" + ticket_id + ", booked_id=" + booked_id
				+ ", user_seats=" + user_seats + ", getUser_id()=" + getUser_id() + ", getTicket_id()=" + getTicket_id()
				+ ", getBooked_id()=" + getBooked_id() + ", getUser_seats()=" + getUser_seats() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
