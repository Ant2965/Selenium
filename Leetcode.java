package selenium_testingant;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;

public class Leetcode {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ant\\Desktop\\SEMESTER 6\\Test Auto Lab\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver ob = new ChromeDriver();

        ob.manage().window().maximize();
        ob.get("https://www.selenium.dev/selenium/web/web-form.html");

        WebElement inputBox = ob.findElement(By.id("my-text-id"));
        WebElement pass = ob.findElement(By.name("my-password"));
        WebElement text = ob.findElement(By.name("my-textarea"));

        inputBox.clear();
        inputBox.sendKeys("Antriksh ");
        pass.clear();
        pass.sendKeys("1234567890");
        text.clear();
        text.sendKeys("Testing auto");

        // Accessing dropdown list
        WebElement dropdown = ob.findElement(By.name("my-select"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Two");

        WebElement dropdown2 = ob.findElement(By.name("my-datalist"));
        dropdown2.clear();
        dropdown2.sendKeys("India");

        WebElement color = ob.findElement(By.name("my-colors"));
        color.clear();
        color.sendKeys("#FF0000");

    

        WebElement fileInput = ob.findElement(By.name("my-file"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) ob;
        jsExecutor.executeScript("arguments[0].style.display='block';", fileInput);
        fileInput.sendKeys("E:\\tetst.txt");

        WebElement slide = ob.findElement(By.name("my-range"));
        //setSliderValue(ob, slide, 2);
        Point point =slide.getLocation();
        
        int x = point.getX();
        int y = point.getY();
        int value =5;
        
        int total =value+y;
        //ob.switchTo().frame(slide);
        
        Actions action = new Actions(ob);
        Thread.sleep(1000);
        action.dragAndDropBy(slide,200,0).perform();    
        
        
        
        WebElement datePicker = ob.findElement(By.name("my-date"));
        datePicker.click();
        datePicker.sendKeys("10/01/2004");
        datePicker.sendKeys(Keys.ENTER);
        
       WebElement submit =ob.findElement(By.className("btn"));
        submit.click();
        
    }

    // Set the value of the slider
 
    }
    
    
    
    
    

