package questao13;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.println("Digite o primeiro valor: ");
                double num1 = entrada.nextDouble();

                System.out.println("Digite o segundo valor: ");
                double num2 = entrada.nextDouble();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));

                        } else {
                            System.out.println("Erro: divisão por zero!");
                        }
                        break;
                }
            } else if (opcao == 5) {
                System.out.println("Encerrando a calculadora...");
            } else {
                System.out.println("Opção invalida! Tente novamente.");
            }

        }while(opcao != 5);
    }
}


