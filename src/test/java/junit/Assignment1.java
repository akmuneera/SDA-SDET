package junit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 extends Tests{
    @Test
    public void blueSquare() {
        Actions action = new Actions(driver);
        // go to url
        driver.navigate().to("https://api.jquery.com/dblclick/");

        // Doubleclick on the blue square at the bottom of the page and then write the changed color.

        WebElement doubleClickFrame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(doubleClickFrame);
        WebElement blueSquare = driver.findElement(By.cssSelector("body>div"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", blueSquare);
        action.doubleClick(blueSquare).perform();
        String changedColor = blueSquare.getCssValue("background-color");
        System.out.println(changedColor);

        //Go top of the page and sendKeys "Thanks to JavascriptExecutor"
        driver.switchTo().defaultContent();
        WebElement searchBar= driver.findElement(By.name("s"));
        searchBar.sendKeys("Thanks to Javascript Executor");

        //Go to the bottom of the page and click the book, name"jQuery in Action"
        JavascriptExecutor scrollToTheBottom = (JavascriptExecutor) driver;
        scrollToTheBottom.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        WebElement jQueryInAction = driver.findElement(By.xpath("//a[@href='https://www.manning.com/books/jquery-in-action-third-edition']"));
        jQueryInAction.click();

    }
}




