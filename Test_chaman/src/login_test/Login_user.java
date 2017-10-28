package login_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Login_user {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("file:///C:/Users/training/Desktop/New%20folder/login_page.html");
		driver.findElement(By.name("email")).sendKeys("user@example.com");
		driver.findElement(By.name("pwd")).sendKeys("eW5PEXgz");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement txtbox1 = driver.findElement(By.xpath("//input[@name='sp1']"));
		if (txtbox1.isEnabled()) {
			txtbox1.sendKeys("J");
		} else {
			System.out.println("1st element is disabled");
		}
		WebElement txtbox2 = driver.findElement(By.xpath("//input[@name='sp2']"));
		if (txtbox2.isEnabled()) {
			txtbox2.sendKeys("c");
		} else {
			System.out.println("2nd element is disabled");
		}

		WebElement txtbox3 = driver.findElement(By.xpath("//input[@name='sp3']"));
		if (txtbox3.isEnabled()) {
			txtbox3.sendKeys("d");
		} else {
			System.out.println("3rd element is disabled");
		}
		WebElement txtbox4 = driver.findElement(By.xpath("//input[@name='sp4']"));
		if (txtbox4.isEnabled()) {
			txtbox4.sendKeys("m");
		} else {
			System.out.println("4th element is disabled");
		}
		WebElement txtbox5 = driver.findElement(By.xpath("//input[@name='sp5']"));
		if (txtbox5.isEnabled()) {
			txtbox5.sendKeys("A");
		} else {
			System.out.println("5th element is disabled");
		}
		WebElement txtbox6 = driver.findElement(By.xpath("//input[@name='sp6']"));
		if (txtbox6.isEnabled()) {
			txtbox6.sendKeys("B");
		} else {
			System.out.println("6th element is disabled");
		}
		WebElement txtbox7 = driver.findElement(By.xpath("//input[@name='sp7']"));
		if (txtbox7.isEnabled()) {
			txtbox7.sendKeys("6");
		} else {
			System.out.println("7th element is disabled");
		}
		WebElement txtbox8 = driver.findElement(By.xpath("//input[@name='sp8']"));
		if (txtbox8.isEnabled()) {
			txtbox8.sendKeys("7");
		} else {
			System.out.println("8th element is disabled");
		}
		WebElement txtbox9 = driver.findElement(By.xpath("//input[@name='sp9']"));
		if (txtbox9.isEnabled()) {
			txtbox9.sendKeys("7");
		} else {
			// System.out.println("9th element is disabled");
		}
		WebElement txtbox10 = driver.findElement(By.xpath("//input[@name='sp10']"));
		if (txtbox10.isEnabled()) {
			txtbox10.sendKeys("B");
		} else {
			// System.out.println("10th element is disabled");
		}
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Success']")).isDisplayed(), "Not able to login");
		driver.close();
	}
}
