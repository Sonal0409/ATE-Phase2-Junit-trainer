package com.phase2.Junit;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;


public class Demo9ParameterenumSource {
	
	

	@ParameterizedTest(name = "checkBlanks {arguments}")
	@EnumSource(Values.class)
	public void checkblankswithEnum(Object value)
	{
		System.out.println(value.toString());
	}
	
	enum Values{
		ABC, XYZ, KWFB
	}

}
