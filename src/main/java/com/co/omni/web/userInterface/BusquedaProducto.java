package com.co.omni.web.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusquedaProducto {

    public  static  final Target TXT_PRODUCTO = Target.the("Filtro de búsqueda de producto").located(By.id("twotabsearchtextbox"));
}
