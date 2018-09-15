package Selenium_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Menu {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:/Users/PAWAN SINGH/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	
}
}
