import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

		import io.appium.java_client.ios.IOSDriver;

		import io.appium.java_client.remote.MobileCapabilityType;

		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.remote.DesiredCapabilities;
		import org.openqa.selenium.remote.RemoteWebElement;


		import io.appium.java_client.AppiumDriver;
		import io.appium.java_client.MobileElement;
		import io.appium.java_client.ios.IOSDriver;
		import io.appium.java_client.ios.IOSElement;
		import io.appium.java_client.remote.AutomationName;
		import io.appium.java_client.remote.HideKeyboardStrategy;
		import io.appium.java_client.remote.MobileCapabilityType;

public class iOsTest {
			
			public static void main(String[] args) throws MalformedURLException, InterruptedException
			{
				File app = new File("src/BabyMonitor.app");

				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1");
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
				capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
				capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
				IOSDriver<IOSElement>driver = new IOSDriver<>(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);
				Thread.sleep(5000);
				
				driver.findElementByName("Next").click();
				driver.findElementByName("Set up Baby Monitor").click();
				driver.findElementByName("Parent").click();
				driver.findElementByName("Done!").click();
				Thread.sleep(3000);
				driver.findElementByName("Continue").click();
				driver.findElementByName("Get started").click();
				driver.findElementByXPath("//XCUIElementTypeImage[@name=\'oval\']/XCUIElementTypeButton").click();;
				driver.findElementByXPath("//XCUIElementTypeSheet[@name='Choose image source']/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]").click() ;
				Thread.sleep(4000);
				driver.findElementByXPath("//XCUIElementTypeCell[@name='Camera Roll']").click();
				Thread.sleep(2000);
				driver.findElementByXPath("//XCUIElementTypeCell[@name=\'Photo, Landscape, August 08, 2012, 11:55 PM\']").click();
				Thread.sleep(2000);
				driver.findElementByXPath("//XCUIElementTypeApplication[@name='BabyMonitor']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField").clear();
				driver.findElementByXPath("//XCUIElementTypeApplication[@name='BabyMonitor']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField").sendKeys("Lil Kiddo");
				driver.hideKeyboard();
				driver.findElementByName("video").click();
				Thread.sleep(2000);
				driver.findElementByName("Cancel").click();
				Thread.sleep(1000);
				driver.findElementByXPath("//XCUIElementTypeApplication[@name='BabyMonitor']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeButton[2]").click();
				driver.findElementByName("arrowDown").click();
				Thread.sleep(2000);
				driver.findElementByName("arrowUp").click();
				Thread.sleep(2000);
				driver.findElementByXPath("//XCUIElementTypeApplication[@name='BabyMonitor']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeButton[3]").click();
				Thread.sleep(2000);
				driver.quit();
			

			}
		}
