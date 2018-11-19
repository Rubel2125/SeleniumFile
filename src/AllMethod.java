import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AllMethod {
	static ChromeDriver dr;
	
	
	@BeforeClass
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/anamulhoque/Downloads/chromedriver");
		dr = new ChromeDriver();
	}
	
	@Test
	public void open() throws InterruptedException {
		dr.get("https://www.target.com/");
		dr.findElement(By.id("search")).sendKeys("halloween");
		dr.findElement(By.xpath("//button[@class='SearchInputButton-bo6ned-0 hjarIT']")).click();
		Thread.sleep(5000);
		boolean vd = dr.findElement(By.xpath("//span[@style='font-size: 175%']//span[@style='color: #783CBD;']")).isDisplayed();
		System.out.println(vd);
		dr.findElement(By.xpath("//div[contains(text(),\"men's Costumes\")]")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//a[text()=\"Adult Pineapple Halloween Costume - Hyde and Eek! Boutique™\"]")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//div[@class='h-margin-t-tiny h-margin-b-tiny']//button[@data-test='shippingATCButton']")).click();
		Thread.sleep(2000);
		Select sc = new Select(dr.findElement(By.xpath("//label[@class='SelectLabel-irta3p-0 eDihkF']")));
			sc.selectByVisibleText("Add 1");
		Thread.sleep(2000);
		
		
		
		
	}
	@Ignore
	@Disabled
	@Test
	public void facebook() {
		dr.get("http://www.facebook.com");
		
	}
	
	@AfterClass
	public static void close() throws InterruptedException {
		Thread.sleep(5000);
		dr.quit();
	}
	

}
