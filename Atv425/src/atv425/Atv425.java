/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv425;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class Atv425 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int L,c, qtde[][] = new int[50][3] ,d;
        String nome[] = new String [50];
        for(L=0; L<50; L++) {
            System.out.println("Digite nome da "+ L+1 +" planta: ");
            nome[L] = ler.nextLine();
            System.out.println("\nDigite quantidade em estoque: ");
            qtde[L][0] = ler.nextInt();
            System.out.println("\nDigite quantidade ideal: ");
            qtde[L][1] = ler.nextInt();
            if(qtde[L][0] < qtde[L] [1]){
                qtde[L][2] = qtde[L][1]-qtde[L][0] ;
            }
            else{
                {qtde[L][2] = 0;
            }
                System.out.println("Total de compras");
                for(L=0; L<5; L++){
                    System.out.println(nome[L]+"-"+qtde[L][2]);
                }
        }

    }
    
}
}