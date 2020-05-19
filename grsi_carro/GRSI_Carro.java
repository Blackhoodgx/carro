package grsi_carro;

// joao brilhante
import java.util.Scanner;

public class GRSI_Carro {

    static Carro carro = new Carro();

    public static void main(String[] args) {

        int x = menuPrin();

    }

    private static int menuPrin() {
        
       
        Scanner sc = new Scanner(System.in);
        
        int resposta = 0;
        do {
            System.out.println("- - - - - - - - - - menuprincipal - - - - - - - - - -");
            System.out.println("1. criar carro");
            System.out.println("2. abastecer");
            System.out.println("3. andar");
            System.out.println("4. ligar luz");
            System.out.println("5. desligar luz");
            System.out.println("6. mostrar");
            System.out.println("7. Sair");

            
            resposta = sc.nextInt();
           
            if (resposta == 1) {

                System.out.println("qual é a tua matricula? ");
                carro.setMatricula();
                System.out.println("qual é o tipo de combustivel?  ");
                carro.setTipoCombustivel();
                System.out.println("quanto combustivel consomes a cada 100kms? ");
                carro.setConsumo();
                resposta =0;
            }

            if (resposta == 2) {
                carro.abastecer();
                resposta = 0;
            }

            if (resposta == 3) {
             carro.andar();
             resposta = 0;
            }
            
            if (resposta == 4){
            carro.setOn();
            resposta = 0;
            }
           
            
            if (resposta == 5){
            
            carro.setOff();
            resposta = 0;
            
            }
            
            
            if (resposta == 6){ 
            carro.mostra();
            resposta = 0;
            }
            
           
            if (resposta == 7){
              System.out.println("fim");
               
               } 
                
             

        } while (resposta == 0);
        return 0;
        
    }

      
}
