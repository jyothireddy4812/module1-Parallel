package com.capgemini.takehome.dao;

public class IncorrectProductCodeException extends Exception {
	public IncorrectProductCodeException(final String msg){ //throws exception when number exceeds 4 digits
        super(msg);
    }
}
