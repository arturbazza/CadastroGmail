package positivepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroPhone {
    static WebDriver driver;
    WebDriverWait wait;

    public CadastroPhone(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void preencherCampo(){

        WebElement phoneNumberId = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("phoneNumberId")));
        phoneNumberId.sendKeys("51999922078");

        WebElement btAvancar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Próxima')]")));
        btAvancar.click();
    }
}