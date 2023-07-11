import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('http://www.google.com')

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

driver.get('https://www.google.com/')

driver.findElement(By.name('q')).sendKeys('Katalon Studio')

p = driver.findElements(By.xpath('//*[@class=\'G43f7e\']//li')).size()

println(p)

for (i = 1; i <= p; i++) {
    result = driver.findElement(By.xpath(('//*[@class=\'G43f7e\']//li[' + i) + ']')).getText()
    println(result)
}

/*
 * Automated web scraping of Google search results using Katalon Studio.
 * 1. The code imports necessary libraries and sets up the WebDriver.
 * 2. The code opens a browser and navigates to Google.
 * 3. The code searches for 'Katalon Studio' and retrieves the search results.
 * 4. The code prints the number of search results and the text of each result.
 */