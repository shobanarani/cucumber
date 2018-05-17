package cucumber;




import org.junit.runner.RunWith;

import cucumber.junit.Cucumber; 

	
	
	@RunWith(Cucumber.class) 
	@Cucumber.Options(   
			
			format = "pretty",
		    tags = {"~@Ignore"} ,
		    features = "Feature"
		    
		    ) 

	public class testRunner { 
		
		
	}


