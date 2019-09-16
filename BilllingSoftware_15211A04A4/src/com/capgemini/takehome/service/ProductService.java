package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IncorrectProductCodeException;
import com.capgemini.takehome.dao.IncorrectQuantityException;
import com.capgemini.takehome.dao.ProductDAO;


public class ProductService implements IProductService
{
	ProductDAO pd=new ProductDAO();
	@Override
	public Product getProductDetails(int productCode) throws IncorrectProductCodeException
	{
		Product result=pd.getProductDetails(productCode);
		return result;
	}
	public int validate(int qty) throws IncorrectQuantityException {
		int res=pd.validate(qty);
		return 0;
	}

}
