package com.test.EjbPackage;

import junit.framework.TestCase;

public class HellowWorldBeanTest extends TestCase {

	HelloWorldBean hw;
	
	public HellowWorldBeanTest(String name) {
		super(name);
	}
	
	public void testHelloWorldBeanSuccess()
	{
		  hw=new HelloWorldBean();  
		  assertEquals("The parameters must be equals",hw.getMessage(),"hello world");
	}
	
	public void testHelloWorldBeanFail()
	{
		hw=new HelloWorldBean();  
		  assertEquals("The parameters must be equals",hw.getMessage(),"sarasa");
	}
	
	

}
