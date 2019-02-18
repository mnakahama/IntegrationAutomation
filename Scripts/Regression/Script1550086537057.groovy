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

WebUI.setText(findTestObject('Page_Integrations Dashboard/input_User name_UserName (1)'), 'IM\\maki.nakahama')

WebUI.setEncryptedText(findTestObject('Page_Integrations Dashboard/input_Password_Password (1)'), '98DKvOJKd1c9s3XUDjJJbQ==')

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

WebUI.setText(findTestObject('Page_Integrations Dashboard/textarea_(collapse all)_messag'), 'MSH|^~&|CSAF|B|CSAF|B|20060517075248||ADT^A08|12345|P|2.3|||||||\nEVN|A04|20060517075245||||20060517075245\nPID||0001149304|06368761||TESTING^DONE^M^^^^^||19450714|M||1|123 TEST DR^APT 1^ATLANTA^GA^30028^||7704443333~7704442222|7701234567|E|M|^|Automation001|123456789|||||||||AMERICAN||\nACC|200905131100|4||SCARY||||PIECE OF METAL HIT HEAD\nPV1||S|HTT^R1^B2^F4||||0878^FUNG^WAYNE^E^JR^MR^DR^.PACIFIC OPTHAL CONS|0878^FUNG^WAYNE^E^JR^MR^DR^|0878^FUNG^WAYNE^E^JR^MR^DR^|CSAF|||||||0878^FUNG^WAYNE^E^JR^MR^DR^|INPATIENT||S||||||||||||||||D-DISPO|D-LOC||CSAF|||||20120717133000||\nPV2|||||||||200907131100|9|10|\nZ11||BY VISITS|19980126||ST MARY COLLEGE||||1|\nZOR|HEALTHET|800|9777282|\nZMC|||19980126\nZP1|INGENIOUS MED|5660 NEW NORTHSIDE DR|UNIT 1|ATLANTA|GA|30326|TECH SUPPORT|\nGT1|1|01354352|REAMER^MICHAEL^OWEN^""^||15370 SE KENSINGTON DR^UNIT A^CLACKAMAS^OR^97015|(503)997-2474~(503)997-2475|(503)255-5999|19740515|M||4|542-94-3941||||NUPRECON|500 WORK DR^UNIT B^CLACKAMAS^OR^97015|(503)255-6000|||||||||||||||||||||||||||||||TECH SUPPORT|\nGT1|2|01354352|REAMER^TEST^GRN^""^||15370 SE KENSINGTON DR^UNIT A^CLACKAMAS^OR^97015|(503)997-2474~(503)997-2475|(503)255-5999|19740515|M||4|542-94-1111||||NUPRECON|500 WORK DR^UNIT B^CLACKAMAS^OR^97015|(503)255-6000|||||||||||||||||||||||||||||||TECH SUPPORT|\nPD1||||00252^FUNG^WAYNE^E^^|\nZTP||||||\nIN1|1|0369|2229|HEALTH CARE SAVINGS|4530 PARK RD  SUITE 110^BLD 1^CHARLOTTE^NC^28209^USA^MAIN||(800)892-1893|5276|InsuranceGroup|||||A123456|IC123|STAINBACK^NICHOLAS^W|01^Patient is Insured|19820413|157 THORPE STREET^BUILDING B^HENDERSON^NC^27536^USA^^^091|||1||||||PA123||||||||241537100||||||1^Employed full time|M|566 RUIN CREEK RD^ABC^HENDERSON^NC^27536^USA^^^091\nIN2||123456789|INGENIOUS MED||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||(770)765-4321|(404)765-3333\nFT1|1|||20091002|||||||||||||||253.6^SIADH central~253.7^TEST central||||||99238^D/C: Inpt D/C-low (<30min)||\nNK1|1|TEST^JOSEPH2^M^^^^^|F|123 TEST DR^APT 1^ATLANTA^GA^30028^|(503)255-1234|(503)255-1000||\nNK1|2|TEST^JOSEPH1^M^^^^^|F|123 TEST DR^APT 1^ATLANTA^GA^30028^|(503)255-1234|(503)255-1000||\nZED|||||4159233007|80878|37|4159233007|WEF||||\n')

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

WebUI.click(findTestObject('Page_Integrations Dashboard/a_Logout (1)'))

WebUI.closeBrowser()

