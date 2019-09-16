package com.capgemini.hotel.bean;

public class RoomBooking {
	private String roomType;
	private int bookingId;
	private int customerId;
	private int roomNo;
	private CustomerBean cb;
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getBookingId() {
		return bookingId;
	}
	public RoomBooking(String roomType, int bookingId, int roomNo, CustomerBean cb) {
		super();
		this.roomType = roomType;
		this.bookingId = bookingId;
		this.customerId = cb.getCustomerId();
		this.roomNo = roomNo;
		this.cb = cb;
	}
	public CustomerBean getCb() {
		return cb;
	}
	public void setCb(CustomerBean cb) {
		this.cb = cb;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}


}
