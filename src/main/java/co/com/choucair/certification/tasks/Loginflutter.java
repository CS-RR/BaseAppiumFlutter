package co.com.choucair.certification.tasks;

import co.com.choucair.certification.model.FlutterDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class Loginflutter implements Task {

    private List<FlutterDatos> flutterDatosList;

    public Loginflutter(List<FlutterDatos> flutterDatosList) {
        this.flutterDatosList = flutterDatosList;
    }

    public static Loginflutter toThe(List<FlutterDatos> flutterDatosList) {
        return Tasks.instrumented(Loginflutter.class, flutterDatosList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
