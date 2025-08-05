package questao07;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triangulo: ");
        float ladoA =entrada.nextFloat();

        System.out.println("Digite o segundo lado do triangulo: ");
        float ladoB =entrada.nextFloat();

        System.out.println("Digite o terceiro lado do triangulo: ");
        float ladoC =entrada.nextFloat();

        if(ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB){
            if(ladoA == ladoB && ladoB == ladoC){
                System.out.println("Esse triangulo é um: Equilátero!");
            }else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
                System.out.println("Esse triangulo é um: Isósceles!");
            }else{
                System.out.println("Esse triangulo é um: Escaleno!");
            }
        }else{
            System.out.println("Os lados não formam um triangulo!");
        }

        entrada.close();
    }
}
