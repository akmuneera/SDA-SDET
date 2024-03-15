package junit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class Assignment3 extends Tests {

    @Test
    public void dragAndDrop() {
        driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
        By bank = By.xpath("//li[contains(@class,'block14 ui-draggable')]");
        By fiveThousand1 = By.id("fourth");
        By accountDebit = By.id("bank");
        By amountDebit = By.id("amt7");
        By sales = By.xpath("//li[contains(@class,'block15 ui-draggable')]");
        By fiveThousand2 = By.id("fourth");
        By accountCredit = By.id("loan");
        By amountCredit = By.id("amt8");


        // Drag and drop the BANK button to the Account section in DEBIT SIDE

        new Actions(driver)
                .dragAndDrop(driver.findElement(bank),driver.findElement(accountDebit))
                .perform();

        // Drag and drop the SALES button to the Account section in CREDIT SIDE


        new Actions(driver)
                .dragAndDrop(driver.findElement(sales)
                        ,driver.findElement(accountCredit))
                .perform();

        // Drag and drop the 5000 button to the Amount section in DEBIT SIDE

        new Actions(driver)
                .dragAndDrop(driver.findElement(fiveThousand1),driver.findElement(amountDebit))
                .perform();

        // Drag and drop the second 5000 button to the Amount section in CREDIT SIDE

        new Actions(driver)
                .dragAndDrop(driver.findElement(fiveThousand2),driver.findElement(amountCredit))
                .perform();

        // Verify the visibility of Perfect text.
        By text = By.xpath("(//a[contains(@class,'button button-green')])[1]");
        String actual =driver.findElement(text).getText();
        Assertions.assertEquals("Perfect!", actual);


    }
}


