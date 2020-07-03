# language: es

@Productos
  Característica:seleccionar productos ascedentes y descententes
    Yo como usuario
    Quiero seleccionar productos de adidas
    Para imprimir los descendentes

   Esquema del escenario:Productos descendentes
     Dado  que ingreso al portal web
     Cuando busque la palabra <producto>
     Entonces imprimo los productos de adidas de forma descendente

     Ejemplos:
      |producto|
      | zapato |