import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://thetestingworld.com/testings')

WebUI.maximizeWindow()

'it will enter the data same as keyboard and will not remove existing data and will append it'
WebUI.sendKeys(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/Username'), 'adityanadkarni')

'it will clear the text field on use of this command'
WebUI.clearText(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/Username'))

'Remove existing data and enter new data'
WebUI.setText(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/Username'), 'aditya0007')

'with this it will encrypt the text and will display here'
WebUI.setEncryptedText(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/Password'), 'QwFdsk+Z8OA=')

WebUI.setEncryptedText(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/Email'), 'aJG5CcB/u5/IoIn6sqr8rkhuNLS7Pw5T')

WebUI.closeBrowser()

