package framework_Junit;

import org.junit.Ignore;
import org.junit.Test;

public class My_Junit_first_test 
{

	@Test
	public void test() 
	{
		System.out.println("test executed");
	}
	
	@Test
	public void test1() 
	{
		System.out.println("test1 executed");
	}
	
	@Ignore
	public void test2() 
	{
		System.out.println("test2 executed");
	}

}
