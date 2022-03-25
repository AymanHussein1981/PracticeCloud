package Framework.Practice;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name="InputData")
	public Object[][] dataprovidertext()
	{
		Object[][] obj=new Object[3][1];
			obj[0][0]="CELIA";
			obj[1][0]="YOUSEF";
			obj[2][0]="RAWAND";
			
			return obj;
					
	}

}
