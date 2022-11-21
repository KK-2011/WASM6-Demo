package demo;

import org.testng.annotations.Test;

public class SampleTestNG {

	@Test
	public void createUser()
	{
		System.out.println("User is created");
	}
	
	@Test
	public void moodifyUser()
	{
		System.out.println("User is modified");
	}
}
