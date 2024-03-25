//Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração,multiplicação e a divisão dos números lidos.


import java.util.Scanner;


public class Ex4 {


    public static void calculadora (String[] args) {
        Scanner num = new Scanner(System.in);


            System.out.println("infrome o primeiro numero: ");
            int num1 = num.nextInt();


            System.out.println("infrome o segundo numero: ");
            int num2 = num.nextInt();


            int soma = num1 + num2;
            int subtração = num1 - num2;
            int multiplicação = num1 * num2;
            int divisão = num1 / num2;


            System.out.println("A soma dos numeros é: " +soma);
            System.out.println("A subtração dos numeros é: " +subtração);
            System.out.println("A multiplicação dos numeros é: " +multiplicação);
            System.out.println("A divisão dos numeros é: " +divisão);


            num.close();


        }
    }
