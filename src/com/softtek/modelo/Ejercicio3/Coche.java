package com.softtek.modelo.Ejercicio3;

public class Coche implements IVehiculo{

    private int deposito;

    public Coche() {
    }

    public Coche(int deposito) {
        this.deposito = deposito;
    }

    public String moverse(){
        if(deposito>0){
            return "El coche se mueve";
        }
        else{
            return "El coche tiene el deposito vacio";
        }
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }
}
