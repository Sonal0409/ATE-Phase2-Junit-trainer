package com.phase2.Junit;

public interface Demo5Interface {
	
	public void method1();
	
	public default void basemethod()
	{
		System.out.println("default method");
	}
	
	
	

}
