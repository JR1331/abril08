package com.softtek.modelo.Ejercicio3;

public class Conductor {

    private IVehiculo vehiculo;

    public Conductor() {
    }

    public Conductor(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String conducir(){
        return "El coche est siendo conducido";
    }

    public IVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
