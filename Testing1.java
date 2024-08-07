package Besant.seleniumTutorials;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing1 {
	@Parameters({"virat_runs","axer_runs"})
	@Test
	public void india_WC1(int virat, int axer)
	{
	   	int total = virat+axer;
	   	System.out.println("Total runs contributed by virat and axer in the crucial match was:" + total);
	}
	
	@Parameters({"bhoom_wicks","har_wicks"})
	@Test  
	public void india_WC(int bhumrah,int hardik)
	{
		int Tot_wicks = bhumrah+hardik;
		System.out.println("Total wicks taken both of them was:" + Tot_wicks);
	}
	
	@Test
	public void other_things()
	{
		System.out.println("india won the match and celebrated like anything with raw emotions :(");
	}
	
	
}
