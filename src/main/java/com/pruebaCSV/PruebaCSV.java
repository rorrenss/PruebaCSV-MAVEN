package com.pruebaCSV;
/*Ejemplo muy sencillo de acceso a un fichero CSV con datos de pokemon,
no utiliza ningún gestor de dependencias*/


public class PruebaCSV {

    public static void main(String[] args) {
        LectorCSV miLector = new LectorCSV();
        miLector.leeCSV("src/main/resources/datos/pokemon/pokemon.csv");
    }



}
