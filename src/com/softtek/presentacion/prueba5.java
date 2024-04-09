package com.softtek.presentacion;

import com.softtek.modelo.Ejercicio5.*;

public class prueba5 {
    public static void main(String[] args) {
        InformeTrimestre1 i1 = new InformeTrimestre1();
        InformeTrimestre2 i2 = new InformeTrimestre2();

        Director d = new Director(i1);
        Jefe j = new Jefe(i1);
        Secretario s = new Secretario(i2,"Softtek","secre@softtek.com");

        System.out.println(d.getInforme());
        System.out.println(d.getTareas());
        System.out.println(j.getInforme());
        System.out.println(j.getTareas());
        System.out.println(s.getInforme());
        s.setInforme(i1);
        System.out.println(s.getInforme());
        System.out.println(s.getTareas());

    }
}
