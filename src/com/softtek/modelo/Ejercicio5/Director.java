package com.softtek.modelo.Ejercicio5;

public class Director implements  Empleado{
    private Informe informe;

    public Director() {
    }

    public Director(Informe informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "tareas del director";
    }

    @Override
    public String getInforme() {
        return "Informe del jefe"+(informe.getInforme());
    }


}
