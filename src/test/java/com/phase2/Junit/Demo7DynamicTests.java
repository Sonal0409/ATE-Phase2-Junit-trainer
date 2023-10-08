package com.phase2.Junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.*;

public class Demo7DynamicTests {
	
	@TestFactory
	public Collection<DynamicTest> dynamicTests()
	{
		return Arrays.asList(
			DynamicTest.dynamicTest("Simple Test", () -> assertTrue(true)),
			DynamicTest.dynamicTest("Executable Class", new MyExecutable()),
			DynamicTest.dynamicTest("Exception Executable", () -> {throw new Exception("Exception Example");}),
			DynamicTest.dynamicTest("Simple test 2", () -> assertTrue(true)));
				
	}		
				
	}

	class MyExecutable implements Executable{
		
		public void execute()
		{
			System.out.println("dynamic test");
		}
	}

