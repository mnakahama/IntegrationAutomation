import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

url = findTestData("DataForcePop").getValue("url", 1)
usr = findTestData("DataForcePop").getValue("user", 1)
pwd = findTestData("DataForcePop").getValue("password", 1)
msg = findTestData("DataForcePop").getValue("sendMsg", 1)
dbip = findTestData("DataForcePop").getValue("dbIP", 1)
dbport = findTestData("DataForcePop").getValue("dbPort", 1)
dbgrp = findTestData("DataForcePop").getValue("dbGroup", 1)
dbusr = findTestData("DataForcePop").getValue("dbUsr", 1)
dbpwd = findTestData("DataForcePop").getValue("dbPwd", 1)
dbqtblmain = findTestData("DataForcePop").getValue("dbQueryTBLMain", 1)
dbqfullp = findTestData("DataForcePop").getValue("dbQueryFullPatient", 1)

dbclntblmain = findTestData("DataForcePop").getValue("dbCleanTableMain", 1)
dbclnfullp = findTestData("DataForcePop").getValue("dbCleanFullPatient", 1)

WebUI.openBrowser('')

WebUI.navigateToUrl(url)
WebUI.setText(findTestObject('Page_Integrations Dashboard/input_User name_UserName (1)'), usr)
WebUI.setEncryptedText(findTestObject('Page_Integrations Dashboard/input_Password_Password (1)'), pwd)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Integrations Dashboard/input (1)'))
WebUI.delay(3)
WebUI.click(findTestObject('Page_Integrations Dashboard/a_Incoming Feeds'))

WebUI.selectOptionByValue(findTestObject('Page_Integrations Dashboard/select_ADTSIUDX            WEB'), '19', true)
WebUI.delay(2)
WebUI.setText(findTestObject('Page_Integrations Dashboard/input_Feeds_interfaceSearchBox'), 'naka')

WebUI.click(findTestObject('Page_Integrations Dashboard/input_Feeds_interfaceSearchBut'))

WebUI.rightClick(findTestObject('Page_Integrations Dashboard/td_604'))
WebUI.delay(3)
WebUI.click(findTestObject('Page_Integrations Dashboard/span_View Interface'))
WebUI.delay(3)

WebUI.rightClick(findTestObject('Page_Integrations Dashboard/td_ADT Demo - Integrations Sup'))

WebUI.delay(3)
WebUI.verifyElementPresent(findTestObject('Page_Integrations Dashboard/span_Send Message'), 0)
WebUI.click(findTestObject('Page_Integrations Dashboard/span_Send Message'))

WebUI.setText(findTestObject('Page_Integrations Dashboard/textarea_(collapse all)_messag'), msg)

WebUI.click(findTestObject('Page_Integrations Dashboard/input_(select message text)_pa'))

WebUI.click(findTestObject('Page_Integrations Dashboard/div_MSH.12 Version ID_thumb'))

WebUI.click(findTestObject('Page_Integrations Dashboard/div_M_thumb'))

WebUI.click(findTestObject('Page_Integrations Dashboard/div_Automation001'))

WebUI.click(findTestObject('Page_Integrations Dashboard/input_(select message text)_se'))

WebUI.click(findTestObject('Page_Integrations Dashboard/div_The message was sent succe'))

WebUI.click(findTestObject('Page_Integrations Dashboard/input_(select message text)_cl'))

WebUI.rightClick(findTestObject('Page_Integrations Dashboard/td_ADT Demo - Integrations Sup'))

WebUI.click(findTestObject('Page_Integrations Dashboard/span_Search Messages'))

WebUI.click(findTestObject('Page_Integrations Dashboard/input_Search Text_searchMessag'))

WebUI.click(findTestObject('Page_Integrations Dashboard/td_Automation001'))

WebUI.click(findTestObject('Page_Integrations Dashboard/div_MSH.12 Version ID_thumb'))

WebUI.click(findTestObject('Page_Integrations Dashboard/div_M_thumb'))

WebUI.click(findTestObject('Page_Integrations Dashboard/div_Automation001'))

WebUI.click(findTestObject('Page_Integrations Dashboard/input_1 (1)'))

WebUI.delay(60)
CustomKeywords.'com.integrationsDB.sqlConnection.connectDB'(dbip, dbport, dbgrp, dbusr, dbpwd)
WebUI.delay(2)
def records
List<String> tempRecords = new ArrayList<String>()
records = CustomKeywords.'com.integrationsDB.sqlConnection.executeQuery'(dbqtblmain)
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

WebUI.delay(3)
CustomKeywords.'com.integrationsDB.sqlConnection.execute'(dbclnfullp)
CustomKeywords.'com.integrationsDB.sqlConnection.execute'(dbclntblmain)
WebUI.delay(3) 

CustomKeywords.'com.integrationsDB.sqlConnection.closeDatabaseConnection'()
WebUI.delay(3)

WebUI.click(findTestObject('Page_Integrations Dashboard/a_Logout (1)'))

WebUI.closeBrowser()

