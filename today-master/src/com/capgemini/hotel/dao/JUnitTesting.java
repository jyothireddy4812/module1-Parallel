package com.capgemini.hotel.dao;


import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.capgemini.hotel.bean.CustomerBean;
import com.capgemini.hotel.bean.RoomBooking;
import com.capgemini.hotel.service.HotelService;
import com.capgemini.hotel.service.IHotelService;

import junit.framework.Assert;

public class JUnitTesting {
	IHotelService ihs=new HotelService();
	Map<Integer,CustomerBean> customerDetailsTest=new HashMap<>();
	Map<Integer,RoomBooking> roomBooking=new HashMap<>();
	Map<Integer,String> rooms=new HashMap<>();

	 @Test
	 public void addCustomerDetails() {
			
			// TODO Auto-generated method stub
		 	CustomerBean cb=new CustomerBean(101, "raj", "9832495149", "abc", "trhrh");
			customerDetailsTest.put(cb.getCustomerId(),cb);
			int customerId1=cb.getCustomerId();
			int expected=101;
			Assert.assertEquals(expected, customerId1);
		}
	 @Test
		public void getBookingDetails() {
			// TODO Auto-generated method stub
			
			CustomerBean cb=new CustomerBean(1011, "raj", "9832495149", "abc", "trhrh");
			RoomBooking rb=new RoomBooking("AC_Single",1002, 1011, cb);
			customerDetailsTest.put(1011,cb);
			roomBooking.put(1011, rb);
			if(customerDetailsTest.containsKey(1011))
				rb=(RoomBooking)roomBooking.get(1011);
				int expected=1002;
				int original=rb.getBookingId();
				Assert.assertEquals(expected, original);
				
		}	
}

