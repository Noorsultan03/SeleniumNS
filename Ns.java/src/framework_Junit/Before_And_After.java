package framework_Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Before_And_After {

	@Test
	public void test1() 
	{
		System.out.println("test1 executed");

	}
	
	@Test
	public void test2() 
	{
		System.out.println("test2 executed");

	}
	
	@Test
	public void test3() 
	{
		System.out.println("test3 executed");

	}

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("precondition Before class"+"\n");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Postcondition After class");
	}

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("Precondition-Beforemethod");
	}

	@After
	public void tearDown() throws Exception 
	{
		System.out.println("Postcondition-Aftermethod");
	}

	

}
