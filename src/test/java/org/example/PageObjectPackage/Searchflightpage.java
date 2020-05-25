package org.example.PageObjectPackage;

import org.apache.commons.io.FileUtils;
import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;

public class Searchflightpage extends DriverFactory {

    public void urlAssertion(){
        String actualURL = driver.getCurrentUrl();
        Assert.assertThat(actualURL, Matchers.containsString("southalltravel"));
        if (actualURL.contains("southalltravel")){                  //used if else to get printout of Assertion
            System.out.println("Assertion Test Passed");
        }else {
            System.out.println("Assertion Test Failed");
        }
    }


    @FindBy(id = "DestinationFrom1")
    WebElement departuingbox;

    public void depAutoCompMethod() {
        departuingbox.sendKeys("Lon");

        List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
        for (WebElement option : options){
            System.out.println(option.getText());
           if (option.getText().contains("London Heathrow Airport (LHR), UK")){
                option.click();
                break;
            }
        }
    }

    public void destinationAutoMethod(){
        WebElement destinationbox = driver.findElement(By.id("DestinationTo"));
        destinationbox.sendKeys("Ahmedabad (AMD), India");

        List<WebElement> destinationoptions = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
        for(WebElement destination: destinationoptions){
            System.out.println(destination.getText());
           if (destination.getText().contains("Sardar Vallabhbhai Patel Intl  (AMD), India")){
                destination.click();
            }
        }
    }

    @FindBy(id = "deptdt")
    WebElement departingCalender;

    public void dapartingCalenderMethod(){
        departingCalender.click();

        List<WebElement> options = driver.findElements(By.cssSelector(".ui-state-default"));
        for (WebElement option : options){
            System.out.println(option.getText());
            if (option.getText().contains("27")){
                option.click();
                break;
            }
        }
    }

    @FindBy(id = "rtndt")
    WebElement returningCalender;
    public void returningCalenderMethod(){
        returningCalender.click();
        List<WebElement> options = driver.findElements(By.cssSelector(".ui-state-default"));
        for (WebElement option : options){
            System.out.println(option.getText());
            if (option.getText().contains("17")){
                option.click();
                break;
            }
        }
    }
    @FindBy(id = "AdultCnt")
    WebElement adultSelection;
    public void adultSelectClassMethod(){
        Select sel = new Select(adultSelection);
        sel.selectByValue("3");
    }

    @FindBy(xpath = "//select[@id='AirLineCode1']")
    WebElement airlineSelection;
    public void airlineSelectClassMethod(){
        Select sel = new Select(airlineSelection);
        sel.selectByValue("AI");
    }

    @FindBy(xpath = "//input[@id='button_flight_search']")
    WebElement searchBox;
    public void searchBoxMethod(){
        searchBox.click();
    }

    public void screenshotMethod() throws IOException {
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationfolder = new File("D:\\Desktop\\SouthallTravel.png");
        FileUtils.copyFile(sourcefile,destinationfolder);
    }
}
//changes
