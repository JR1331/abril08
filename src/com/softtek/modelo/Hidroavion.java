package com.softtek.modelo;

public class Hidroavion extends Avion implements Nautico{

    public String atracar(){
        return "El hidroavion atraca";
    }

    public String navegar(){
        return "El hidroavion navega";
    }
}
