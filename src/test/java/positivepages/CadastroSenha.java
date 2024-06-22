package positivepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroSenha {
    static WebDriver driver;
    static WebDriverWait wait;

    public CadastroSenha(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void preencherCampo(){
        WebElement senha = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Passwd")));
        senha.sendKeys("1975Fundatec.");

        WebElement confirmacao = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("PasswdAgain")));
        confirmacao.sendKeys("1975Fundatec.");

        WebElement btAvancar = driver.findElement(By.xpath("//span[contains(text(),'Avançar')]"));
        btAvancar.click();
    }
}