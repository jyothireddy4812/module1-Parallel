package com.capgemini.hotel.service;

import com.capgemini.hotel.bean.CustomerBean;
import com.capgemini.hotel.bean.RoomBooking;
import com.capgemini.hotel.dao.CustomerBookingDAO;
import com.capgemini.hotel.dao.ICustomerBookingDAO;





public class HotelService implements IHotelService{
static ICustomerBookingDAO icb=new CustomerBookingDAO();
	
	@Override
	public int addCustomerDetails(CustomerBean bean) {
		// TODO Auto-generated method stub
		int customerId=icb.addCustomerDetails(bean);
		return customerId;
	}

	@Override
	public RoomBooking getBookingDetails(int CustomerId) {
		// TODO Auto-generated method stub
		RoomBooking rb=icb.getBookingDetails(CustomerId);
		return rb;
	}

	@Override
	public String getName(int customerId) {
		// TODO Auto-generated method stub
		String name=icb.getName(customerId);
		return name;
	}

	@Override
	public boolean isName(String name)
	{
		String regex = "^[A-Z][a-z]*( [A-Z][a-z]*)*";
		try {
		if(name.matches(regex)) 
		return true;
		else 
			throw new MyException("     Invalid Name");}
		catch (MyException E) {
			System.out.println(E);
			return false;}
	}

	@Override
	public boolean isEmail(String email) {
		// TODO Auto-generated method stub
		try {
		if(email.endsWith(".com") && email.contains("@"))
		return true;
		else
			throw new MyException("     Invalid Email");}
	catch (MyException E) {
		System.out.println(E);
		return false;}
	}
	@Override
	public boolean isMob(String mob) {
		// TODO Auto-generated method stub
	
		int n = mob.length();
		char []ch=mob.toCharArray();
		
		try {
			if (n == 10 ) {
				for(int i=0;i<n;i++) {
					if(ch[i]>47 && ch[i]<58) {
						continue;
					}
					else
						throw new MyException("    Invalid Number \n    Enter 10 digits");
											
				}
				return true;
				
			} else {
				throw new MyException("    Invalid Number \n    Enter 10 digits");
			}
		} catch (MyException E) {
			System.out.println(E);
			return false;
		}
	}

	@Override
	public boolean isRoom(int roomNo, String roomType) {
		// TODO Auto-generated method stub
		try {
		if(icb.isRoom(roomNo,roomType))
		return true;
		else
			throw new MyException("     Invalid Room No or Type");}
	catch (MyException E) {
		System.out.println(E);
		return false;}
	
	}

	@Override
	public boolean addRoomBookingDetails(RoomBooking rb) {
		// TODO Auto-generated method stub
		boolean arbd=icb.addRoomBookingDetails(rb);
		return arbd;
	}
}
class MyException extends Exception {
	String s1;

	MyException(String s) {
		s1 = s;

	}

	public String toString() {
		return (s1);
	}

}
