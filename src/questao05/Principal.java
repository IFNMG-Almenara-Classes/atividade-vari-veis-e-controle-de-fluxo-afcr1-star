package questao05;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("--------Tabela de Preços---------");
        System.out.println("Produto ----- Qaunt ------- Valor");
        System.out.println("Laranja --- menos 12 ----- R$0,50");
        System.out.println("Laranja --- mais de 12 --- R$0,30\n");

        System.out.println("Digite a quantidade de laranjas: ");
        int quantidade = entrada.nextInt();
        double valor;
        double total;

        if(quantidade < 12){
            valor = 0.50;
        }else{
            valor = 0.30;

        }
        total = valor * quantidade;
        System.out.printf("Total da compra: %.2f\n", total);
    }
}
