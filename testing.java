package Besant.seleniumTutorials;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testing {
	
	@BeforeSuite
	public void setup()
	{
		System.out.println("BeforeSuite----> Project setup");
	}
	
	@BeforeTest
	public void BrowserSetup()
	{ 
		System.out.println("BeforeTest----> Browser setup");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass----> website");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod----> perform some actions");
	}
	
	@Test
	public void TestCase1()
	{
		System.out.println("Test----> execute my test case");
	}
	
	@Test
	public void TestCase2()
	{
		System.out.println("Test----> execute my test case");
	}
	
	@AfterMethod
	public void AfterTestCase()
	{
		System.out.println("@AfterMethod---> close the browser");
	}
	
	@AfterClass
	public void ClosingBrowser() {
		System.out.println("@Afterclass---> Check for errors in console");
	}
	
	@AfterTest
	public void ClearCookies()
	{
		System.out.println("@AfterTest----> clear all the cookies");
	}
	
	@AfterSuite
	public void publishresults()
	{
		System.out.println("AfterSuite---> Publish results");
	}
	
}
