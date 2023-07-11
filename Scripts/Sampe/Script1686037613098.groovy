import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys


//open browser and go to google.com and serach for value selenium and print all the result one by one
// Open browser
WebUI.openBrowser('')

// Navigate to Google.com
WebUI.navigateToUrl('https://www.google.com/')

// Wait for page to load
WebUI.waitForPageLoad(10)

// Enter search keyword
WebUI.setText(findTestObject('Page_Google/input_concat(q) - Google Search'), 'selenium')

// Press Enter key
//WebUI.sendKeys(findTestObject('Page_Google/input_concat(q) - Google Search'), Keys.chord(Keys.ENTER))

// Wait for search results to load
//WebUI.waitForElementVisible(findTestObject('Page_Google/div_rcnt'), 10)

// Get all search results
//List<WebElement> searchResults = WebUI.findWebElements(findTestObject('Page_Google/div_rcnt'))

// Print each search result
//for (WebElement result : searchResults) {
   // println(result.getText())
//}

// Close browser
WebUI.closeBrowser()


