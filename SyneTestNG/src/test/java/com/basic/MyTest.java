package com.basic;

import org.junit.Assert;
import org.testng.annotations.Test;

public class MyTest {
	
	@Test
	public void test1(){
		System.out.println(" test 1");
	}
	@Test
	public void test2() {
		System.out.println(" test 2");
	}
	@Test
	public void test3() {
		System.out.println(" test 3");
	}
	
	@Test
	public void test4() {
		System.out.println(" test 4");
		Assert.assertTrue(false);
	}

}
