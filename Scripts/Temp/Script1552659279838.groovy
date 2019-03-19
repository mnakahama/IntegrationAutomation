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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.imbills.com/IntegrationsDashboard/Account/Login?ReturnUrl=%2fIntegrationsDashboard')

WebUI.setText(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/input_User name_UserName (1)'), 'im\\maki.nakahama')

WebUI.setEncryptedText(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/input_Password_Password (1)'), 
    'xWOFDJD/8f+y1p7HCeDraA==')

WebUI.click(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/input (2)'))

WebUI.click(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/a_Incoming Feeds (1)'))

WebUI.click(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/div_ADTSIUDX            WEBAPI            ADT2ProdTestFeeds(filter)Include disabled'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/select_ADTSIUDX            WEBAPI            ADT2 (1)'), 
    '19', true)

WebUI.click(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/img (1)'))

WebUI.click(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/span_New Interface'))

WebUI.setText(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/input_Interface Name_InterfaceName'), 'Adt2 AutO')

WebUI.click(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/input_Interface Name_IsProduction'))

WebUI.setText(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/input_Description_InterfaceDescription'), 
    'ADT2 Automation')

WebUI.click(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/a_(show advanced)'))

WebUI.click(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/a_(show advanced)'))

WebUI.setText(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/input_Timer Interval_MessageQueueProcessorTimerInterval'), 
    '5000')

WebUI.setText(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/input_Timer Interval_PatientDataDistributorTimerInterval'), 
    '5000')

WebUI.click(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/input_The Description field is required._hideWhenReadonly'))

WebUI.click(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/a_Find Available Port'))

WebUI.click(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/input_New port number_findPortButton'))

WebUI.click(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/input_New port number_applyButton'))

WebUI.click(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/input_The Description field is required._hideWhenReadonly'))

WebUI.setText(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/input_Feed Name_FeedName'), 'ADT2 Auto')

WebUI.click(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/input (2)'))

WebUI.closeBrowser()

