package com.yenifergomez.aplicacion;

import com.yenifergomez.dominio.Competencia;
import com.yenifergomez.dominio.Corredor;
import com.yenifergomez.dominio.Equipo;
import com.yenifergomez.dominio.Etapa;
import java.util.Random;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.random.RandomGenerator;

public class App {
    public static void main(String[] args) {

        Competencia atletismoHP = new Competencia("Corre al nivel de Harry Potter");


        Equipo equipo1 = Equipo.contarEquipo("Gryffindor");
        Equipo equipo2 = Equipo.contarEquipo("Hufflepuff");
        Equipo equipo3 = Equipo.contarEquipo("Ravenclaw");
        Equipo equipo4 = Equipo.contarEquipo("Slytherin");
        Equipo equipo5 = Equipo.contarEquipo("Hogwarts");

        Etapa estacion94 = new Etapa(1,"Estacion 9/4", equipo2);
        Etapa elcaldero = new Etapa(2,"El Caldero Chorreante",equipo1);
        Etapa callejon = new Etapa(3, "Callejón Diagon",equipo4);
        Etapa residencia = new Etapa(4, "La residencia de Sirius Black",equipo2);
        Etapa estacionKing = new Etapa(5, "Estación King Cross",equipo2);
        Etapa banco = new Etapa(6, "Banco de Gringotts",equipo1);
        Etapa cuartel = new Etapa(7, "Cuartel General de la Orden del Fénix",equipo1);
        Etapa zoo = new Etapa(8, "Zoo de Londres",equipo2);
        Etapa millenium = new Etapa(9, "Millennium Bridge",equipo5);
        Etapa westminster = new Etapa(10, "Westminster Station",equipo3);

        Corredor corredor1 = Corredor.contarCorredor("Jennifer");
        Corredor corredor2 = Corredor.contarCorredor("Eduardo");
        Corredor corredor3 = Corredor.contarCorredor("Gabriela");
        Corredor corredor4 = Corredor.contarCorredor("Flor");
        Corredor corredor5 = Corredor.contarCorredor("Brayan");
        Corredor corredor6 = Corredor.contarCorredor("Camila");
        Corredor corredor7 = Corredor.contarCorredor("Natalia");
        Corredor corredor8 = Corredor.contarCorredor("Karina");
        Corredor corredor9 = Corredor.contarCorredor("Ximena");
        Corredor corredor10 = Corredor.contarCorredor("Lina");
        Corredor corredor11 = Corredor.contarCorredor("Martina");
        Corredor corredor12 = Corredor.contarCorredor("Yeison");
        Corredor corredor13 = Corredor.contarCorredor("Jose");
        Corredor corredor14 = Corredor.contarCorredor("Ana");
        Corredor corredor15 = Corredor.contarCorredor("Verónica");
        Corredor corredor16 = Corredor.contarCorredor("Johnatan");
        Corredor corredor17 = Corredor.contarCorredor("Camilo");
        Corredor corredor18 = Corredor.contarCorredor("Yesenia");
        Corredor corredor19 = Corredor.contarCorredor("Alejandro");
        Corredor corredor20 = Corredor.contarCorredor("Nikol");
        Corredor corredor21 = Corredor.contarCorredor("Dylan");
        Corredor corredor22 = Corredor.contarCorredor("Juan Pablo");
        Corredor corredor23 = Corredor.contarCorredor("Matías");
        Corredor corredor24 = Corredor.contarCorredor("Yurliana");
        Corredor corredor25 = Corredor.contarCorredor("Luisa");

        atletismoHP.registrarEtapas(estacion94);
        atletismoHP.registrarEtapas(elcaldero);
        atletismoHP.registrarEtapas(callejon);
        atletismoHP.registrarEtapas(residencia);
        atletismoHP.registrarEtapas(estacionKing);
        atletismoHP.registrarEtapas(banco);
        atletismoHP.registrarEtapas(cuartel);
        atletismoHP.registrarEtapas(zoo);
        atletismoHP.registrarEtapas(millenium);
        atletismoHP.registrarEtapas(westminster);

        atletismoHP.registrarEquipos(equipo1);
        atletismoHP.registrarEquipos(equipo2);
        atletismoHP.registrarEquipos(equipo3);
        atletismoHP.registrarEquipos(equipo4);
        atletismoHP.registrarEquipos(equipo5);

        equipo1.registrarCorredor(corredor1);
        equipo1.registrarCorredor(corredor2);
        equipo1.registrarCorredor(corredor3);
        equipo1.registrarCorredor(corredor4);
        equipo1.registrarCorredor(corredor5);

        equipo2.registrarCorredor(corredor6);
        equipo2.registrarCorredor(corredor7);
        equipo2.registrarCorredor(corredor8);
        equipo2.registrarCorredor(corredor9);
        equipo2.registrarCorredor(corredor10);

        equipo3.registrarCorredor(corredor11);
        equipo3.registrarCorredor(corredor12);
        equipo3.registrarCorredor(corredor13);
        equipo3.registrarCorredor(corredor14);
        equipo3.registrarCorredor(corredor15);

        equipo4.registrarCorredor(corredor16);
        equipo4.registrarCorredor(corredor17);
        equipo4.registrarCorredor(corredor18);
        equipo4.registrarCorredor(corredor19);
        equipo4.registrarCorredor(corredor20);

        equipo5.registrarCorredor(corredor21);
        equipo5.registrarCorredor(corredor22);
        equipo5.registrarCorredor(corredor23);
        equipo5.registrarCorredor(corredor24);
        equipo5.registrarCorredor(corredor25);

        //Solución

        System.out.println("Bienvenidos a la competencia: " + atletismoHP.getNombreCompetenciaYG());

        List<String> equiposYG = Arrays.asList("Gryffindor","Hufflepuff", "Ravenclaw", "Slytherin", "Hogwarts");
        System.out.println("Los equipos de la competencia son: ");
        equiposYG.forEach(c-> System.out.println(c));

        System.out.println("Los equipos ganadores por cada etapa, son: ");
        System.out.println("Etapa: "+ estacion94.getNombreEtapaYG()+" - " + estacion94.getEquipoGanadorYG().getNombreEquipoYG());
        System.out.println("Etapa: "+ elcaldero.getNombreEtapaYG()+" - " + elcaldero.getEquipoGanadorYG().getNombreEquipoYG());
        System.out.println("Etapa: "+ callejon.getNombreEtapaYG()+" - " + callejon.getEquipoGanadorYG().getNombreEquipoYG());
        System.out.println("Etapa: "+ residencia.getNombreEtapaYG()+" - " + residencia.getEquipoGanadorYG().getNombreEquipoYG());
        System.out.println("Etapa: "+ estacionKing.getNombreEtapaYG()+" - " + estacionKing.getEquipoGanadorYG().getNombreEquipoYG());
        System.out.println("Etapa: "+ banco.getNombreEtapaYG()+" - " + banco.getEquipoGanadorYG().getNombreEquipoYG());
        System.out.println("Etapa: "+ cuartel.getNombreEtapaYG()+" - " + cuartel.getEquipoGanadorYG().getNombreEquipoYG());
        System.out.println("Etapa: "+ zoo.getNombreEtapaYG()+" - " + zoo.getEquipoGanadorYG().getNombreEquipoYG());
        System.out.println("Etapa: "+ millenium.getNombreEtapaYG()+" - " + millenium.getEquipoGanadorYG().getNombreEquipoYG());
        System.out.println("Etapa: "+ westminster.getNombreEtapaYG()+" - " + westminster.getEquipoGanadorYG().getNombreEquipoYG());

        /*System.out.println("Los corredores del equipo " + equipo1.getNombreEquipoYG() +" son: "
                + "-" + corredor1.getNombreCorredorYG()
                + "-" + corredor2.getNombreCorredorYG()
                + "-" + corredor3.getNombreCorredorYG()
                + "-" + corredor4.getNombreCorredorYG()
                + "-" + corredor5.getNombreCorredorYG()
        );*/

        /*for (Corredor corredores1:equipo1.getCorredoresYG()){
            System.out.println("Los corredores del equipo " + equipo1.getNombreEquipoYG() +" son: "
                    +corredores1 );
        }*/

        System.out.println("Los corredores del equipo " + equipo1.getNombreEquipoYG() +" son: ");
        equipo1.getCorredoresYG().forEach(c->{ System.out.println(c.getNombreCorredorYG());});

        System.out.println("TOP 10 DE LA COMPETENCIA: ");

        ArrayList<String> my_list = new ArrayList<String>();


        my_list.add(corredor1.getNombreCorredorYG());
        my_list.add(corredor2.getNombreCorredorYG());
        my_list.add(corredor3.getNombreCorredorYG());
        my_list.add(corredor4.getNombreCorredorYG());
        my_list.add(corredor5.getNombreCorredorYG());
        my_list.add(corredor6.getNombreCorredorYG());
        my_list.add(corredor7.getNombreCorredorYG());
        my_list.add(corredor8.getNombreCorredorYG());
        my_list.add(corredor9.getNombreCorredorYG());
        my_list.add(corredor10.getNombreCorredorYG());
        my_list.add(corredor11.getNombreCorredorYG());
        my_list.add(corredor12.getNombreCorredorYG());
        my_list.add(corredor13.getNombreCorredorYG());
        my_list.add(corredor14.getNombreCorredorYG());
        my_list.add(corredor15.getNombreCorredorYG());
        my_list.add(corredor16.getNombreCorredorYG());
        my_list.add(corredor17.getNombreCorredorYG());
        my_list.add(corredor18.getNombreCorredorYG());
        my_list.add(corredor19.getNombreCorredorYG());
        my_list.add(corredor20.getNombreCorredorYG());
        my_list.add(corredor21.getNombreCorredorYG());
        my_list.add(corredor22.getNombreCorredorYG());
        my_list.add(corredor23.getNombreCorredorYG());
        my_list.add(corredor24.getNombreCorredorYG());
        my_list.add(corredor25.getNombreCorredorYG());


        for (int i = 0; i <= 9; i++)
        {

            int index = (int)(Math.random() * my_list.size());

            System.out.println("Corredor : "
                    + my_list.get(index));
        }


    }
}
