package questao17;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número ineteiro positivo: ");
        int num = entrada.nextInt();

        long fatorial = 1;
        for(int i = 1; i < num; i++){
            fatorial *= i;
        }
        System.out.println(num + "! = " + fatorial);
    }
}
