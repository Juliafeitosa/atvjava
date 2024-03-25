//13. Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo deoperador em outra variável do tipo CARACTERE. Imprima o resultado da operação
//de A por B se o operador aritmético for válido; caso contrário deve ser impresso umamensagem de operador não definido. Tratar erro de divisão por zero.


import java.util.Scanner;


public class ex13 {
    public static void case(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();


        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o operador (+, -, *, /): ");
       
        char operador = scanner.next().charAt(0);


        double resultado;
        switch (operador) {
            case '+':
                resultado = a + b;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = a - b;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = a * b;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro divisão por zero!");
                }
                break;
            default:
                System.out.println("Operador inválido!");
        }
    }
}

