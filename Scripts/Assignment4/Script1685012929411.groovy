import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/select-menu')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/path'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Group 2, option 1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEMOQA/select_RedBlueGreenYellowPurpleBlackWhiteVo_537a50'), 
    '3', true)

WebUI.closeBrowser()

