/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dol;

import ui.Menu;
import ui.iMenu;

import java.util.Scanner;

/**
 * @author JADPA-14
 */
public class ConverterData {
    Scanner scan = new Scanner(System.in);

    public int getOpt() {
        return opt;
    }

    public void setOpt(int opt) {
        this.opt = opt;
    }

    public float getSizeBytes() {
        return sizeBytes;
    }

    public void setSizeBytes(float sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    public float getSizeKiloBytes() {
        return sizeKiloBytes;
    }

    public void setSizeKiloBytes(float sizeKiloBytes) {
        this.sizeKiloBytes = sizeKiloBytes;
    }

    public float getSizeMegaBytes() {
        return sizeMegaBytes;
    }

    public void setSizeMegaBytes(float sizeMegaBytes) {
        this.sizeMegaBytes = sizeMegaBytes;
    }

    public ConverterData(int opt, float sizeBytes, float sizeKiloBytes, float sizeMegaBytes) {
        this.opt = opt;
        this.sizeBytes = sizeBytes;
        this.sizeKiloBytes = sizeKiloBytes;
        this.sizeMegaBytes = sizeMegaBytes;
    }

    private int opt;
    private float sizeBytes;
    private float sizeKiloBytes;
    private float sizeMegaBytes;


    public void converter(int num1) {
        int opt = num1;
        float bytes = 8;
        boolean back = false;
        Menu menu = new Menu();
        switch (opt) {
            case 1 -> {
                System.out.println("Ingrese la cantidad de Bytes");
                setSizeBytes(scan.nextFloat());
                float Bytes = getSizeBytes();
                float kB = Bytes / 1000;
                System.out.println("El tamaño en KB es =" + kB + "   " + sizeKiloBytes);
                while (!back) {
                    System.out.println(" desea Volver al menú  ?");
                    System.out.println("1-Seguir calculando");
                    System.out.println("2-Volver al menu");
                    num1 = scan.nextInt();
                    if (num1 == 1) {
                        converter(num1);
                        back = true;
                    } else {
                        menu.show();
                        break;
                    }

                }
            }
            case 2 -> {
                System.out.println("Ingrese la cantidad de KiloBytes");
                setSizeKiloBytes(scan.nextFloat());
                float mb = getSizeKiloBytes() / sizeMegaBytes;
                System.out.println("El tamaño en mb es =" + mb);
                while (!back) {
                    System.out.println(" desea Volver al menú  ?");
                    System.out.println("1-Seguir calculando");
                    System.out.println("2-Volver al menu");
                    num1 = scan.nextInt();
                    if (num1 == 1) {
                        converter(num1);
                        back = true;
                    } else {
                        menu.show();
                        break;
                    }

                }
            }
            default -> {
                System.out.println("opcion no valida, desea finalizar ?");
                System.out.println("1-Si ");
                System.out.println("otra tecla-No");
                opt = scan.nextInt();
                if (opt == 1) {
                    menu.show();
                } else {
                    System.exit(0);
                }
            }
        }
    }


}
