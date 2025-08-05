package questao20;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = entrada.nextInt();

        if(num % 3 == 0 || num % 5 == 0){
            System.out.println("O " + num + " é divisível por 3 ou por 5, mas não pelos dois!");
        }else{
            System.out.println("O " + num + " não é divisível por 3 nem por 5!");
        }

    }
}
