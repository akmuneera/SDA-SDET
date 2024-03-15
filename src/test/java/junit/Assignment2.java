package junit;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Assignment2 extends Tests {


    @Test
    public void homeWork() {

        // go to URL
        driver.navigate().to("https://the-internet.herokuapp.com/windows");

        // Verify the text: "Opening a new window"
        WebElement openANewWindowText = driver.findElement(By.tagName("h3"));
        var text = openANewWindowText.getText();
        Assertions.assertEquals(text, "Opening a new window");

        // Verify the title of the page is "The Internet"
        String pageTitle = "The Internet";
        Assertions.assertEquals(pageTitle, driver.getTitle());

        // click on "Click Here" Button
        driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();

        // Verify the new window title is “New Window”
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pageTwoTitle = "New Window";
        Assertions.assertEquals(pageTwoTitle, driver.getTitle());


    }

}