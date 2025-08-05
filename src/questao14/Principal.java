package questao14;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double desconto = 0.0;
        double valorFinal = 0.0;

        System.out.println("Digite o valor da compra: ");
        double valorCompra = entrada.nextDouble();

        System.out.println("Tipo de cliente:");
        System.out.println("1 - Comum");
        System.out.println("2 - VIP");
        System.out.println("3 - Funcionário");
        System.out.println("Digite o código do cliente: ");
        int cliente = entrada.nextInt();

        if(cliente == 2){
            desconto = 0.05;
        }else if(cliente == 3){
            desconto = 0.10;
        }

        valorFinal = valorCompra - (valorCompra * desconto);

        System.out.printf("Valor a pagar: R$ %.2f\n", valorFinal);

    }
}
