/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.analisisydiseno;

/**
 *
 * @author nunez
 */
public class Sensor {
    int sensor;

    public Sensor() {
    }

    public int getSensor() {
        return sensor;
    }

    public void read(int leer){
        sensor = leer;
    }
    
}
