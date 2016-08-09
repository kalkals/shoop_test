package cucumber.bdd.Finders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageFinders {
	public static By bySpan = By.xpath("//span[contains(text(),'Connexion à Mon Alerte Shoop')]");
	public static By byUsername = By.name("username");
	public static By byPassword = By.name("password");
	public static By bySubmit = By.xpath("//button[text()='Se connecter']");
	public static By byInvalidMessage = By.xpath("//div[@ng-if='item.message' and text()='Nous sommes désolés, l'adresse e-mail et/ou le mot de passe sont incorrects']");
	
	

	
}
