package com.yenifergomez.dominio;

import java.util.ArrayList;

public class Corredor {

    private int cedulaYG;
    private String nombreCorredorYG;
    private int edadYG;
    private String ciudadYG;
    private static int nroCorredoresCreadosYG = 0;



    public Corredor(String nombreCorredorYG) {

        this.nombreCorredorYG = nombreCorredorYG;
        this.cedulaYG = nroCorredoresCreadosYG + 1;
        Corredor.nroCorredoresCreadosYG++;
    }
    

    public static Corredor contarCorredor(String nombreCorredorYG) {

        if (nroCorredoresCreadosYG <= 25) {
            return new Corredor(nombreCorredorYG);
        } else {
            System.out.println("No se pueden registrar más de 25 corredores");
            return null;
        }
    }



    public int getCedulaYG() {
        return cedulaYG;
    }

    public String getNombreCorredorYG() {
        return nombreCorredorYG;
    }

    public int getEdadYG() {
        return edadYG;
    }

    public String getCiudadYG() {
        return ciudadYG;
    }


    public static int getNroCorredoresCreadosYG() {
        return nroCorredoresCreadosYG;
    }



    public static void setNroCorredoresCreadosYG(int nroCorredoresCreadosYG) {
        Corredor.nroCorredoresCreadosYG = nroCorredoresCreadosYG;
    }
}
