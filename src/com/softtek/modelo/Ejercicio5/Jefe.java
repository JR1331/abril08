package com.softtek.modelo.Ejercicio5;

public class Jefe implements Empleado{
    private Informe informe;



    public Jefe() {
    }

    public Jefe(Informe informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "tareas del jefe";
    }

    @Override
    public String getInforme() {
        return  "Informe del jefe"+(informe.getInforme());
    }
}
