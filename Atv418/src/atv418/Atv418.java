/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv418;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class Atv418 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int L, c;
        int A[][] = new int[4][4], B[][] = new int[4][4], SOMA[][] = new int[4][4];
        
        for(L=0 ; L<4; L++) {
            for(c=0; c<4; c++){
                System.out.println("Digite elemento de A ["+ L+1 +"]["+ c+1 +"]");
                A[L][c] = ler.nextInt();                           
            }
        }
        for(L=0; L<4; L++) {
            for(c=0; c<4; c++){
                System.out.println("Digite elemento de B [" + L+1 +"]["+ c+1 +"]");
                B[L][c] = ler.nextInt();
                SOMA[L][c] = ler.nextInt();
            }
        }
        System.out.println("MATRIZ SOMA");
        for(L=0; L<4; L++){
            for(c=0; c<4; c++){
                System.out.println(SOMA[L][c]);
            } 

        } 

    }
    
}
