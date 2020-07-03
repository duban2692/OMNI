package com.co.omni.web.task;

import com.co.omni.web.interation.Alert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;

import static com.co.omni.web.interation.Alert;

import static com.co.omni.web.userInterface.BusquedaProducto.*;

public class BusquedaProducto implements Task {

    private String producto;

    public BusquedaProducto(String producto) {
        this.producto = producto;
    }

    @Override
    @Step("{} Dar click en el producto")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Alert.aceptar(),
                Click.on(TXT_PRODUCTO),
                Click.on(TXT_PRODUCTO.of(producto)));
    }

    public static Performable busqueda(String producto) {
        return Tasks.instrumented(BusquedaProducto.class,producto);
    }
}
