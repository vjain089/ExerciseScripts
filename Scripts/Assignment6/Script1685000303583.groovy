import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

driver.get('https://www.techlistic.com/p/demo-selenium-practice.html')

rowswithHeader = driver.findElements(By.xpath('//*[@id=\'customers\']//tr')).size()

rowscount = (rowswithHeader - 1)

cellcount = driver.findElements(By.xpath('//*[@id=\'customers\']//td')).size()

colscount = (cellcount / rowscount)

for (i = 2; i <= rowscount; i++) {
    for (j = 1; j <= colscount; j++) {
        result_data = driver.findElement(By.xpath(((('//*[@id=\'customers\']//tr[' + i) + ']/td[') + j) + ']')).getText()

        println(result_data)

    }
}