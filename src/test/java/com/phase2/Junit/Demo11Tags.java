package com.phase2.Junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Demo11Tags {
	
	
	// to run tags:
	// right click on prject --> go to run--> click on run configuration-> click on junit on left sie-->right click-> new configuration--> 
	// select --> run all tests--> click on include and exclude test
	

	@BeforeAll
	public static void beforeAllMethod()
	{
		System.out.println("Starting the connection with DB");
	}

	@AfterAll
	public static void afterAllmethod()
	{
		System.out.println("Stop the connection with DB");
	}
	
	@Tag("feature1")
	@Test
	public void Test1()
	{
		System.out.println("Today");
		
	}
	

	@Test
	public void Test2()
	{
		System.out.println("Tomorrow");
		
	}
	
	@Test
	public void Test3()
	{
		System.out.println("Everyone");
		
	}


}
