package positivepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class CadastroData {
    static WebDriver driver;
    static WebDriverWait wait;
    public CadastroData(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void preencherCampo(){

        WebElement dia = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("day")));
        dia.sendKeys("12");

        WebElement mes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("month")));
        mes.sendKeys("Março");
        mes.click();

        WebElement ano = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("year")));
        ano.sendKeys("1975");

        WebElement genero = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gender")));
        genero.sendKeys("Homem");
        genero.click();

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(),'Avançar')]"));
        botaoAvancar.click();
    }
}
