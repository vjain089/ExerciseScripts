import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/select-menu')
// This line of code navigates to the URL 'https://demoqa.com/select-menu'
WebUI.navigateToUrl('https://demoqa.com/select-menu')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/path'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Group 2, option 1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEMOQA/select_RedBlueGreenYellowPurpleBlackWhiteVo_537a50'), 
    '3', true)
// This line of code selects an option from a dropdown list based on its value
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEMOQA/select_RedBlueGreenYellowPurpleBlackWhiteVo_537a50'), '3', true)

WebUI.closeBrowser()

WebUI.openBrowser('https://demoqa.com/select-menu')
