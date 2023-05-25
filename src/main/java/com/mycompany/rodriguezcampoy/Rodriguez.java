/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rodriguezcampoy;

/**
 *
 * @author derod
 */
public class Rodriguez {
    public void sumaEnteros(Integer numero1, Integer numero2) {
        Integer numeroFinal = 0;
        numeroFinal = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + numeroFinal);
    }
    
    public void calculaMenor(Integer numero1, Integer numero2) {
        Integer numeroFinal = 0;
        if(numero1 < numero2) {
            System.out.println("El menor de los dos es: " + numero1);
        } else {
            System.out.println("El menor de los dos es: " + numero2);
        }
    }
}
