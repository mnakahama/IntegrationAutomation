import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.imbills.com/IntegrationsDashboard/Account/Login?ReturnUrl=%2fIntegrationsDashboard')

WebUI.setText(findTestObject('Page_Integrations Dashboard/input_User name_UserName (2)'), 'IM\\maki.nakahama')

WebUI.setEncryptedText(findTestObject('Page_Integrations Dashboard/input_Password_Password (2)'), 'xWOFDJD/8f+y1p7HCeDraA==')

WebUI.click(findTestObject('Page_Integrations Dashboard/input (2)'))

WebUI.closeBrowser()

static void runBatchFile(String batchFile) {
    String bf = (RunConfiguration.getProjectDir() + '/') + batchFile

    comment('Running batch file: ' + bf)

    Runtime.runtime.exec(bf)
}

