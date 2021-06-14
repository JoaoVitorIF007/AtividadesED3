/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv356;

import java.util.Scanner;


/**
 *
 * @author JoaoVitor
 */
public class Atv356 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int L, c, t;
       int media[] = new int [15];
       String nomes[] = new String[15];
       String sit[] = new String[15];
       float pr1[] = new float[15];
       float pr2[] = new float[15];
       
       for(L=0; L <= 14 ; L++){
           System.out.println("Digite "+ L+1 +" nome: ");
           nomes[L] = ler.nextLine();
       
       }
       while (nomes[L].length() > 30) {
                System.out.println("Nomes com ate 30 caracteres");
                System.out.printf("Digite "+ L+1 +" nome: ");
                nomes[L] = ler.nextLine();
            }
            t = 30 - nomes[L].length();

            for (c = 1; c <= t; c++) {
                nomes[L] = nomes[L].concat("");
                System.out.println("Digite nota 1: ");
                pr1[L] = ler.nextFloat();
                System.out.println("Digite nota 2: ");
                pr2[L] = ler.nextFloat();
                media[L] = (int) (pr1[L] + pr2[L] / 2+0.0001);
                if (media[L] >= 5) {
                    sit[L] = "AP";
                } else {
                    sit[L] = "RP";
                }

                System.out.println("Relação final");
                for (L = 0; L <= 14; L++) {
                    System.out.println(L+1 +"- "+nomes[L]+"\t"+pr1[L]+"\t"+pr2[L]+"\t"+media[L]+"\t"+sit[L]);
                    
                }
            }

        }

    }


    
    

