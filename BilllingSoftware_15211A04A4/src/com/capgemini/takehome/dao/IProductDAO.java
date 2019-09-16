package com.capgemini.takehome.dao;

import com.capgemini.takehome.bean.Product;

interface IProductDAO {
	Product getProductDetails (int productCode) throws IncorrectProductCodeException;
}
