package tutorialPackage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class findSets extends tutorialClass {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.findElementById("com.puntopago.puntopagoapp:id/searchView").setValue("12345");
    }
}
