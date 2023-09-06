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
import internal.GlobalVariable
import net.bytebuddy.asm.Advice.Enter

import org.openqa.selenium.Keys as Keys

import org.sikuli.script.Key
import org.sikuli.script.*
import org.sikuli.script.Screen
import org.sikuli.script.FindFailed
import org.sikuli.script.ImagePath
import org.sikuli.script.Sikulix
import org.sikuli.basics.Settings
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region

import javax.swing.JOptionPane

String vApplication = "C:\\Windows\\System32\\calc.exe"

String[] miArray = {"cuatro.png" "mas.png" "cinco.png"}

String vStringPathFolder = "C:\\Users\\quelys.rodriguez\\Desktop\\"

Runtime.runtime.exec(vApplication)
Windows.delay(5)

ImagePath.add(vStringPathFolder)



for (String elemento : miArray) {
	// Identifica el elemento en la interfaz de usuario usando SikuliX
	Screen screen = new Screen();
	Pattern pattern = new Pattern(vStringPathFolder);
	screen.click(pattern);

	// Realiza alguna acción en el elemento
	//screen.type(elemento);
}
