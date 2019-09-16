package com.capgemini.takehome.dao;

public class IncorrectQuantityException extends Exception {
	public IncorrectQuantityException(final String msg){//throws exception when quantity is null
        super(msg);
}
}