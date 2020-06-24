		import java.util.ArrayList;
		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.Assert;
		import org.testng.AssertJUnit;
		import org.testng.annotations.AfterMethod;
		import org.testng.annotations.BeforeMethod;
		import org.testng.annotations.Test;
		
		public class shopclue_testcase {
		
		
		@BeforeMethod
		public void beforeMethod() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		}
		
		@Test(dataProviderClass = Dataprovider_common.class,dataProvider="multipletestsinasinglefile")
		public void execution(String username, String password)
		{
			System.out.println("checking multiple data login");	
		}
		
		@Test(enabled=true)
		public void assertURLocator() 
		  { 
			 WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
		     driver.get("https://www.shopclues.com/");   
		     String actualURL = driver.getCurrentUrl();
		     System.out.println(actualURL);   
		     String expectedURL=null  ; 
		     AssertJUnit.assertNull("Not Null",expectedURL);
		     System.out.println("Test Success");       
		    }
		
		
		@Test
		public void verifyT() {
			 WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.shopclues.com/"); 
			  String ActualTitle=driver.getTitle();
			  System.out.println(ActualTitle);
			  String ExpectedTitle="Online Shopping Site India - Shop Online for men, women and kids fashion, home, kitchen, health, sports and more products at ShopClues";
			  AssertJUnit.assertEquals(ActualTitle, ExpectedTitle);
			  System.out.println("Assert Success"); 
		}
			  
		  // Test Case to search a product in search box
		  @Test 
		  public void testcase1() { 
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://www.shopclues.com/");
		  
		  WebElement element1 = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/span/input[1]"));
		  element1.sendKeys("oneplus");
		  WebElement element2 = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/span/a"));
		  element2.click(); 
		  WebElement element3 = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[1]/div[3]/div[1]/a"));
		  element3.click();
		  }
		 
		
		 //Test Case to check if the login is successful with both valid email and password
		 //Positive Test Case
		@Test
		public  void testcase2()
		{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shopclues.com/");
		        
		        WebElement element1 = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[4]/ul/li[6]/a"));
		        element1.sendKeys(Keys.ENTER);
		        WebElement element2 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[2]/input"));
		        element2.sendKeys("muditgarg1211@gmail.com");
		        WebElement element3 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[3]/input"));
		        element3.sendKeys("TestAutomation");
		        WebElement element4 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[4]/a[1]"));
		        element4.click();
		        }		
		
		// Test Case to check if the login is successful or not with valid email and invalid password
		// Negative Test Case
		@Test
		public  void testcase3()
		{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shopclues.com/");
		        
		        WebElement element1 = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[4]/ul/li[6]/a"));
		        element1.sendKeys(Keys.ENTER);
		        WebElement element2 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[2]/input"));
		        element2.sendKeys("muditgarg1211@gmail.com");
		        WebElement element3 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[3]/input"));
		        element3.sendKeys("TestAutomation123");
		        WebElement element4 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[4]/a[1]"));
		        element4.click();
		        }	
		
				// Test Case to Verify the Invalid message that appears using Assertion
				// Positive Test Case
				
				@Test
				public  void testcase4()
				{
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://www.shopclues.com/");
				        
				        WebElement element1 = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[4]/ul/li[6]/a"));
				        element1.sendKeys(Keys.ENTER);
				        WebElement element2 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[2]/input"));
				        element2.sendKeys("muditgarg1211@gmail.com");
				        WebElement element3 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[3]/input"));
				        element3.sendKeys("TestAutomation123");
				        WebElement element4 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[4]/a[1]"));
				        element4.click();
				        String actualError1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[3]/div[1]/span")).getText();
				        String expectedError1 ="Incorrect login details.";
				        Assert.assertEquals(actualError1, expectedError1);
				}	
		
				//Test Case to check if the login is successful or not with invalid email and invalid password
				// Negative Test Case
				@Test
				public  void testcase5()
				{
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://www.shopclues.com/");
				        
				        WebElement element1 = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[4]/ul/li[6]/a"));
				        element1.sendKeys(Keys.ENTER);
				        WebElement element2 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[2]/input"));
				        element2.sendKeys("muditgarg1211@gm.com");
				        WebElement element3 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[3]/input"));
				        element3.sendKeys("TestAutomation123");
				        WebElement element4 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[4]/a[1]"));
				        element4.click();
				        }	
				
				// Test Case to verify the Forget password functionality 
				// Positive Test Case
				@Test
				public  void testcase6()
				{
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://www.shopclues.com/");
				        
				        WebElement element1 = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[4]/ul/li[6]/a"));
				        element1.sendKeys(Keys.ENTER);
				        WebElement element2 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[2]/input"));
				        element2.sendKeys("muditgarg1211@gmail.com");
				        WebElement element3 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[3]/input"));
				        element3.sendKeys("TestAutomation12");
				        WebElement element4 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[4]/a[1]"));
				        element4.click();
				        WebElement element5 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[3]/div[2]/a"));
				        element5.click();
				        WebElement element7 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[2]/div/form/div[5]/a"));
				        element7.click();
				        // Then you have to provide the OTP and then click on Verify and then change password
				        }	
				
				
				
				// Test case to verify if the mandatory field message appears or not if the email and password is blank
				@Test
				public  void testcase7()
				{
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://www.shopclues.com/");
				        
				        WebElement element1 = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[4]/ul/li[6]/a"));
				        element1.sendKeys(Keys.ENTER);
				        WebElement element2 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[2]/input"));
				        element2.sendKeys("");
				        WebElement element3 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[3]/input"));
				        element3.sendKeys("");
				        WebElement element4 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[4]/a[1]"));
				        element4.click();
				        
				        String actualError2 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[2]/div[1]/span")).getText();
				        String expectedError2 = "Please enter email id or mobile number.";
				        Assert.assertEquals(actualError2, expectedError2);
				        
				        String actualError3 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[3]/div[1]/span")).getText();
				        String expectedError3 = "Please enter your password.";
				        Assert.assertEquals(actualError3, expectedError3);		
				}
				
				// Test case to search a product
				@Test
				public  void testcase8()
				{
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://www.shopclues.com/");
				
				        WebElement element5 = driver.findElement(By.id("autocomplete"));
				        element5.sendKeys("Ipad Mini");
				        WebElement element7 = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/span/a"));
				        element7.click();	        
				}
				
				// Test case to search a product
				@Test
				public  void testcase9()
				{
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://www.shopclues.com/");
				
				        WebElement element5 = driver.findElement(By.id("autocomplete"));
				        element5.sendKeys("titan watch");
				        WebElement element8 = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/span/a"));
				        element8.click();	        
				}
	
		@AfterMethod
		public void afterMethod() {
			System.out.print("successfull Test");
		}
	
	}
