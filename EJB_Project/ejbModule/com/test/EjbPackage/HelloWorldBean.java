package com.test.EjbPackage;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/*
 * Session Bean implementation class HelloWorldBean
 */

@Stateless
@LocalBean
public class HelloWorldBean implements HelloWorldBeanLocal {

    
    public HelloWorldBean() {
        // TODO Auto-generated constructor stub
    }   
    
    public final String getMessage() {
    	return "hello world";
    }

}
