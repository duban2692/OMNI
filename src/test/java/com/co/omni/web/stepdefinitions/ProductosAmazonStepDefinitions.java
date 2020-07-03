package com.co.omni.web.stepdefinitions;

import com.co.omni.web.task.BusquedaProducto;
import com.co.omni.web.task.InicioWeb;
import com.co.omni.web.userInterface.UrlInicioWeb;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ProductosAmazonStepDefinitions {

    @Before
    public void prepaStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("^que ingreso al portal web$")
    public void queIngresoAlPortalWeb() {
        theActorCalled("Duban").attemptsTo(InicioWeb.url(UrlInicioWeb.UrlInicioWeb));
    }

    @Cuando("^busque la palabra (.*)$")
    public void busqueLaPalabra(String producto) {

        theActorInTheSpotlight().attemptsTo(BusquedaProducto.busqueda(producto));

    }

    @Entonces("^imprimo los productos de adidas de forma descendente$")
    public void imprimoLosProductosDeAdidasDeFormaDescendente() {
        // Write code here that turns the phrase above into concrete actions

    }
}
