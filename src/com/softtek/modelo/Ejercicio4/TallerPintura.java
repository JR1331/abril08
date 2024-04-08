package com.softtek.modelo.Ejercicio4;

public class TallerPintura implements ITaller{

    @Override
    public String reparar(Coche c) {
        return "Reparacion de pintura";
    }
}
