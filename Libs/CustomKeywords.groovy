
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject


def static "test.dragDrop"(
    	String source	
     , 	String destination	) {
    (new test()).dragDrop(
        	source
         , 	destination)
}

def static "com.at.util.ScreenShotCustome.takeWebElementScreenshot"(
    	TestObject object	) {
    (new com.at.util.ScreenShotCustome()).takeWebElementScreenshot(
        	object)
}

def static "com.at.util.ScreenShotCustome.compareimages"(
    	TestObject object	) {
    (new com.at.util.ScreenShotCustome()).compareimages(
        	object)
}

def static "samanta.util.checkbox.CheckBoxHandler.selectCheckBox"(
    	TestObject testObject	) {
    (new samanta.util.checkbox.CheckBoxHandler()).selectCheckBox(
        	testObject)
}

def static "com.sikuli.Sikuli.sendKey"(
    	String label	) {
    (new com.sikuli.Sikuli()).sendKey(
        	label)
}

def static "com.sikuli.Sikuli.click"(
    	String region	) {
    (new com.sikuli.Sikuli()).click(
        	region)
}

def static "com.sikuli.Sikuli.doubleClick"(
    	String region	) {
    (new com.sikuli.Sikuli()).doubleClick(
        	region)
}

def static "com.util.TakeScreenshot.takeScreenshotOfWebPage"(
    	String fileName	) {
    (new com.util.TakeScreenshot()).takeScreenshotOfWebPage(
        	fileName)
}
