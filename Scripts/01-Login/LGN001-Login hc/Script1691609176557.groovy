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

import org.sikuli.script.Key
import org.sikuli.script.Screen
import org.sikuli.script.FindFailed
import org.sikuli.script.ImagePath
import org.sikuli.script.Sikulix
import org.sikuli.basics.Settings

import javax.swing.JOptionPane

String vApplication = "C:\\Program Files (x86)\\DGSIAF\\esidif tprod-si\\esidif.exe"

String vUser = 'DNI00110001'
String vPswd = 'Dni00110001'

String txtLgnUser = "lgnUser.png"
String txtLgnPass = "lgnPswd.png" 
String btnLgnAccess = "lgnIngresar.png"
String txtLgneSidif = "winText.png"

/*
String imgDshTreeConciliacionBanco = "ConciliacionBanc.png"
String imgDshTreeConcBancoExtracto = "treeConcBankExtracto.png"
String icoConcBcoExtracto = "treeIcoExtracto.png"
String btnExtBancoExtractoCancelar = "Cancelar.png"
String mnuBarArchivo =  "mnuArchivo.png"
String mnuBarArchivoSalir = "Salir.png"
*/

String vStringPathFolder = "C:\\Users\\fguillermet\\Katalon Studio\\Sikuli2.5\\Screenshots\\UHD\\"

String vText = ""

Runtime.runtime.exec(vApplication)
Windows.delay(10)


ImagePath.add(vStringPathFolder)

//----------- Login ----------
Screen s = new Screen()
JOptionPane.showMessageDialog(null, s.getH() + ' - '+ s.getW())

"Captura el texto cunado esta vacio"
vText = s.find(txtLgneSidif).text()
s.click(txtLgneSidif)
JOptionPane.showMessageDialog(null, vText)


s.find(txtLgnUser)
s.click(txtLgnUser)
s.type(vUser)



"Captura el texto con el string cargado"
vText = s.find(txtLgnUser).text()
JOptionPane.showMessageDialog(null, vText)

Windows.delay(5)

/*
// ------- Conciliacion Bancaria - Extracto ------
s.click(imgDshTreeConciliacionBanco)
s.type(Key.ADD)

s.click(imgDshTreeConcBancoExtracto)
s.type(Key.ADD)

s.doubleClick(icoConcBcoExtracto)

//s.findText("Banco")
JOptionPane.showMessageDialog(null, "previo mouse coord")
s.mouseMove(701, 378)
s.click(701, 378)
s.type("Banco Nacion")
JOptionPane.showMessageDialog(null, "pos mouse coord")

Windows.delay(3)

s.click(btnExtBancoExtractoCancelar)


s.type(Key.SHIFT, Key.TAB)
s.type(Key.ENTER)

Windows.delay(3)
*/