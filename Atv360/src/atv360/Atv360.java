/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv360;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class Atv360 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ultdia[] = new int[12];
        int data, i, dia, mes;
        String signo[] = new String[12];
       
        for (i = 0; i < 12; i++) {
            System.out.println("Digite signo: ");
            signo[i] = ler.nextLine();

            System.out.println("Digite ultimo dia:");
            ultdia[i] = ler.nextInt();
        }

        System.out.println("Digite data no formato ddmm ou 9999 para terminar: ");
        data = ler.nextInt();

        while (data != 9999) {
            dia = data / 100;
            mes = data % 100;
            mes--;

            if (dia > ultdia[mes]) {
                mes = (mes + 1) % 12;
            }

            System.out.println("Signo: " + signo[mes]);
            System.out.println("Digite data no formato ddmm ou 9999 para terminar: ");
            data = ler.nextInt();

        }

    }

}