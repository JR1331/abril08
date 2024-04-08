package com.softtek.modelo;

public class Barcaza extends Vehiculo implements Nautico{
    public String atracar(){
        return "La barcaza atraca";
    }

    public String navegar(){
        return "La barcaza nageva";
    }
}
