package com.capgemini.hotel.service;

import com.capgemini.hotel.bean.CustomerBean;
import com.capgemini.hotel.bean.RoomBooking;

public interface IHotelService {
	int addCustomerDetails(CustomerBean bean);
	RoomBooking getBookingDetails(int CustomerId);
	String getName(int customerId);

	boolean isName(String name);
	boolean isEmail(String email);
	boolean isMob(String mob);
	boolean isRoom(int roomNo, String roomType);
	boolean addRoomBookingDetails(RoomBooking rb);
}
