//8. Escreva um algoritmo que leia um número e mostre uma mensagem caso estenúmero seja maior ou igual a 50, outra se ele for menor que 50.


import java.util.Scanner;


public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();


        if (numero >= 50) {
            System.out.println("O número é maior ou igual a 50.");
        } else {
            System.out.println("O número é menor que 50.");
        }
    }
}
