package com.softtek.modelo;

public class Gusano extends Animal{
    @Override
    public String comer(){
        return "hojas";
    }
    @Override
    public String moverse(){
        return "contracciones musculares";
    }
}
