package co.com.choucair.certification.stepdefinitions;

import co.com.choucair.certification.model.FlutterDatos;
import co.com.choucair.certification.tasks.Loginflutter;
import com.testsigma.flutter.FlutterFinder;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class TestFlutterUnoStepDefinitions {

    private AndroidDriver driver;
    private FlutterFinder find;
    @Before
    public void setStage() throws MalformedURLException, InterruptedException {
        OnStage.setTheStage((new OnlineCast()));
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Flutter");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SDJ7N18C06000676");
        caps.setCapability(MobileCapabilityType.NO_RESET, true);
        caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\creyesr\\Documents\\Proyectos Android\\Tutorial_Flutter_Appium\\src\\test\\resources\\app\\flutterlogin-debug.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        find = new FlutterFinder(driver);
        Thread.sleep(2000);
    }
    @Given("^Laura se autentica en su app$")
    public void lauraSeAutenticaEnSuApp(List<FlutterDatos> flutterDatosList) {
        OnStage.theActorCalled("Laura").attemptsTo(Loginflutter.toThe(flutterDatosList));
    }

}
