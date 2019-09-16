package com.capgemini.hotel.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.hotel.bean.CustomerBean;
import com.capgemini.hotel.bean.RoomBooking;

public class CustomerBookingDAO implements ICustomerBookingDAO{
	CustomerBean cb;
	RoomBooking rb;
	Map<Integer,CustomerBean> customerDetails=new HashMap<>();
	Map<Integer,RoomBooking> roomBooking=new HashMap<>();
	Map<Integer,String> rooms=new HashMap<>();
	public CustomerBookingDAO() {
		// TODO Auto-generated constructor stub

		rooms.put(101,"AC_SINGLE");

		rooms.put(102,"AC_SINGLE");

		rooms.put(103,"AC_DOUBLE");

		rooms.put(201,"NONAC_SINGLE");

		rooms.put(202,"NONAC_SINGLE");

		rooms.put(203,"NONAC_DOUBLE");}

	
	@Override
	public int addCustomerDetails(CustomerBean bean) {
		// TODO Auto-generated method stub
		customerDetails.put(bean.getCustomerId(),bean);
		
		return bean.getCustomerId();
	}

	@Override
	public RoomBooking getBookingDetails(int customerId) {
		// TODO Auto-generated method stub
		if(roomBooking.containsKey(customerId))
			rb=(RoomBooking)roomBooking.get(customerId);
		return rb;
	}

	@Override
	public String getName(int cus) {
		// TODO Auto-generated method stub
		
		if(customerDetails.containsKey(cus))
			cb=(CustomerBean)customerDetails.get(cus);
		return cb.getName();
	}

	@Override
	public boolean isRoom(int roomNo, String roomType) {
		// TODO Auto-generated method stub
		if(rooms.containsKey(roomNo)) {
			if(roomNo==101  && roomType.equals("AC_SINGLE")) {
				return true;
			}
			else if(roomNo==102  && roomType.equals("AC_SINGLE")) {
				return true;
			}
			else if(roomNo==201 && roomType.equals("NONAC_SINGLE")) {
				return true;
			}
			else if(roomNo==202 && roomType.equals("NONAC_SINGLE")) {
				return true;
			}
			else if(roomNo==103 && roomType.equals("AC_DOUBLE")) {
				return true;
			}
			else if(roomNo==203 && roomType.equals("NONAC_DOUBLE")) {
				return true;
			}
			else
				return false;
		}
		else
		return false;
	}


	@Override
	public boolean addRoomBookingDetails(RoomBooking rb) {
		// TODO Auto-generated method stub
		roomBooking.put(rb.getCustomerId(), rb);
		return true;
	}
	
}
