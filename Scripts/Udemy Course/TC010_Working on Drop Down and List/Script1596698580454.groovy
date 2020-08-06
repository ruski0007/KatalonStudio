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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://thetestingworld.com/testings/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/Username'), 'adityanadkarni')

WebUI.setText(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/Email'), 'adithedaddy90@gmail.com')

WebUI.setEncryptedText(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/Password'), 'QwFdsk+Z8OA=')

WebUI.setEncryptedText(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/Confirm Password'), 'QwFdsk+Z8OA=')

WebUI.setText(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/DOB'), '21/12/1990')

WebUI.setText(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/phoneNo'), '8867452434')

WebUI.setText(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/Address'), 'Sachin Society CHS LTD')

WebUI.check(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/OfficeRadioBtn'))

WebUI.scrollToElement(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/Password'), 2)

WebUI.selectOptionByIndex(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/Gender'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/Country'), '101', false)

WebUI.waitForElementAttributeValue(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/State'), 'Value', 
    '22', 4)

WebUI.selectOptionByLabel(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/State'), 'Maharashtra', 
    false)

WebUI.waitForElementAttributeValue(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/City'), 'Value', 
    '2707', 4)

WebUI.selectOptionByValue(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/City'), '2707', false)

WebUI.sendKeys(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/ZipCode'), '400081')

WebUI.check(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/TC'))

WebUI.click(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/Read Detail Link'))

WebUI.delay(5)

WebUI.click(findTestObject('Udemy Course/RegistrationPage_OR/Page_Login  Sign Up Forms/Close Button'))

