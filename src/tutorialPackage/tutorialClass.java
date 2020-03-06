package tutorialPackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.File;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class tutorialClass {
    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Nexus");
        caps.setCapability("udid", "013a3912c1d9adf1");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "7.1.2");
        caps.setCapability("appPackage", "com.puntopago.puntopagoapp");
        caps.setCapability("appActivity", "com.puntopago.puntopagoapp.view.activity_main.MainActivity");
        caps.setCapability("noReset", "true");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);

        return driver;
    }
}