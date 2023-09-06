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

String email = "quelys.rodriguez@tsoftglobal.com"
String password = "123456"


WebUI.openBrowser(null)
WebUI.maximizeWindow()
WebUI.navigateToUrl('http://www.automationpractice.pl/index.php?controller=authentication&back=my-account')
WebUI.click(findTestObject('Object Repository/sign_in'))
WebUI.setText(findTestObject('Object Repository/input_email'), email)
WebUI.setText(findTestObject('Object Repository/input_password'), password)
WebUI.click(findTestObject('Object Repository/button_signIn'))
WebUI.verifyTextPresent('Qujelys Rodriguez', true)
WebUI.delay(3)
WebUI.closeBrowser()