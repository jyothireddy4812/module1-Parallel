package com.capgemini.takehome.ui;

import java.util.Scanner;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IncorrectProductCodeException;
import com.capgemini.takehome.dao.IncorrectQuantityException;
import com.capgemini.takehome.service.ProductService;

public class Client {

	public static void main(String[] args) throws IncorrectProductCodeException, IncorrectQuantityException {
		Client client=new Client();
		client.showMenu();
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		client.executeSwitch(option);
	}
	public void executeSwitch(int option) throws IncorrectProductCodeException, IncorrectQuantityException
	{
		switch(option)
		{
			case 1:
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the product code:");
				int code=sc.nextInt();
				System.out.println("Enter the quantity");
				int qty=sc.nextInt();
				Product pb= new Product();
				ProductService ps = new ProductService();
				int quant=ps.validate(qty);
                Product product = ps.getProductDetails(code);
                System.out.println("Product Name: " + product.getProduct_name());
                System.out.println("Product Category:" + product.getProduct_category());
                System.out.println("Product Price:" + product.getProduct_price());
				int total = qty*product.getProduct_price();
				System.out.println("Line Total(Rs): "+total);
				break;
			case 2:
				System.out.println("Thanking for using the application");
				break;
		}
	}
	public void showMenu()
	{
		System.out.println("Choose an option");
		System.out.println("1.Generate Bill by entering Product code and quantity");
		System.out.println("2.Exit");
		System.out.println("Enter your choice");
	}
}
