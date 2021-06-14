/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv428;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class Atv428 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int dados[][] = new int[10][4];
        int L, codigo, pos, aux;
        for(L=0; L<10; L++){
            System.out.println("digite matricula no formato aascccnnn: ");
            dados [L][0] = ler.nextInt();
            aux = dados[L][0] / 1000000; 
            aux = dados[L][0] - aux*1000000;
            dados [L][2] = aux / 1000;
            System.out.println("digite sexo (0 fem 1 masc): ");
            dados[L][1] = ler.nextInt();
            System.out.println("digite CR do aluno: ");
            dados [L][3] = ler.nextInt();
            System.out.println("digite codigo do curso: ");
            codigo = ler.nextInt();
            pos = 0;
           for (L=0; L<10; L++){
            if(dados[L][2]==codigo && dados[L][1]== 0){
                pos = L;
            }
            else{
                if(dados [L] [3] >dados [pos] [3]){
                    pos = L;
                }
            }
        } 
           System.out.println("aluna premiada matricula: "+dados[pos][0]+" teve CR: "+dados[pos][3]);
       }
    }
    
}
