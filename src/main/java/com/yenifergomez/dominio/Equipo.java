package com.yenifergomez.dominio;

import java.util.ArrayList;
import java.util.List;

public class Equipo {


    private int numeroEquipoYG;
    private String nombreEquipoYG;
    private String ciudadEquipoYG;
    private List<Corredor> corredoresYG;
    private static int nroEquiposCreadosYG = 0;


    public Equipo(String nombreEquipoYG) {
        this.nombreEquipoYG = nombreEquipoYG;
        this.corredoresYG = new ArrayList<>();
        this.numeroEquipoYG= nroEquiposCreadosYG + 1;
        Equipo.nroEquiposCreadosYG++;
    }

    public static Equipo contarEquipo(String nombreEquipoYG) {

        if (nroEquiposCreadosYG <= 5) {
            return new Equipo(nombreEquipoYG);
        } else {
            System.out.println("No se pueden registrar más de cinco equipos");
            return null;
        }
    }

    public void registrarCorredor(Corredor participante){
        corredoresYG.add(participante);
    }


    public int getNumeroEquipoYG() {
        return numeroEquipoYG;
    }

    public String getNombreEquipoYG() {
        return nombreEquipoYG;
    }

    public String getCiudadEquipoYG() {
        return ciudadEquipoYG;
    }

    public List<Corredor> getCorredoresYG() {
        return corredoresYG;
    }

    public static int getNroEquiposCreadosYG() {
        return nroEquiposCreadosYG;
    }

    public void setCorredoresYG(List<Corredor> corredoresYG) {
        this.corredoresYG = corredoresYG;
    }


    public static void setNroEquiposCreadosYG(int nroEquiposCreadosYG) {
        Equipo.nroEquiposCreadosYG = nroEquiposCreadosYG;
    }
}