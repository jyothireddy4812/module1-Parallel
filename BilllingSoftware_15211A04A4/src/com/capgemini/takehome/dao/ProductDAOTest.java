package com.capgemini.takehome.dao;
import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.takehome.bean.Product;
public class ProductDAOTest {
	@Test
	public void getProductDetails() throws IncorrectProductCodeException{
	int productCode=1003;
	ProductDAO pd=new ProductDAO();
	Product product=pd.getProductDetails(productCode);
	assertNotNull(product);
	}
	@Test
	public void getProductDetails1() throws IncorrectProductCodeException{
	int productCode=1008;
	ProductDAO pd=new ProductDAO();
	Product product=pd.getProductDetails(productCode);
	assertNull(product);
	}
}
