package questao01;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primriro número: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        if(num1 > num2){
            System.out.println("O maior numero é " + num1);
        }else if(num1 < num2){
            System.out.println("O maior número é " + num2);
        }else{
            System.out.println("Os números são iguais");
        }
        entrada.close();
    }
}

