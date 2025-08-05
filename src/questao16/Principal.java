package questao16;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = entrada.nextInt();

        System.out.println("\n======TABOADA DE MULTIPLICAÇÃO=====");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num*i));

        }
        System.out.println("\n======TABOADA DE DIVISÃO=====");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " / " + i + " = " + ((double) num/i));
        }
    }
}