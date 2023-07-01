package com.introduccion.entradasysalidas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio {
    public static void main(String[] args) {
        cadenaReves("Hola Mundo"); //1
        arrUni(); //1
        arrBidi();//2
        arrVector(); //3
        arrayList(); //5
        bucleArrayList(); //6

        try{
            System.out.println("El resultado es: " + dividePorCero(20,0));
        }catch (ArithmeticException e){
            System.out.println(e.getClass());
        }finally {
            System.out.println("Demo de código");
        }
    }

    //1. Código que devuelva cadena al revés
    public static void cadenaReves(String cadena){
        String invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--){
            invertida += cadena.charAt(i);
        }
        System.out.println(invertida);

    }

    //1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    public static void arrUni(){
        String[] arrAnimals = {"Pato", "Perro", "Gato", "Serpiente"};
        for (int i = 0; i<arrAnimals.length; i++){
            System.out.println(arrAnimals[i]);
        }
    }

    //2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
    public static void arrBidi(){
        String[][] arrBidi = {{"Perro", "Gato", "Ave", "Pez"},
                               {"Pera", "Uva", "Manzana"}};
        for (int i = 0; i < arrBidi.length; i++){
            for (int j = 0; j < arrBidi[i].length; j++){
                System.out.println("Posición: " + i + " " + j + " es: " + arrBidi[i][j]);
            }

        }
    }

    //4. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
    public static void arrVector(){
        Vector<String> nombres = new Vector<>();
        nombres.add("Laura");
        nombres.add("Ines");
        nombres.add("Eduardo");
        nombres.add("Navarro");
        nombres.add("Aliss");

        nombres.remove(2);
        nombres.remove(1);

        System.out.println(nombres.toString());
    }

    //5, Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
    public static void arrayList(){
        ArrayList<String>elementos = new ArrayList<>();
        elementos.add("Agua");
        elementos.add("Tierra");
        elementos.add("Aire");
        elementos.add("Fuego");

        LinkedList<String>elementosLinked = new LinkedList<>(elementos);
        for (String elemento: elementosLinked){
            System.out.println(elemento);
        }
    }

    /**
     * 6 Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
     * A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último,
     * vuelve a recorrerlo y muestra el ArrayList final.
     * Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
     */
    public static void bucleArrayList(){
        ArrayList<Integer>numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            numeros.add(i);
        }

        for (int i = 0; i < numeros.size(); i++){
            if (numeros.get(i) %2 == 0){
                numeros.remove(i);
            }
        }

        for (Integer numero : numeros){
            System.out.println("ArrayList definitivo: " + numero);
        }
    }


    //7. Crea una función DividePorCero.
    // Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
    // que será capturada por su llamante (desde "main", por ejemplo).
    // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
    // Finalmente, mostraremos en cualquier caso: "Demo de código".
    public static int dividePorCero(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Esto no puede hacerse");
        }
        return a/b;
    }
}
