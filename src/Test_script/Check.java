package Test_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generics.Base_Test;
import Generics.Generic_ReadExcel;
import POM_class.Insta_login;

public class Check extends Base_Test
{
@Test
public void login()
{
	String uname = Generic_ReadExcel.getData("TC1", 3, 3);
	String pwd = Generic_ReadExcel.getData("TC1", 3, 5);
	Insta_login lgn=new Insta_login(driver);
	lgn.setEmail(uname);
	lgn.setPass(pwd);
	lgn.clickLgn();
	Assert.fail();
}
}
