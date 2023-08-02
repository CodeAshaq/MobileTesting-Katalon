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

Mobile.startApplication('E:\\CODING.ID\\Katalonstudio\\Android-MyDemoAppRN.1.2.0.build-231.apk', true)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.TextView - Add To Cart'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.ImageView (1)'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.TextView - Proceed To Checkout'), 0)

Mobile.setText(findTestObject('Object Repository/Payment/android.widget.EditText'), 'bob@example.com', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Payment/android.widget.EditText (1)'), 'dbXIBZ66cuht4KTRMDozZw==', 
    0)

Mobile.tapAndHold(findTestObject('Object Repository/Payment/android.widget.TextView - Login'), 0, 0)

Mobile.setText(findTestObject('Object Repository/Payment/android.widget.EditText - Rebecca Winter'), 'REbecca', 0)

Mobile.setText(findTestObject('Object Repository/Payment/android.widget.EditText - Mandorley 112'), 'balaraa', 0)

Mobile.setText(findTestObject('Object Repository/Payment/android.widget.EditText - Entrance 1'), 'kak', 0)

Mobile.setText(findTestObject('Object Repository/Payment/android.widget.EditText - Truro'), 'lolo', 0)

Mobile.setText(findTestObject('Object Repository/Payment/android.widget.EditText - Cornwall'), 'yoyo', 0)

Mobile.setText(findTestObject('Object Repository/Payment/android.widget.EditText - 89750'), '10293', 0)

Mobile.setText(findTestObject('Object Repository/Payment/android.widget.EditText - United Kingdom'), 'Nigeria', 0)

Mobile.tapAndHold(findTestObject('Object Repository/Payment/android.widget.TextView - To Payment'), 0, 0)

Mobile.setText(findTestObject('Object Repository/Payment/android.widget.EditText - Rebecca Winter (1)'), 'Hanif', 0)

Mobile.setText(findTestObject('Object Repository/Payment/android.widget.EditText - 3258 1265 7568 789'), '91992992929129', 
    0)

Mobile.setText(findTestObject('Object Repository/Payment/android.widget.EditText - 0325'), '08/09', 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.EditText - 0809'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Payment/android.widget.EditText - 123'), '1231', 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.TextView - Review Order'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.TextView - Place Order'), 0)

Mobile.closeApplication()

