package cucumber.bdd.Finders;

import org.openqa.selenium.By;

public class HomePageFinders {
	public static By title = By.xpath("//title[text()='Se connecter |  | Shoop']");
	public static By byUniqueElement = By.xpath("//span[contains(text(),'Connexion à Mon Alerte Shoop')]");
	public static By byUsername = By.name("username");
}
