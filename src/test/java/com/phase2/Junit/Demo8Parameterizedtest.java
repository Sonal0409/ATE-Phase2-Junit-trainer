package com.phase2.Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;


public class Demo8Parameterizedtest {
	
	//@ValueSource annotation
	
	@ParameterizedTest
	@ValueSource(strings = {"abc","xyz",""})
	public void checkblanks(String value)
	{
		Assertions.assertTrue(StringUtils.isBlank(value));
	}
	
	
	@ParameterizedTest(name = "checkBlanks {arguments}")
	@ValueSource(strings = {"abc","xyz",""})
	public void checkblankswithPlaceHolders(String value)
	{
		Assertions.assertTrue(StringUtils.isBlank(value));
	}
	
	@ParameterizedTest(name = "checkBlanks {arguments}")
	@ValueSource(strings = {"abc","xyz",""})
	@EmptySource
	public void checkblankswithEmptySource(String value)
	{
		Assertions.assertTrue(StringUtils.isBlank(value));
	}
	
	@ParameterizedTest(name = "checkBlanks {arguments}")
	@ValueSource(strings = {"abc","xyz",""})
	@NullSource
	public void checkblankswithNullSource(String value)
	{
		Assertions.assertTrue(StringUtils.isBlank(value));
	}
	@ParameterizedTest(name = "checkBlanks {arguments}")
	@ValueSource(strings = {"abc","xyz",""})
	@NullAndEmptySource
	public void checkblankswithNullandEmptySource(String value)
	{
		Assertions.assertTrue(StringUtils.isBlank(value));
	}

}
