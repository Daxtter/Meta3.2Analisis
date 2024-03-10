/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.company.analisisydiseno;

import java.util.Scanner;

/**
 *
 * @author nunez
 */
public class AnalisisYDiseno {

    public static void main(String[] args) {
        Sensor  sensorTemperatura =new Sensor(); //actores
        Sensor sensorLuz = new Sensor(); //actores
        
        Scanner lectura = new Scanner(System.in);
        while(true){ //Loop infinito
        
            System.out.println("Lectura temeperatura en centigrados");
            sensorTemperatura.read(lectura.nextInt());
            System.out.println("Lectura luz en Lumen");
            sensorLuz.read(lectura.nextInt());
            
            System.out.println("Temperatura (C) "+ sensorTemperatura.getSensor()+" Luz (Lm)" + sensorLuz.getSensor());
        }
    }
}
