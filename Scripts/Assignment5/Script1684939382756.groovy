import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.openBrowser('http://www.google.com')
WebDriver driver = DriverFactory.getWebDriver()



driver.findElement(By.name("q")).sendKeys("Katalon Studio")

//WebDriverWait wait = DriverFactory.wa

p = driver.findElements(By.xpath("//*[@class='G43f7e']//li")).size()

println p

for(i=1;i<=p;i++) {
	q=driver.findElement(By.xpath("//*[@class='G43f7e']//li["+i+"]")).getText()
	println q
}