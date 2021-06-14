/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv398;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class Atv398 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int k,codi,codigo,t,i,quantidade,aux;
        int cod[] = new int[50];
        int quant[] = new int[50];
        float preco[] = new float[50], venda, geral, auxp;
        k=0;
        geral = 0;
        System.out.println("Digite o codigo do produto ou 0 para acabar: ");
        codi = ler.nextInt();
        while (k <50 && codi != 0){
             cod[k] = codi; 
             System.out.println("Digite a quantidade do produto: ");
             quant[k] = ler.nextInt();
             System.out.println("Digite o preco do produto: ");
             preco[k] = ler.nextInt();
             k++;
             System.out.println("Digite o codigo do produto ou 0 para acabar:");
             if{
                     System.out.println("Central completa: ");
                     }

        }
        


    }
    
}
