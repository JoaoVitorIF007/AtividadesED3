/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv358;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class Atv358 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float lucro = 0;
        float precocompra[] = new float[100];
        float precovenda[] = new float[100];
        int A;
        int totlucromenor10 = 0;
        int totlucromenor20 = 0;
        int totlucromaior20 = 0;
        for(A=0; A<100; A++){
            System.out.println("Preco de compra: ");
            precocompra[A] = ler.nextFloat();
            System.out.println("Preço de venda: ");
            precovenda[A] = ler.nextFloat();
            if(lucro < 10.0){
                totlucromenor10++;
            }
            else{
                if(lucro <= 20.0){
                    totlucromenor20++;
                }
                else{
                    totlucromaior20++;
                }
            }
            System.out.println("Total de mercadorias com lucro < 10%: " + totlucromenor10);
            System.out.println("Total de mercadorias com lucro <= 10% <= lucro <= 20%: "+ totlucromenor20);
            System.out.println("Total de mercadorias com lucro > 20%: " + totlucromaior20);
        }
        
    }
    
}
