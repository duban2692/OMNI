package com.co.omni.web.task;

import com.co.omni.web.userInterface.UrlInicioWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class InicioWeb implements Task {

    private UrlInicioWeb urlHome;

    public InicioWeb(UrlInicioWeb urlHome) {

        this.urlHome = urlHome;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.url(urlHome.Url())
        );
    }

    public static Performable url(UrlInicioWeb urlHome) {
        return Tasks.instrumented(InicioWeb.class, urlHome);
    }
}
