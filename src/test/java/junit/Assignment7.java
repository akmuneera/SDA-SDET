package junit;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Assignment7 extends Tests{

    @Test

    public void fullPageScreenshot() throws IOException {

        driver.navigate().to("https://www.amazon.com/");

        // take full page screenshot

        File src = ((ChromeDriver)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src, new File("FullPageScreenshot.png"));


    }

// take specific element screenshot

    public void specificElementScreenshot() throws IOException {

        driver.navigate().to("https://www.amazon.com/");

        File ElementScreenshot = driver.findElement(By.cssSelector("i[class='a-icon a-logo']")).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(ElementScreenshot, new File("SpecificElementScreenshot.png"));
    }

}
