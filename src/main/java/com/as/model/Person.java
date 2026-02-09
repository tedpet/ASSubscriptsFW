package com.as.model;

import org.apache.log4j.Logger;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.eocontrol.EOEditingContext;

public class Person extends com.as.model.gen._Person {
	
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(Person.class);
	
	
	public static Person validateLogin(EOEditingContext editingContext, String username, String password) {
		EOQualifier qual = Person.LOGIN.eq(username).and(Person.PASSWORD.eq(password));
		Person user = Person.fetchRequiredPerson(editingContext, qual);
		//NSLog.out.appendln("The user is " + user);
		return user;
	}
	
	public String fullName() {
		return firstName().substring(0,1) + ". " + lastName();
	}
}
