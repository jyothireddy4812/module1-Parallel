package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IncorrectProductCodeException;

interface IProductService {
	Product getProductDetails (int productCode) throws IncorrectProductCodeException;
}
