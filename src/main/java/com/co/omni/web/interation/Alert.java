package com.co.omni.web.interation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Alert implements Interaction {

    @Override
    @Step("{0} aceptar alerta continuar")
    public <T extends Actor> void performAs(T actor) {
        WebDriver webDriver = getProxiedDriver();
        BrowseTheWeb.as(actor).withDriver(webDriver).waitFor(ExpectedConditions.alertIsPresent());
        BrowseTheWeb.as(actor).withDriver(webDriver).getAlert().accept();
    }

    public static Interaction aceptar() {
        return Tasks.instrumented(Alert.class);
    }
}
