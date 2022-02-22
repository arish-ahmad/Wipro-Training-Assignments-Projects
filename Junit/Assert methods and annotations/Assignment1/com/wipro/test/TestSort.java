package com.wipro.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestSort {

	@Test
	void test() {
		DailyTasks dt =new DailyTasks(); 
		int[] unsorted = {12,31,7};
		int[] sorted = {7,12,31};
        
        assertArrayEquals(sorted, dt.sortValues(unsorted));
	}

}
