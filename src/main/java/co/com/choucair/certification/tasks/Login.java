package co.com.choucair.certification.tasks;

import co.com.choucair.certification.model.EriBankDatos;
import co.com.choucair.certification.userinterface.EriBankLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {

    private List<EriBankDatos> eriBankDatosList;

    public Login(List<EriBankDatos> eriBankDatosList) {
        this.eriBankDatosList = eriBankDatosList;
    }

    public static Login toThe(List<EriBankDatos> eriBankDatosList) {
        return Tasks.instrumented(Login.class, eriBankDatosList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(eriBankDatosList.get(0).getUsername()).into(EriBankLoginPage.user_box),
                Enter.theValue(eriBankDatosList.get(0).getPassword()).into(EriBankLoginPage.password_box),
                Click.on(EriBankLoginPage.button_login)
        );
    }
}
