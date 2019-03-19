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

url = findTestData('DataADT2').getValue('url', 1)

usr = findTestData('DataADT2').getValue('user', 1)

pwd = findTestData('DataADT2').getValue('password', 1)

newinterf = findTestData('DataADT2').getValue('newInterface', 1)

interfdesc = findTestData('DataADT2').getValue('interfaceDesc', 1)

group1 = findTestData('DataADT2').getValue('group1', 1)

group2 = findTestData('DataADT2').getValue('group2', 1)

msgtmp = findTestData('DataADT2').getValue('msg', 1)
msg = msgtmp.replaceAll('~`~', '\r\n')

dbip = findTestData("DataADT2").getValue("dbIP", 1)
dbport = findTestData("DataADT2").getValue("dbPort", 1)
dbgrp = findTestData("DataADT2").getValue("dbGroup", 1)
dbusr = findTestData("DataADT2").getValue("dbUsr", 1)
dbpwd = findTestData("DataADT2").getValue("dbPwd", 1)
dbqtmppatient = findTestData("DataADT2").getValue("dbQueryTempPatient", 1)
dbclnfullp = findTestData("DataADT2").getValue("dbCleanTempFullPatient", 1)

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.setText(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_User name_UserName (4)'), usr)

WebUI.setEncryptedText(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_Password_Password (4)'), 
    pwd)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input (4)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/a_Incoming Feeds (4)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/select_ADTSIUDX            WEBAPI            ADT2 (4)'), 
    '19', true)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/img (4)'))

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/span_New Interface (4)'))

WebUI.setText(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_Interface Name_InterfaceName (4)'), 
    newinterf)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_Interface Name_IsProduction (4)'))

WebUI.setText(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_Description_InterfaceDescription (4)'), 
    interfdesc)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/a_Find Available Port (4)'))

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_New port number_findPortButton (4)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_New port number_applyButton (4)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/a_(show advanced)'))

WebUI.setText(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/input_Timer Interval_MessageQueueProcessorTimerInterval'),
	'5000')

WebUI.setText(findTestObject('Object Repository/Temp/Page_Integrations Dashboard/input_Timer Interval_PatientDataDistributorTimerInterval'),
	'5000')
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_The Description field is required._hideWhenReadonly'))

WebUI.setText(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_Feed Name_FeedName'), newinterf)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input (5)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/td_ADT2 Auto'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/a_Add group'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_New group name_newGroupName'), group1)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/button_Add'))

WebUI.delay(2)

WebUI.click(findTestObject('ADT2/Page_Integrations Dashboard/input (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/a_Show sites'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/a_Add site'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_(none)_IntegrationsTest1111168B09-F2E8-4DE5-901B-E7D0DEC4D90D'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_Test Site I_IntegrationsTest111C6859FB-29CA-4147-8FEF-AFD12E508E6B'))

WebUI.delay(2)

WebUI.click(findTestObject('ADT2/Page_Integrations Dashboard/button_Add (2)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/img'))

WebUI.click(findTestObject('ADT2/Page_Integrations Dashboard/div_IntegrationsTest11_groupActions groupMenu'))

WebUI.delay(2)

WebUI.click(findTestObject('ADT2/Page_Integrations Dashboard/li_Clone'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_New group name_newGroupName'), group2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/a_IntegrationsTest21'))

WebUI.setText(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_AAE5892-986D-4D18_newGroupName'), 
    'IntegrationsTest21')

WebUI.delay(2)

WebUI.click(findTestObject('ADT2/Page_Integrations Dashboard/button_Add (3)'))

WebUI.click(findTestObject('ADT2/Page_Integrations Dashboard/input (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/a_Show sites'))

WebUI.delay(2)

WebUI.click(findTestObject('ADT2/Page_Integrations Dashboard/a_Add site (2)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_(none)_IntegrationsTest2111168B09-F2E8-4DE5-901B-E7D0DEC4D90D'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_Eastside_IntegrationsTest211C6859FB-29CA-4147-8FEF-AFD12E508E6B'))

WebUI.delay(2)

WebUI.click(findTestObject('ADT2/Page_Integrations Dashboard/button_Add (4)'))

WebUI.delay(2)

/*--
WebUI.setText(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_New group name_newGroupName'), 'integration')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/a_IntegrationsTest21'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_AAE5892-986D-4D18_newGroupName'), 
    'IntegrationsTest21')

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/button_Add'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input (6)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/img_1'))

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/span_Clone'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_EC60604-6769-4D78_newGroupName'), 
    'in')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_New group name_newGroupName'), 'integration')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/a_IntegrationsTest11'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_New group name_newGroupName'), 'IntegrationsTest11')

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/button_Add'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input (6)'))

--*/
WebUI.rightClick(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/td_ADT2 Auto'))

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/span_View Interface'))

WebUI.rightClick(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/td_ADT2 Auto'))

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/span_Start'))
WebUI.delay(2)
WebUI.rightClick(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/td_ADT2 Auto'))

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/span_Send Message'))

WebUI.setText(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/textarea_(collapse all)_messageText'), 
    msg)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_(select message text)_parseButton'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_(select message text)_sendButton'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_(select message text)_closeButton'))

WebUI.delay(10)

WebUI.rightClick(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/td_ADT2 Auto'))

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/span_Search Messages'))

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_Search Text_searchMessagesButton'))

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/td_12345'))

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/input_1'))

WebUI.delay(10)
CustomKeywords.'com.integrationsDB.sqlConnection.connectDB'(dbip, dbport, dbgrp, dbusr, dbpwd)
WebUI.delay(2)
def records
List<String> tempRecords = new ArrayList<String>()
records = CustomKeywords.'com.integrationsDB.sqlConnection.executeQuery'(dbqtmppatient )
int noOfColumns = 0
while(records.next()){
	noOfColumns = records.getMetaData().getColumnCount()
	for(int i=1; i<=noOfColumns; i++){
		def sourcePattern = records.getString(i);
		tempRecords.add(sourcePattern)
	}
}

for(item in tempRecords){
	println(item)
}

CustomKeywords.'com.integrationsDB.sqlConnection.execute'(dbclnfullp)

WebUI.delay(3)

CustomKeywords.'com.integrationsDB.sqlConnection.closeDatabaseConnection'()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ADT2/Page_Integrations Dashboard/a_Logout'))

WebUI.closeBrowser()

