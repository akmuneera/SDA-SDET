package junit;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class Assignment4 extends Tests {

    @Test

    public void keyboardActions(){

        driver.navigate().to("https://www.google.com/");

        WebElement searchInput = driver.findElement(By.id("APjFqb"));
        new Actions(driver)
                .click(searchInput)
                .perform();

        new Actions(driver)
                .keyDown(Keys.SHIFT)
                .sendKeys("S")
                .keyUp(Keys.SHIFT)
                .sendKeys("croll")
                .keyDown(Keys.SPACE)
                .keyDown(Keys.SHIFT)
                .sendKeys("M")
                .keyUp(Keys.SHIFT)
                .sendKeys("ethods")
                .keyDown(Keys.ENTER)
                .perform();

    }
}



