package com.test.EjbPackage;

import javax.ejb.Local;

@Local
public interface HelloWorldBeanLocal {

	String getMessage();
}
