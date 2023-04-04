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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementPresent(findTestObject('Page_Register/Redaksi CREATE A MOBIPAID ACCOUNT'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Register/Redaksi CREATE A MOBIPAID ACCOUNT'), 0)

WebUI.waitForElementPresent(findTestObject('Page_Register/Kolom FIrst Name'), 0)

WebUI.waitForElementPresent(findTestObject('Page_Register/Kolom Last Name'), 0)

WebUI.waitForElementPresent(findTestObject('Page_Register/Kolom Email'), 0)

WebUI.waitForElementPresent(findTestObject('Page_Register/Kolom Password'), 0)

WebUI.waitForElementPresent(findTestObject('Page_Register/Kolom Company Name'), 0)

WebUI.waitForElementPresent(findTestObject('Page_Register/Kolom Phone Number'), 0)

WebUI.waitForElementPresent(findTestObject('Page_Register/Kolom State'), 0)

WebUI.waitForElementPresent(findTestObject('Page_Register/Dropdown Negara'), 0)

WebUI.waitForElementPresent(findTestObject('Page_Register/Kolom State'), 0)

WebUI.waitForElementPresent(findTestObject('Page_Register/Checkbox'), 0)

WebUI.waitForElementPresent(findTestObject('Page_Register/Button Next Step'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Register/Kolom FIrst Name'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Register/Kolom Last Name'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Register/Kolom Email'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Register/Kolom Password'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Register/Kolom Company Name'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Register/Kolom Phone Number'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Register/Dropdown Negara'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Register/Kolom State'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Register/Checkbox'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Register/Button Next Step'), 0)

WebUI.click(findTestObject('Page_Register/Kolom FIrst Name'))

WebUI.setText(findTestObject('Page_Register/Kolom FIrst Name'), GlobalVariable.first_name)

WebUI.setText(findTestObject('Page_Register/Kolom Last Name'), GlobalVariable.last_name)

WebUI.setText(findTestObject('Page_Register/Kolom Email'), GlobalVariable.email)

WebUI.setText(findTestObject('Page_Register/Kolom Password'), GlobalVariable.password)

WebUI.setText(findTestObject('Page_Register/Kolom Company Name'), GlobalVariable.company_name)

WebUI.setText(findTestObject('Page_Register/Kolom Phone Number'), GlobalVariable.phone_number)

WebUI.setText(findTestObject('Page_Register/Dropdown Negara'), GlobalVariable.negara)

WebUI.setText(findTestObject('Page_Register/Kolom State'), GlobalVariable.state)

WebUI.click(findTestObject('Page_Register/Checkbox'))

WebUI.click(findTestObject('Page_Register/Button Next Step'))

WebUI.waitForElementPresent(findTestObject('Page_Register/Redaksi Account successfully created'), 0)

WebUI.verifyElementPresent(findTestObject(null), 0)

WebUI.closeBrowser()

