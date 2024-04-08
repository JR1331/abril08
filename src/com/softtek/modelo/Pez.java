package com.softtek.modelo;

public class Pez extends Animal{
    @Override
    public String comer(){
        return "algas";
    }
    @Override
    public String moverse(){
        return "aletas";
    }
}
