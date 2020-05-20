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

WebUI.setText(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/Username'), 'adityanadkarni')

WebUI.setText(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/Email'), 'adithedaddy90@gmail.com')

WebUI.setText(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/Password'), 'abcd1234')

WebUI.setText(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/Confirm Password'), 'abcd1234')

WebUI.setText(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/DOB'), '21/12/1990')

WebUI.setText(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/phoneNo'), '8867452434')

WebUI.setText(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/Address'), 'Sachin Society CHS LTD')

WebUI.click(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/RadioBtnHome'))

WebUI.scrollToElement(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/Username'), 2)

WebUI.selectOptionByLabel(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/Gender'), 'Male', true)

WebUI.selectOptionByLabel(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/Country'), 'India', true)

WebUI.waitForElementHasAttribute(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/State'), 'Value', 4, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/State'), 'Maharashtra', false)

WebUI.waitForElementHasAttribute(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/City'), 'Value', 4)

WebUI.selectOptionByLabel(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/City'), 'Mumbai', false)

WebUI.setText(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/ZipCode'), '400081')

WebUI.click(findTestObject('RegistrationPage_OR/Page_Login  Sign Up Forms/TC'))

