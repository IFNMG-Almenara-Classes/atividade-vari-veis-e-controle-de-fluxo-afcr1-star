package questao12;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int num;
        int soma = 0;
        int i = 0;
        int pares = 0;

        do{
            System.out.println("Digite um número inteiro (0 para sair: ");
            num = entrada.nextInt();
            if(num != 0) {
                soma += num;
                i++;

                if(num % 2 == 0){
                    pares++;
                }
                }
            }while(num != 0);

            if(i > 0){
              double media = (double)soma/i;
              System.out.println("Quantidade de números pares: " + pares);
              System.out.println("Media dos números digitados: " + media);
            }else{
                System.out.println("Nenhum número foi digitado.");
            }

        }

    }

