package grsi_carro;

// joao brilhante
import java.util.Scanner;

public class Carro {

    Scanner sc = new Scanner(System.in);
    String matricula;
    int kms = 0;
    int kms_ini = 0;
    String tipoCombustivel;
    int consumo;
    int combustivel = 0;
    String usar;
    boolean luz = false;
int total= 0;
    void setMatricula() {
        matricula = sc.next();

    }

    void setTipoCombustivel() {
        tipoCombustivel = sc.next();
    }

    void setConsumo() {
        consumo = sc.nextInt();
    }

    void abastecer() {
        int a = 0;
        while (a == 0) {
            System.out.println("qual o combustivel que vai usar: ");
            usar = sc.next();
            if (!usar.equals(tipoCombustivel)) {
                System.out.println("este carro nao usa " + usar + " abasteça com " + tipoCombustivel);
                a = 0;
            } else {
                a = 1;
            }
        }
        System.out.println("quantos litros vai abastecer");
        total = combustivel;
        int total_in = total;
        combustivel = sc.nextInt();
        total += combustivel;
        if (total < 50) {
            System.out.println("carro. abastecido. tinha " + total_in + " litro agora tem " + total);
        }
        if (total == 50) {
            System.out.println("tanque atestado. tinha " + total_in + " litro agora tem 50 litros.");
        }
        if (total > 50) {
            int amais = total - 50;
            System.out.println("tanque atestado. tinha " + total_in + " litro agora tem 50 litros. no entanto " + amais + " litros forma para o chao.");
        }
    }

    void andar(){
    System.out.println("quanto kms vais andar? ");
            int andar = sc.nextInt();
    int necessario = (andar* consumo)/100;
    
    if (total < necessario){
    double falta = necessario - total;
        System.out.println("nao há combustivel que chege para a viajem, resta-nos "+ total +" litros e falta-nos "+falta+" litros"+"\n");   
    }else{
        
    
            double o_tanque_tinha = total;
            double o_tanque_tem_agora = total - necessario;
            total -= necessario;
            System.out.println("Viagem concluida, o carro tinha  "+ o_tanque_tinha +" litros e agora tem "+ o_tanque_tem_agora +" litros "+"\n");
}
        
    }
    
    void mostra() {
        System.out.println("o carro tem como matricula " + matricula + ", usa " + tipoCombustivel + ", gasta " + consumo + " litros a cada 100kms."+" E tem atualmente "+total+" litros no tanque ");

    }

    void setOn() {
        if (luz == false) {
            System.out.println("a luz estava desligada e agora estam ligadas.");
            luz = true;

        } else {
            System.out.println(" as luzes ja estava ligadas.");
        }
    }

    void setOff() {
       if (luz == true){
       System.out.println(" as luzes estava ligadas, agora estam desligadas");
       luz = false;
       }else{
       System.out.println("as luzes ja estava apagadas.");
       }
    }

    
    
    
    
    
    
    
    
    
    
    
}
