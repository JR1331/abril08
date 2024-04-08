package com.softtek.modelo;

public class Perro extends Animal{

    @Override
    public String comer(){
        return "pienso";
    }
    @Override
    public String moverse(){
        return "patas";
    }
}
