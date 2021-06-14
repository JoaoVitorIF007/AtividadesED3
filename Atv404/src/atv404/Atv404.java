/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv404;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class Atv404 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int N[][]= new int[10][10];
        int L, c, t;
        for (L=0; L<=9; L++){
        for (c=0; c<=9; c++){
            System.out.println("Entre com o elemento linha "+ L+1 +" coluna "+ c+1);
          N[L][c] = ler.nextInt();
        }
    }
        
        System.out.println("ACIMA DA DIAGONAL PRINCIPAL");
        for(L=0; L<=8 ;L++){
            for(c= L+1; c<= 9;c++){
                System.out.println(N[L][c]);
                System.out.println("");
                for(t=0; t<=L;t++){
                    System.out.println(t);
                }
            }        
            
        }
    }
    
}
