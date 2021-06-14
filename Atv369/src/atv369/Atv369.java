/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv369;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class Atv369 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int mesa[] = new int[30];
        int qtde[] = new int [30];
        int i, codigo,lugares, lugmesa;
        for(i=0; i<30; i++){
            mesa[i] = 100+i;
            qtde[i] = 5;
        }
        lugares = 150;
        System.out.println("entre com codigo( 100 - 129 ) ou 0 para terminar");
        codigo = ler.nextInt();
            while (codigo > 0 && lugares != 0) {
            i = 0;
            while (codigo != mesa[i] && i < 29) {
                i++;
            }

            if (codigo == mesa[i]) {
                System.out.println("Quantidade de lugares a reservar: ");
                lugmesa = ler.nextInt();

                if (qtde[i] >= lugmesa) {
                    qtde[i] = qtde[i] - lugmesa;
                    lugares = lugares - lugmesa;
                }
                    else{
                            System.out.println("Nao ha lugares a reservar "); 
                            }
                        
             if(codigo < 100){
              System.out.println("Codigo de mesa invalido");
              System.out.println("entre com codigo (100 - 129) ou 0 para terminar:");
              codigo = ler.nextInt();
              }
            
        if(lugares == 0){
            System.out.println("Lotação esgotada");
      }
        else{
            System.out.println("Lugares vagos");
    }
       for(i=0; i<30; i++){
           if(qtde[i]!=0){
               System.out.printf("\n Mesa:" + mesa[i] + "\n Total lugares:" + qtde[i]);
               
            }
         }
       }
    }
  }
}
    

    

