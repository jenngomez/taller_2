package com.yenifergomez.dominio;

import java.util.ArrayList;
import java.util.List;

public class Etapa {

    private int numeroEtapaYG;
    private String nombreEtapaYG;
    private Equipo equipoGanadorYG;


    public Etapa(int numeroEtapaYG, String nombreEtapaYG, Equipo equipoGanadorYG) {
        this.numeroEtapaYG = numeroEtapaYG;
        this.nombreEtapaYG = nombreEtapaYG;
        this.equipoGanadorYG=equipoGanadorYG;

    }

    public int getNumeroEtapaYG() {
        return numeroEtapaYG;
    }

    public String getNombreEtapaYG() {
        return nombreEtapaYG;
    }

    public Equipo getEquipoGanadorYG() {
        return equipoGanadorYG;
    }

    public void setEquipoGanadorYG(Equipo equipoGanadorYG) {
        this.equipoGanadorYG = equipoGanadorYG;
    }
}
