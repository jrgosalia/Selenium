import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Website {

	public static void main(String[] args) {
		WebElement textBoxUserName;
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("url");
		textBoxUserName.sendKeys(username);
		Thread.sleep(5000);
		textBoxPassword.sendKeys(Password);
		Thread.sleep(5000);
		textBoxPostCode.sendKeys(PostalCode);
		Thread.sleep(5000);
		//Robot rb=new Robot();
		//rb.keyPress(KeyEvent.VK_ENTER);
		buttonLogin.click()
	}
}
