/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv412;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class Atv412 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         int n[][]= new int[5][5], L, c, t;
         for (L=0; L<5; L++){
             for(c=0; c<5; c++){
                 System.out.println("digite elemento: " + L+1 + "-"+ c+1 );
                 n[L][c] = ler.nextInt();
                  
             }
             System.out.println("\n Toda a matriz \n");
             for (L=0; L<5; L++){
                 for(c=0;c<5;c++){
                     System.out.print(n[L][c]); 
                     System.out.println("");
                 }
                 System.out.println("Só os elementos nas posiçõs cuja linha mais coluna resulta num par ");
                 for (L=0; L<5; L++){
                     for(c=0; c<5; c++){
                         if( (L + c) % 2 ==0){
                              System.out.println(n[L][c]);
                         }
                     } 

                 } 

             }
         }

    }
    
}
