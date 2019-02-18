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

WebUI.navigateToUrl('http://webtst1.imbills.com/IntegrationsDashboard/Account/Login?ReturnUrl=%2fIntegrationsDashboard%2f')

WebUI.setText(findTestObject('Object Repository/Page_Integrations Dashboard/input_User name_UserName'), 'IM\\maki.nakahama')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Integrations Dashboard/input_Password_Password'), '98DKvOJKd1c9s3XUDjJJbQ==')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/input'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/a_Billing Files'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/a_- Not selected -'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/a_AutoBot10'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/a_(add a condition or create a'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/li_DOA'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Integrations Dashboard/select_- select -OnBeforeAfter'), 
    'Between', true)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Integrations Dashboard/input_empty_dp1549563352931'), '1/1/2016')

WebUI.setText(findTestObject('Page_Integrations Dashboard/input_and_dp1549563352932'), '1/1/2017')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/a_'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/li_create a new grouping'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/a_'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/li_Account Number'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Integrations Dashboard/select_- select -ContainsEqual'), 
    'Starts with', true)

WebUI.setText(findTestObject('Object Repository/Page_Integrations Dashboard/input_1'), '8')

WebUI.setText(findTestObject('Object Repository/Page_Integrations Dashboard/input_2'), '8')

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/a_'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/li_Account Number'))

WebUI.delay(2)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_Integrations Dashboard/select_- select -ContainsEqual'), 
    'title', 'Condition operator', 0)

WebUI.delay(2)
WebUI.verify
WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Integrations Dashboard/select_- select -ContainsEqual'), 
    'Starts with', true)
WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Integrations Dashboard/input_3'), '9')

WebUI.setText(findTestObject('Object Repository/Page_Integrations Dashboard/input_4'), '9')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/a_'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/li_Last Name'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/img'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/a_'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/li_create a new grouping'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/a_'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/li_Last Name'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/input_5'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Integrations Dashboard/select_- select -ContainsEqual'), 
    'Starts with', true)

WebUI.setText(findTestObject('Object Repository/Page_Integrations Dashboard/input_6'), 'm')

WebUI.setText(findTestObject('Object Repository/Page_Integrations Dashboard/input_7'), 'm')

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/a_'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/li_DOS'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Integrations Dashboard/select_- select -OnBeforeAfter'), 
    'After', true)

WebUI.setText(findTestObject('Object Repository/Page_Integrations Dashboard/input_empty_dp1549563352941'), '1/1/2017')

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/a_'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/li_Last Name'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Integrations Dashboard/select_- select -ContainsEqual'), 
    'Contains', true)

WebUI.setText(findTestObject('Object Repository/Page_Integrations Dashboard/input_8'), 'o')

WebUI.setText(findTestObject('Object Repository/Page_Integrations Dashboard/input_9'), 'o')

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/input_Include archived patient'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/td_3162017'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/td_ZNotification'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Dashboard/a_Logout'))

WebUI.delay(2)

WebUI.closeBrowser()

