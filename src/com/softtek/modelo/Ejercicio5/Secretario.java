package com.softtek.modelo.Ejercicio5;

public class Secretario implements Empleado{
    private Informe informe;
    private String empresa;
    private String email;


    public void setInforme(Informe informe){
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "tareas del secretario";
    }

    @Override
    public String getInforme() {
        return "informe del secretario"+(informe.getInforme());
    }

    public Secretario() {
    }

    public Secretario(Informe informe, String empresa, String email) {
        this.informe = informe;
        this.empresa = empresa;
        this.email = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
