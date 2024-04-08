package com.softtek.modelo;

public class Pajaro extends Animal{
    @Override
    public String comer(){
        return "insectos";
    }
    @Override
    public String moverse(){
        return "alas";
    }
}
