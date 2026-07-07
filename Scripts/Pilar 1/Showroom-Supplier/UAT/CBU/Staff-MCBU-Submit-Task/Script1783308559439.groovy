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

WebUI.callTestCase(findTestCase('Pilar 1/Login/UAT/Mobile/Staff-MCBU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/Staff-MCBU-Submit-Task/Page_Home/span_Kunjungan Showroom'))

not_run: WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/Staff-MCBU-Submit-Task/Page_KunjunganShowroom/i_icon-filter'))

not_run: WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/Staff-MCBU-Submit-Task/Page_KunjunganShowroom/input_startdate'), 
    '06-07-2026')

not_run: WebUI.setText(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/Staff-MCBU-Submit-Task/Page_KunjunganShowroom/input_enddate'), 
    '06-07-2026')

not_run: WebUI.selectOptionByValue(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/Staff-MCBU-Submit-Task/Page_KunjunganShowroom/select_b4-b1-Dropdown1'), 
    '2', false)

not_run: WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/Staff-MCBU-Submit-Task/Page_KunjunganShowroom/button_Status_BARU'))

not_run: WebUI.click(findTestObject('Pilar 1/Showroom-Supplier/UAT/CBU/Staff-MCBU-Submit-Task/Page_KunjunganShowroom/button_Set'))

