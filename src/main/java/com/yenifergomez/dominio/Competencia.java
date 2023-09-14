package com.yenifergomez.dominio;

import java.util.ArrayList;
import java.util.List;

public class Competencia {
    private String nombreCompetenciaYG;
    private List <Etapa> etapasYG;
    private List <Equipo> equiposYG;



    public Competencia(String nombreCompetenciaYG) {
        this.nombreCompetenciaYG = nombreCompetenciaYG;
        this.etapasYG = new ArrayList<>();
        this.equiposYG = new ArrayList<>();
    }

    public void registrarEquipos(Equipo equipo){
        equiposYG.add(equipo);
    }

    public void registrarEtapas(Etapa etapa){
        if (etapasYG.size() <= 10){
            etapasYG.add(etapa);
        }else{
            System.out.println("En la competencia solo se pueden registrar 10 etapas");
        }

    }

    public String getNombreCompetenciaYG() {
        return nombreCompetenciaYG;
    }

    public List<Etapa> getEtapas() {
        return etapasYG;
    }

    public List<Equipo> getEquipos() {
        return equiposYG;
    }


    public void setEtapas(List<Etapa> etapas) {
        this.etapasYG = etapas;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equiposYG = equipos;
    }


}
