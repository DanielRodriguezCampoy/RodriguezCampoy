/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rodriguezcampoy;

/**
 *
 * @author derod
 */
public class Campoy {
    public void restaEnteros(Integer numero1, Integer numero2) {
        Integer numeroFinal = 0;
        numeroFinal = numero1 - numero2;
        System.out.println("El resultado de la suma es: " + numeroFinal);
    }
    
    public void calculaModulo(Integer numero1, Integer numero2) {
        Integer numeroFinal = numero1 % numero2;
        System.out.println("El resultado es: " + numeroFinal);
    }
}
