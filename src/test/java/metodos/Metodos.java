package metodos;





import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Metodos {

	public static WebDriver driver;

	public void screnShoot(String nome) throws IOException {

        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("./src/evidencia/" + nome + ".png");
        FileUtils.copyFile(SrcFile, DestFile);
	}

	public void pausa (int tempo, String descricaopasso) throws InterruptedException {
		//Thread.sleep(5000);
		try {
			Thread.sleep(tempo);
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "erro no passo" + descricaopasso);
		}
	}

	public void preencher(By elemento, String texto, String descricaopasso) throws IOException {
		
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "erro no passo" + descricaopasso);
			
		}
	}

	public void click (By elemento, String descricaopasso) throws IOException {
		try {
			driver.findElement(elemento).click();
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "erro no passo" + descricaopasso);
			
		}
	}
	public void fecharnavegador(String descricaopasso) throws IOException {
		try {
			driver.quit();
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "erro no passo" + descricaopasso);
			
		}
	}

	public void executarnavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public void conferirAssert (By by, String elemento, String descricaopasso) {
		try {
			assertEquals(elemento, by);
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "erro no passo1" + descricaopasso);
		
		
	}

	

	
	
	}}

