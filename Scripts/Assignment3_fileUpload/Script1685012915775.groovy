import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://blueimp.github.io/jQuery-File-Upload/')

WebUI.maximizeWindow()

WebUI.uploadFile(findTestObject('Page_jQuery File Upload Demo/input_fileUpload'), File_Path)

WebUI.click(findTestObject('Page_jQuery File Upload Demo/btn_StartUpload'))

WebUI.delay(2)

//Capturing the Uploaded file name
File_Name = WebUI.getText(findTestObject('Object Repository/Page_jQuery File Upload Demo/UploadedFile'))

//Spliting the file name from FIle path for Verification
String[] files = File_Path.split('/')

//Comparing both the file names
WebUI.verifyElementText(findTestObject('Page_jQuery File Upload Demo/UploadedFile'), files[(files.length - 1)])