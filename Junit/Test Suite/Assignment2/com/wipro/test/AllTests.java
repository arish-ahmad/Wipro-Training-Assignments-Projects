package com.wipro.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	TestStringConcat.class , 
	TestCheckPresence.class,
	TestSort.class
	
})
public class AllTests {
	
}
