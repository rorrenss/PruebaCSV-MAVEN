package com.pruebaCSV;

public class Pokemon  {
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeedAttack() {
        return speedAttack;
    }

    public void setSpeedAttack(int speedAttack) {
        this.speedAttack = speedAttack;
    }

    public int getSpeedDefense() {
        return speedDefense;
    }

    public void setSpeedDefense(int speedDefense) {
        this.speedDefense = speedDefense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public boolean isLegendary() {
        return legendary;
    }

    public void setLegendary(boolean legendary) {
        this.legendary = legendary;
    }

    //#,Name,Type 1,Type 2,Total,HP,Attack,Defense,Sp. Atk,Sp. Def,Speed,Generation,Legendary
    private int numero;
    private String name, tipo1, tipo2;
    private int total, hp, attack, defense, speedAttack, speedDefense, speed, generation;
    private boolean legendary;

    public Pokemon (String[] fila){
// #,Name,Type 1,Type 2,Total,HP,Attack,Defense,Sp. Atk,Sp. Def,Speed,Generation,Legendary
        this.setNumero(Integer.parseInt(fila[0]));
        this.setName(fila[1]);
        this.setTipo1(fila[2]);
        this.setTipo2(fila[3]);
        this.setTotal(Integer.parseInt(fila[4]));
        this.setHp(Integer.parseInt(fila[5]));
        this.setAttack(Integer.parseInt(fila[6]));
        this.setDefense(Integer.parseInt(fila[7]));
        this.setSpeedAttack(Integer.parseInt(fila[8]));
        this.setSpeedDefense(Integer.parseInt(fila[9]));
        this.setSpeed(Integer.parseInt(fila[10]));
        this.setGeneration(Integer.parseInt(fila[11]));
        this.setLegendary(Boolean.parseBoolean(fila[12]));
    }
}
