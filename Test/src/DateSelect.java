
public class DateSelect {

	 public void DateTest() throws InterruptedException{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.cheapoair.com/");
	driver.manage()	.window().maximize();
	driver.findElement(By.xpath("//*[@id='cal0']")).click();	
		String montn="November 2020";
		String date="27";
		
		while(true){
			
		String txt=driver.findElement(By.xpath("//div[contains(text(),'November 2020')]")).getText();
		
		System.out.println ( " This is real month " + txt);
		if (txt.equals(montn)){
			break;
		}
		
	else{
		driver.findElement(By.xpath("//a[contains(@class,'rightNav')]")).click();
		
	}
		}
		java.util.List <WebElement> alldates =driver.findElements(By.xpath("//div[3]//div//div//a[1]"));
		
		for(WebElement ele:alldates){
			

		System.out.println(ele.getText());
		
		
		//driver.quit();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

		
	}	
		
	}

}
