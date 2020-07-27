package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {
private static WebElement element = null;

public static WebElement Careers_Link(WebDriver driver){
	
	element = driver.findElement(By.cssSelector("ul#menu-primary-right-menu > .menu-item.menu-item-1373.menu-item-object-page.menu-item-type-post_type > a"));
	return element;
}

public static WebElement SouthAfrica_Button_Link(WebDriver driver){
	
	element = driver.findElement(By.xpath("//a[text()='South Africa']"));
	return element;
}

public static WebElement Job_Available_Link(WebDriver driver){
	
	element = driver.findElement(By.xpath("//a[text()='Interns - BSC Computer Science, National Diploma: IT Development Graduates']"));
	return element;
}

public static WebElement Apply_Online(WebDriver driver){
	
	element = driver.findElement(By.xpath("//a[text()='Apply Online ']"));
	return element;
}

public static WebElement Your_Name(WebDriver driver){
	
	element = driver.findElement(By.xpath("//input[@name='applicant_name']"));
	return element;
}

public static WebElement Email_Adress(WebDriver driver){
	
	element = driver.findElement(By.xpath("//input[@id='email']"));
	return element;
}
public static WebElement Phone(WebDriver driver){
	
	element = driver.findElement(By.xpath("//input[@id='phone']"));
	return element;
}

public static WebElement Send_Button(WebDriver driver){
	
	element = driver.findElement(By.xpath("//input[@id='wpjb_submit']"));
	return element;
}
	

}
