package com.phase2.Junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class Demo6RepeatedTest {
	
	
	@RepeatedTest(5)
	public void test()
	{
		System.out.println("hello");
		
	}
	
	@RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}")
	@DisplayName("Execution")
	public void test2(TestInfo testinfo)
	{
		System.out.println(testinfo.getDisplayName());
		
	}
	
	@RepeatedTest(5)
	public void test3(RepetitionInfo repInfo)
	{
		System.out.println("current Test Count" + repInfo.getCurrentRepetition());
		
	}

}
