package com.lti.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.Arrays;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParamTests {

	@Disabled
	@ParameterizedTest
	@ValueSource(ints= {8,10,20,50,100})
	public void testArrays(int arg) {
		
		System.out.println("arg: " + arg);
		Assertions.assertTrue(arg%2==0);
		
	}
	@Disabled
	@ParameterizedTest(name= "#{index} = {0}")
	@DisplayName("shld pass all not null args to methd")
	@ValueSource(strings= {"Crys", "Reyo", "Cryslan", "lee"})
	public void testParam(String msg)
	{
		String searchKey = "Crys";
		Assertions.assertTrue(msg.contains(searchKey));

	}
	// login 3 attempts 
	
	@RepeatedTest(3)
	public void shouldRepeat()
	{
		int x=10, y=20;
		assertEquals(200, x*y);
		
		
	}
	
	//JUnit 5 support lambda
	
	@Test
	public void testLambda() {
		Integer[] intAry = {2,3,7,5,20};
		
		List<Integer> numbers =Arrays.asList(intAry);
		
		Assertions.assertAll(
				() -> assertEquals(2, numbers.get(0)) ,
				() -> assertEquals(3, numbers.get(1)),
				() -> assertEquals(7, numbers.get(2)),
				() -> assertEquals(5, numbers.get(3)),
				() -> assertEquals(20, numbers.get(4))
				);

	}
	// testing whether exception is called - exp obj got created
	@Test
	void testException() {
		Assertions.assertThrows(NumberFormatException.class, () ->{
			Integer.parseInt("one");
		});
	}

}
