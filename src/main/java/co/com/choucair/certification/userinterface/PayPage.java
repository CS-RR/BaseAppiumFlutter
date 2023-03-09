package co.com.choucair.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PayPage {

    public static final Target button_pay = Target.the("Button Pay")
            .located(By.id("makePaymentButton"));
}
