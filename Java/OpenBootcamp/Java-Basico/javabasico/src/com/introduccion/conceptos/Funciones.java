package com.introduccion;

public class Funciones {
    public static void main(String[] args) {
        /* Escribo la función aquí sin necesidad de que esté creada, luego le doy click derecho y
        me da la opción de crear el método */
        // En POO se llama métodos a las funciones
        holaMundo();
        String saludo = devolverSaludo();
        System.out.println(saludo);
        holaMundoConParametros("mundo desde Java con parámetros");
    }

    private static void holaMundoConParametros(String pTexto) {
        System.out.println("Hola " + pTexto);
    }

    private static void holaMundo() {
        System.out.println("Hola Mundo desde JAVA");
    }

    public static void holaMundoPublic(){
        System.out.println("Hola Mundo desde Java Función Pública");
    }

    //Se puede acceder desde la misma clase o paquete
    protected static void holaMundoProtected(){
        System.out.println("Hola mundo desde Java pero con función Protected");
    }

    //private > se puede invocar solo dentro de la clase
    //public > se puede invocar desde fuera de la clase
    //protected > se puede invocar desde la clase o en el mismo paquete
    private static String devolverSaludo(){
        //Si no tiene void retorna valor, hay que especificar el tipo de datos del return antes del nombre
        return "Hola Mundo desde Java con Return";

    }
}
