package com.cydeo.test;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US83_AC1Kati {

    @Test
    public void test1(){

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));


        //  WebElement passwordInput = Driver.getDriver().findElement(By.id("password"));
        //  emailInput.sendKeys(ConfigurationReader.getProperty("password"));

          WebElement resetPassword = Driver.getDriver().findElement(By.linkText("Reset Password"));
          resetPassword.click();

          WebElement sign = Driver.getDriver().findElement(By.linkText("Best solution for startups"));
        System.out.println("sign = " + sign);

          Assert.assertTrue(sign.isDisplayed());



          WebElement emailInput = Driver.getDriver().findElement(By.id("login"));
          emailInput.sendKeys(ConfigurationReader.getProperty("username"));

          WebElement confirmBtn = Driver.getDriver().findElement(By.xpath("//button[text()='Confirm'] "));
          confirmBtn.click();

          String expectedConfirmationMsg = "Check email for reset link!";
          String actualConfirmationMsg = Driver.getDriver().findElement(By.tagName("p")).getText();




          Assert.assertEquals(actualConfirmationMsg,expectedConfirmationMsg);









    }



}
