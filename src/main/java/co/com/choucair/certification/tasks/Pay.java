package co.com.choucair.certification.tasks;


import co.com.choucair.certification.userinterface.PayPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Pay implements Task {
    public static Pay money() {
        return Tasks.instrumented(Pay.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PayPage.button_pay)
        );
    }
}
