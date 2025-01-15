package com.pruebaCSV;
/*
   Ejemplo muy sencillo de acceso a un archivo .csv desde java
   Utiliza Maven.
   Y ahora trabaja con los pokemon en una clase nueva
 */

import java.util.Scanner;

public class PruebaCSV {
    /**
     * @author Jorge Cisneros
     */

    public static void main(String[] args) {
        //LectorCSV miLector = new LectorCSV();
        //miLector.leeCSV("./src/main/resources/datos/pokemon.csv");
        ListaPokemon miLista = new ListaPokemon("./src/main/resources/datos/pokemon.csv");
        int seleccion = -1;
        Scanner sc = new Scanner(System.in);
        while (seleccion != 0) {
            System.out.println("¿que quieres hacer con los pokémon? \n 0-Salir \n 1-Buscar por tipo \n 2-Buscar por nombre ");
            System.out.println(" 3-Buscar por salud \n 4-Busca por nombre Full info \n 5-Listar todos los pokemon");
            if (sc.hasNextInt()) {
                seleccion = sc.nextInt();
            }
            switch (seleccion) {
                case 1:miLista.listaPorTipo();break;
                case 2:miLista.listaPorNombre();break;
                case 3:miLista.listaPorSalud();break;
                case 4:miLista.listaPorNombreUnoSolo();break;
                case 5:miLista.listaTodos();break;
                default:
            }
        }
        System.out.println("Adios!");

    }


}
