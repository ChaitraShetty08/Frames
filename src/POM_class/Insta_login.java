package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generics.Base_Page;

public class Insta_login extends Base_Page
{
@FindBy(xpath="//input[@type='text']")
private WebElement num;

@FindBy(xpath="//input[@aria-label='Password']")
private WebElement password;

@FindBy(xpath="//button[@type='submit']")
private WebElement login;

public Insta_login(WebDriver driver)
{
	super(driver);
}

public void setEmail(String mail)
{
	num.sendKeys(mail);
}
public void setPass(String psd)
{
	password.sendKeys(psd);
}
public void clickLgn()
{
	login.click();
}
}
