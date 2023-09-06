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

import javax.swing.JOptionPane

String vApplication = "C:\\Windows\\System32\\calc.exe"

String pagina = "cuatro.png"

String vStringPathFolder = "C:\\Users\\quelys.rodriguez\\Desktop\\"

Runtime.runtime.exec(vApplication)
Windows.delay(5)

ImagePath.add(vStringPathFolder)

////----------- Login ----------
Screen s = new Screen()


JOptionPane.showMessageDialog(null, s.getH() + ' - '+ s.getW())
Windows.delay(5)

s.click(pagina)

if (s.exists(pagina)!= null) {
	s.click(pagina)
} 
else {
            System.out.println("El elemento no está en la pantalla")
}
