package com.capgemini.takehome.dao;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductDAO implements IProductDAO{

	@Override
	public Product getProductDetails(int productCode) throws IncorrectProductCodeException 
	{
		validationCheck(productCode);
		Product product = getProduct(productCode);
        return product;
	}
		 public Product getProduct(int productCode) {
		return CollectionUtil.get(productCode);
	}
		public void validationCheck(int productCode) throws IncorrectProductCodeException{ //validating the product key
		        if(productCode<999 || productCode>9999){
		            throw new IncorrectProductCodeException("Incorrect product code");
		        }
		    }
		public int validate(int qty) throws IncorrectQuantityException { //validating the quantity
			if(qty<=0)
			{
				throw new IncorrectQuantityException("Incorrect Quantity");
			}
			return 0;
		}
	
		}
		
