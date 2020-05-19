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

WebUI.setText(findTestObject('Object Repository/RegistrationPage_OR/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_username'), 
    'adityanadkarni')

WebUI.setText(findTestObject('Object Repository/RegistrationPage_OR/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_email'), 
    'adithedaddy90@gmail.com')

WebUI.setText(findTestObject('Object Repository/RegistrationPage_OR/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_password'), 
    'abcd1234')

WebUI.setText(findTestObject('Object Repository/RegistrationPage_OR/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_cpassword'), 
    'abcd1234')

WebUI.setText(findTestObject('Object Repository/RegistrationPage_OR/Page_Login  Sign Up Forms/input_Address type HomeOffice_dob'), 
    '21/12/1990')

WebUI.setText(findTestObject('Object Repository/RegistrationPage_OR/Page_Login  Sign Up Forms/input_Address type HomeOffice_phone'), 
    '8867452434')

WebUI.setText(findTestObject('Object Repository/RegistrationPage_OR/Page_Login  Sign Up Forms/input_Address type HomeOffice_address'), 
    'sachin society building no.8, flat no.3')

WebUI.click(findTestObject('Object Repository/RegistrationPage_OR/Page_Login  Sign Up Forms/input_Address type HomeOffice_add_type'))

WebUI.selectOptionByValue(findTestObject('Object Repository/RegistrationPage_OR/Page_Login  Sign Up Forms/select_Choose Gender                  Male _4c15ff'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/RegistrationPage_OR/Page_Login  Sign Up Forms/select_Select CountryAfghanistanAlbaniaAlge_9a933d'), 
    '101', true)

WebUI.setText(findTestObject('Object Repository/RegistrationPage_OR/Page_Login  Sign Up Forms/input_Address type HomeOffice_zip'), 
    '400081')

WebUI.click(findTestObject('Object Repository/RegistrationPage_OR/Page_Login  Sign Up Forms/input_Address type HomeOffice_terms'))

WebUI.closeBrowser()

