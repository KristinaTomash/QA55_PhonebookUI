package com.phonbook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test(enabled = false)
    public void newUserRegistrationPositiveTest(){
        //click on Login Link
        driver.findElement(By.cssSelector("[href='/login']")).click();
        //enter Email to email field
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("Ww@gmai.com");
        //enter Password to password field
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("Aa123456$");
        //click on Registration button
        driver.findElement(By.name("registration")).click();
        //verify SignOut button is displayed
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));
    }











}
