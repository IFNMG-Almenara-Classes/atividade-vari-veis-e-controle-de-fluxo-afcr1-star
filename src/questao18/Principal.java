package questao18;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int primos = 0;

        System.out.println("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o primeiro número: ");
        int num2 = entrada.nextInt();

        for(int i = num1; i <= num2; i++){
            if(primos(i)){
                primos++;
            }
            System.out.println("Quantidade de numeros primos: " + primos);
        }

    }
}
