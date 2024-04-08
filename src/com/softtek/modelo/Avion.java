package com.softtek.modelo;

public class Avion extends Vehiculo implements ObjetoVolador{

    @Override
    public String despegar(){
        return "Despega el avion";
    }

    @Override
    public String aterrizar(){
        return "Aterriza el avion";
    }

    @Override
    public String volar(){
        return "El avion vuela";
    }
}
