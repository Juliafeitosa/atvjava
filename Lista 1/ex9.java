//9. Leia dois números nas variáveis A e B e identifique se os valores são iguais oudiferentes.
//Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.Caso sejam diferentes, informe que são diferentes e qual número é o maior


import java.util.Scanner;


public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();


        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();


        if (a == b) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            System.out.println("O maior número é: " + Math.max(a, b));
        }
    }
}

