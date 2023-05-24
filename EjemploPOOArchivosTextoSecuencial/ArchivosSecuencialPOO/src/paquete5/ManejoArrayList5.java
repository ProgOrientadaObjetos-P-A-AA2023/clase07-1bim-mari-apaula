/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.util.ArrayList;
import java.util.Arrays;
import paquete1.Profesor2;

/**
 *
 * @author SALA H
 */
public class ManejoArrayList5 {

    public static void main(String[] args) {
        String[] lineas = {"Tara Hernandez|contratado|30",
            "Luis Andrade |factura|35", "Ana Juarez |nombramiento|40"};

        for (int i = 0; i < lineas.length; i++) {

            String c = lineas[i];

            ArrayList<String> linea_partes = new ArrayList<>(
                    Arrays.asList(c.split("\\|")));

            String nombre = linea_partes.get(0);
            String tipo = linea_partes.get(1);
            String edad = linea_partes.get(2);
            int edad2 = Integer.parseInt(edad);

            Profesor2 profesor = new Profesor2(nombre, tipo, edad2);
            System.out.printf("%s\n", profesor);
        }
    }
}
