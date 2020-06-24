	import org.testng.annotations.DataProvider;

	public class Dataprovider_common {

		@DataProvider(name="multipletestsinasinglefile")
		public Object[][] getData()
		{
			Object[][] data=new Object[2][2];
			data[0][0]="muditgarg1211@gmail.com";
			data[0][1]="TestAutomation";

			data[1][0]="rachitchauhan2000@gmail.com";
			data[1][1]="HelloWorld";			
			return data;
		}

	}
	

