/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dol.ConverterData;
import java.util.Scanner;

/**
 *
 * @author JADPA-14
 */
public class Menu implements iMenu{
Scanner scan = new Scanner(System.in);
    @Override
    public void show() {
      
        showOpt();
    }

    @Override
    public void showOpt() {
        System.out.println("1-Convertir de bytes kilobytes");
        System.out.println("2-Convertir de kilobytes a Megabytes");
         System.out.println("3-Salir");
        showOptSlct(scan.nextInt());
    }
    

    @Override
    public void showOptSlct(int n) {
      
       ConverterData convD = new ConverterData(1,8,1000,1024);


        switch (n) {
            case 1 -> convD.converter(n);
            case 2 -> convD.converter(n);
            case 3 -> {
                System.exit(0);
                System.out.println("Saliendo...");
            }
        }
    }
    
}
