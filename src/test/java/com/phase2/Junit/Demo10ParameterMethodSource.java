package com.phase2.Junit;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.MethodSource;


public class Demo10ParameterMethodSource {
	
	@ParameterizedTest(name = "Methodsource {arguments}")
	@MethodSource("stringParameters")
	public void checkblankswithmethod(String parameter)
	{
		System.out.println(parameter);
	}
	
	static Stream<String> stringParameters()
	{
		return Stream.of("monday","tuesday","wednesday");
	}
	
	// to pass a range of values from a method
	
	
	@ParameterizedTest(name = "Methodsource {arguments}")
	@MethodSource("intParameters")
	public void usemethodSourceInt(int parameter)
	{
		System.out.println(parameter);
	}
	
	static IntStream intParameters()
	{
		return IntStream.range(0, 5);
	}
	
	

}
