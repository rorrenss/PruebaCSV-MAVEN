package com.pruebaCSV;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.*;

public class ListaPokemon extends ArrayList<Pokemon> {

    public ListaPokemon(String nombreArchivo){
        try {
            CSVReader csvReader = new CSVReader( new FileReader(nombreArchivo));
            String[] fila;
            fila = csvReader.readNext(); //leo una vez para quitar la fila de los títulos del csv
            while((fila = csvReader.readNext()) != null){
                Pokemon miPokemon = new Pokemon(fila);
                this.add(miPokemon); //añado el pokemon que he creado y rellenado a la lista
            }
            csvReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void listaTodos(){
        //for (Pokemon p: this) {
        //    System.out.println(p.getName());
        //}
        this.forEach((p) -> System.out.println(p.getName()));
    }

    public void listaPorTipo(){
        System.out.println("Introduce el tipo de pokemon: ");
        Scanner sc = new Scanner(System.in);
        String tipo = sc.nextLine();
        this.forEach((p) ->
        {
            if ( p.getTipo1().equalsIgnoreCase(tipo) || p.getTipo2().equalsIgnoreCase(tipo)){
                System.out.println(p.getName());
            }
        });
    }
    public void listaPorNombre(){
        System.out.println("Introduce el nombre de pokemon: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        this.forEach((p) ->
        {
            if ( p.getName().equalsIgnoreCase(nombre)){
                System.out.println(p.getName());
            }
        });
    }
    public void listaPorNombreUnoSolo(){
        System.out.println("Introduce el nombre de pokemon: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        for (int i=0; i < this.size(); i++){
            if ( this.get(i).getName().equalsIgnoreCase(nombre)){
                System.out.println( this.get(i).getName() + " " + this.get(i).getTipo1() + " ...");
                //etc. Yo esto lo pondría como método
                // en la clase Pokemon
                break; //para que no siga leyendo
            }
        }
    }
    public void listaPorSalud(){
        //este tiene un poco más de chicha. Hay que crear una estructura auxiliar donde guardar los pokemon
        //que tengan más salud que la indicada. Luego hay que ordenarla
        ArrayList <Integer> listaSalud = new ArrayList<>();
        System.out.println("Introduce la salud máxima de pokemon que quieres buscar: ");
        Scanner sc = new Scanner(System.in);
        int salud = sc.nextInt();
        this.forEach((p) ->
        {
            if ( p.getHp() < salud){
                listaSalud.add(p.getHp());
            }
        });
        //después del foreach están en el arraylist nuevo todos los pokemon con salud menor que la introducida.
        //lo ordenamos
        Collections.sort(listaSalud);
        System.out.println(listaSalud.toString());
    }

}
