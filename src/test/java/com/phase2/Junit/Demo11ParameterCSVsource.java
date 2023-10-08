package com.phase2.Junit;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class Demo11ParameterCSVsource {
	
	@ParameterizedTest(name = "Methodsource {arguments}")
	@CsvSource({
		"Audi, 25",
		"BMS, 99",
		"tesla, 30"
	})
	public void csvsourcemethod(String car, String quantity)
	{
		System.out.println(car + " : " + quantity);
	}
	

	

}
