package co.com.choucair.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EriBankLoginPage {

    public static final Target user_box = Target.the("Input username")
            .located(By.id("usernameTextField"));
    public static final Target password_box = Target.the("Input Password")
            .located(By.id("passwordTextField"));
    public static final Target button_login = Target.the("Button login")
            .located(By.id("loginButton"));
}
