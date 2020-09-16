package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class productlistPageObject {
    WebDriver driver;
    Actions action = new Actions(driver);

   // private WebElement womenDropdown;
    private WebElement selectTops;


    public void hoverWomenDropdown()
    {
        //Actions action = new Actions(driver);
       // WebElement ele = driver.findElement(By.linkText("Women"));
        //WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Women')]"));
        //womenDropdown.findElement(By.linkText("Women"));
        //womenDropdown.findElement(By.xpath("//span[contains(text(),'Women')]"));
        //WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/nav/ul/li[2]/a/span[2]"));
          WebElement ele = driver.findElement(By.id("ui-id-4"));

        //Action mouseroverWomen = action.moveToElement(ele).build();
        //mouseroverWomen.perform();
        action.moveToElement(ele).perform();
    }

    public void selectTops()
    {
        WebElement ele2 = driver.findElement(By.linkText("Tops"));
        ele2.click();
    }
}
