package com.capgemini.hotel.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capgemini.hotel.bean.CustomerBean;
import com.capgemini.hotel.bean.RoomBooking;
import com.capgemini.hotel.service.HotelService;
import com.capgemini.hotel.service.IHotelService;

public class Client {
	static IHotelService ihs = new HotelService();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("     1) Book Room \n     2) View Booking Details \n     3) Exit \n");

			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.println("          1)Book Room ");
				System.out.print("\n          Enter Customer Name : ");
				String name = sc.next();
				name += sc.nextLine();
				while (!ihs.isName(name)) {

					System.out.print("\n          Enter Customer Name : ");
					name = sc.next();
					name += sc.nextLine();
				}

				System.out.print("\n          Enter Email : ");
				String email = sc.next();
				while (!ihs.isEmail(email)) {
					System.out.print("\n          Enter Email : ");
					email = sc.next();

				}
				System.out.print("\n          Enter Customer address : ");
				String address = sc.next();
				address += sc.nextLine();
				System.out.print("\n          Enter Mobile No : ");
				String mobileNo = sc.next();
				while (!ihs.isMob(mobileNo)) {
					System.out.print("\n          Enter Mobile No : ");
					mobileNo = sc.next();

				}
				System.out.print("\n          Room No : ");
				int roomNo = sc.nextInt();
				System.out.print("\n          Room Type : ");
				String roomType = sc.next();
				while (!ihs.isRoom(roomNo, roomType)) {
					System.out.print("\n          Room No : ");
					roomNo = sc.nextInt();
					System.out.print("\n          Room Type : ");
					roomType = sc.next();

				}
				int customerId = (int) (1000 * Math.random() + 1000);
				int bookingId = (int) (100 * Math.random() + 1000);
				CustomerBean cb = new CustomerBean(customerId, name, mobileNo, address, email);
				RoomBooking rb = new RoomBooking(roomType, bookingId, roomNo, cb);
				customerId = ihs.addCustomerDetails(cb);
				boolean arbd = ihs.addRoomBookingDetails(rb);
				System.out.println(
						" \n**********************************************************************\n Your Room has been successfully booked, \n your Customer ID is: "
								+ customerId);
				break;
			case 2:
				System.out.print("\n        Enter Customer ID : ");
				customerId = sc.nextInt();
				rb = ihs.getBookingDetails(customerId);
				String name1 = ihs.getName(customerId);
				System.out.print("\n            Name of the Customer : " + name1);
				System.out.println("\n            Room No: " + rb.getRoomNo());
				System.out.println("\n            Room Type: " + rb.getRoomType());
				break;

			case 3:
				System.exit(0);
			default:
				System.out.println("Enter proper Choice");
			}

		}

	}
}
