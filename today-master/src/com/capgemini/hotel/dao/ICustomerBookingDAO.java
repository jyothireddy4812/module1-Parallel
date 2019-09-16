package com.capgemini.hotel.dao;

import com.capgemini.hotel.bean.CustomerBean;
import com.capgemini.hotel.bean.RoomBooking;

public interface ICustomerBookingDAO {
	int addCustomerDetails(CustomerBean bean);
	RoomBooking getBookingDetails(int CustomerId);
	String getName(int customerId);
	boolean isRoom(int roomNo, String roomType);
	boolean addRoomBookingDetails(RoomBooking rb);
}
