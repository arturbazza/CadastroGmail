package negativepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroPhoneNeg {
    static WebDriver driver;
    static WebDriverWait wait;
    public CadastroPhoneNeg(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void preencherCampo(){
        WebElement senha = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Passwd")));
        senha.sendKeys("");

        WebElement confirmacao = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("PasswdAgain")));
        confirmacao.sendKeys("");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(),'Avançar')]"));
        botaoAvancar.click();
    }

    public static String validarMensagemGooglePhone() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Digite uma senha')]")));
        return driver.findElement(By.xpath("//span[contains(text(),'Digite uma senha')]")).getText();
    }
}
