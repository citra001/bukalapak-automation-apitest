import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.URL;

public class tc001_register {
    public static void main(String args[]){
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.google.android.apps.nexuslauncher");
        dc.setCapability("appActivity", ".NexusLauncherActivity");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);

        MobileElement el2 = (MobileElement) ad.findElementById("com.loginmodule.learning:id/textViewLinkRegister");
        el2.click();
        MobileElement el3 = (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el3.sendKeys("citra");
        MobileElement el4 = (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el4.sendKeys("citra@mail.com");
        MobileElement el5 = (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el5.sendKeys("citra123");
        MobileElement el6 = (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el6.sendKeys("citra123");
        MobileElement el7 = (MobileElement) ad.findElementById("com.loginmodule.learning:id/appCompatButtonRegister");
        el7.click();

        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextName").getText(), "citra");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail").getText(), "citra@mail.com");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword").getText(), "citra123");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword").getText(), "citra123");

        //clear text
        MobileElement el101=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el101.clear();
        MobileElement el102=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el102.clear();
        MobileElement el103=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el103.clear();
        MobileElement el104=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el104.clear();


        //Negative case 01
        MobileElement el8=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textViewLinkRegister");
        el8.click();
        MobileElement el9= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el9.sendKeys("");
        MobileElement el10=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el10.sendKeys("citra@mail.com");
        MobileElement el11 =(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el11.sendKeys("citra123");
        MobileElement el12  =(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el12.sendKeys("citra123");
        MobileElement el13 = (MobileElement) ad.findElementById("com.loginmodule.learning:id/appCompatButtonRegister");
        el13.click();

        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextName").getText(), "citra");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail").getText(), "citra@mail.com");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword").getText(), "citra123");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword").getText(), "citra123");

        //clear text
        MobileElement el105=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el105.clear();
        MobileElement el106=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el106.clear();
        MobileElement el107=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el107.clear();
        MobileElement el108=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el108.clear();




        //Negative case 02
        MobileElement el14= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textViewLinkRegister");
        el14.click();
        MobileElement el01 =(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
       el01.sendKeys("citra");
        MobileElement el15= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el15.sendKeys("");
        MobileElement el16= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el16.sendKeys("citra123");
        MobileElement el17=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
       el17.sendKeys("citra123");
        MobileElement el18= (MobileElement) ad.findElementById("com.loginmodule.learning:id/appCompatButtonRegister");
        el18.click();

        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextName").getText(), "citra");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail").getText(), "citra@mail.com");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword").getText(), "citra123");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword").getText(), "citra123");


        //clear text
        MobileElement el109=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el109.clear();
        MobileElement el110=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el110.clear();
        MobileElement el111=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el111.clear();
        MobileElement el112=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el112.clear();


        //Negative case 03
        MobileElement el19= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textViewLinkRegister");
        el19.click();
        MobileElement el20= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el20.sendKeys("citra");
        MobileElement el21= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el21.sendKeys("citra@mail.com");
        MobileElement el22= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el22.sendKeys("");
        MobileElement el23= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el23.sendKeys("citra123");
        MobileElement el24= (MobileElement) ad.findElementById("com.loginmodule.learning:id/appCompatButtonRegister");
        el24.click();

        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextName").getText(), "citra");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail").getText(), "citra@mail.com");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword").getText(), "citra123");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword").getText(), "citra123");

        //clear text
        MobileElement el113=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el113.clear();
        MobileElement el114=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el114.clear();
        MobileElement el115=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el115.clear();
        MobileElement el116=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el116.clear();


        //Negative case 04
        MobileElement el25= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textViewLinkRegister");
        el25.click();
        MobileElement el26= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el26.sendKeys("citra");
        MobileElement el27= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el27.sendKeys("citra@mail.com");
        MobileElement el28= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el28.sendKeys("citra123");
        MobileElement el29= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el29.sendKeys("");
        MobileElement el30= (MobileElement) ad.findElementById("com.loginmodule.learning:id/appCompatButtonRegister");
        el30.click();

        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextName").getText(), "citra");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail").getText(), "citra@mail.com");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword").getText(), "citra123");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword").getText(), "citra123");

        //clear text
        MobileElement el117=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el117.clear();
        MobileElement el118=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el118.clear();
        MobileElement el119=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el119.clear();
        MobileElement el120=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el120.clear();


        //Negative case 05
        MobileElement el31= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textViewLinkRegister");
        el31.click();
        MobileElement el32= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el32.sendKeys("");
        MobileElement el33= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el33.sendKeys("");
        MobileElement el34= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el34.sendKeys("citra123");
        MobileElement el35= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el35.sendKeys("citra123");
        MobileElement el36= (MobileElement) ad.findElementById("com.loginmodule.learning:id/appCompatButtonRegister");
        el36.click();

        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextName").getText(), "citra");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail").getText(), "citra@mail.com");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword").getText(), "citra123");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword").getText(), "citra123");

        //clear text
        MobileElement el121=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el121.clear();
        MobileElement el122=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el122.clear();
        MobileElement el123=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el123.clear();
        MobileElement el124=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el124.clear();



        //Negative case 06
        MobileElement el37= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textViewLinkRegister");
        el37.click();
        MobileElement el38= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el38.sendKeys("");
        MobileElement el39= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el39.sendKeys("");
        MobileElement el88=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el88.sendKeys("");
        MobileElement el40=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el40.sendKeys("citra123");
        MobileElement el41= (MobileElement) ad.findElementById("com.loginmodule.learning:id/appCompatButtonRegister");
        el41.click();

        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextName").getText(), "citra");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail").getText(), "citra@mail.com");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword").getText(), "citra123");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword").getText(), "citra123");

        //clear text
        MobileElement el125=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el125.clear();
        MobileElement el126=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el126.clear();
        MobileElement el127=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el127.clear();
        MobileElement el128=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el128.clear();

        //Negative case 07
        MobileElement el42= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textViewLinkRegister");
        el42.click();
        MobileElement el43= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el43.sendKeys("");
        MobileElement el44= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el44.sendKeys("");
        MobileElement el45= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el45.sendKeys("");
        MobileElement el46= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el46.sendKeys("");
        MobileElement el47= (MobileElement) ad.findElementById("com.loginmodule.learning:id/appCompatButtonRegister");
        el47.click();

        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextName").getText(), "citra");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail").getText(), "citra@mail.com");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword").getText(), "citra123");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword").getText(), "citra123");

        //clear text
        MobileElement el129=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el129.clear();
        MobileElement el130=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el130.clear();
        MobileElement el131=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el131.clear();
        MobileElement el132=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el132.clear();


        //Negative case 08
        MobileElement el48= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textViewLinkRegister");
        el48.click();
        MobileElement el49= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el49.sendKeys("citra");
        MobileElement el50= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el50.sendKeys("citra@mail.com");
        MobileElement el51= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el51.sendKeys("");
        MobileElement el52= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el52.sendKeys("");
        MobileElement el53=(MobileElement) ad.findElementById("com.loginmodule.learning:id/appCompatButtonRegister");
        el53.click();

        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextName").getText(), "citra");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail").getText(), "citra@mail.com");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword").getText(), "citra123");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword").getText(), "citra123");

        //clear text
        MobileElement el133=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el133.clear();
        MobileElement el134=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el134.clear();
        MobileElement el135=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el135.clear();
        MobileElement el136=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el136.clear();


        //Negative case 09
        MobileElement el54= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textViewLinkRegister");
        el54.click();
        MobileElement el55= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el55.sendKeys("citra");
        MobileElement el56= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el56.sendKeys("");
        MobileElement el57= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el57.sendKeys("");
        MobileElement el58= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el58.sendKeys("citra123");
        MobileElement el59= (MobileElement) ad.findElementById("com.loginmodule.learning:id/appCompatButtonRegister");
        el59.click();

        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextName").getText(), "citra");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail").getText(), "citra@mail.com");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword").getText(), "citra123");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword").getText(), "citra123");

        //clear text
        MobileElement el137=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el137.clear();
        MobileElement el138=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el138.clear();
        MobileElement el139=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el139.clear();
        MobileElement el140=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el140.clear();


        //Negative case 10
        MobileElement el60= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textViewLinkRegister");
        el60.click();
        MobileElement el61= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el61.sendKeys("");
        MobileElement el62= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el62.sendKeys("citra@mail.com");
        MobileElement el63= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el63.sendKeys("");
        MobileElement el64= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el64.sendKeys("citra123");
        MobileElement el65= (MobileElement) ad.findElementById("com.loginmodule.learning:id/appCompatButtonRegister");
        el65.click();

        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextName").getText(), "citra");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail").getText(), "citra@mail.com");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword").getText(), "citra123");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword").getText(), "citra123");

        //clear text
        MobileElement el141=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el141.clear();
        MobileElement el142=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el142.clear();
        MobileElement el143=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el143.clear();
        MobileElement el144=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el144.clear();

        //Negative case 11
        MobileElement el66= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textViewLinkRegister");
        el66.click();
        MobileElement el67= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el67.sendKeys("");
        MobileElement el68= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el68.sendKeys("");
        MobileElement el69= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el69.sendKeys("citra123");
        MobileElement el70= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el70.sendKeys("citra123");
        MobileElement el71= (MobileElement) ad.findElementById("com.loginmodule.learning:id/appCompatButtonRegister");
        el71.click();

        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextName").getText(), "citra");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail").getText(), "citra@mail.com");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword").getText(), "citra123");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword").getText(), "citra123");

        //clear text
        MobileElement el145=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el145.clear();
        MobileElement el146=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el146.clear();
        MobileElement el147=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el147.clear();
        MobileElement el148=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el148.clear();

        //Negative case 12
        MobileElement el72= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textViewLinkRegister");
        el72.click();
        MobileElement el73= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el73.sendKeys("citra");
        MobileElement el74= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el74.sendKeys("citra@mail.com");
        MobileElement el75= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el75.sendKeys("citra123");
        MobileElement el76=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el76.sendKeys("citra124");
        MobileElement el77= (MobileElement) ad.findElementById("com.loginmodule.learning:id/appCompatButtonRegister");
        el77.click();

        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextName").getText(), "citra");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail").getText(), "citra@mail.com");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword").getText(), "citra123");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword").getText(), "citra123");

        //clear text
        MobileElement el149=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el149.clear();
        MobileElement el150=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el150.clear();
        MobileElement el151=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el151.clear();
        MobileElement el152=(MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el152.clear();

        //Negative case 13
        MobileElement el78= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textViewLinkRegister");
        el78.click();
        MobileElement el79= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el79.sendKeys("citra");
        MobileElement el80= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el80.sendKeys("citrasekar");
        MobileElement el81= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el81.sendKeys("citra123");
        MobileElement el82= (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el82.sendKeys("citra123");
        MobileElement el83= (MobileElement) ad.findElementById("com.loginmodule.learning:id/appCompatButtonRegister");
        el83.click();

        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextName").getText(), "citra");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail").getText(), "citra@mail.com");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword").getText(), "citra123");
        Assert.assertEquals(ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword").getText(), "citra123");
    }

}
