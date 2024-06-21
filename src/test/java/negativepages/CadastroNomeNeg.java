package negativepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CadastroNomeNeg {
    static WebDriver driver;
    public CadastroNomeNeg(WebDriver driver){
        this.driver = driver;
    }

    public void preencherCampo(){
        WebElement nome = driver.findElement(By.id("firstName"));
        nome.sendKeys("");

        WebElement sobrenome = driver.findElement(By.id("lastName"));
        sobrenome.sendKeys("");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(),'Avançar')]"));
        botaoAvancar.click();
    }
}
