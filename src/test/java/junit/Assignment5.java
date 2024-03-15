package junit;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class Assignment5 extends Tests {

    @Test
    public void cookies(){
        driver.navigate().to("http://facebook.com");
        driver.manage().getCookies();
        driver.manage().addCookie(new Cookie("user","muneera"));
        driver.manage().deleteCookieNamed("muneera");
        driver.manage().deleteAllCookies();
    }

}


