//Escreva um algoritmo que leia dois números digitados pelo usuário e exiba oresultado da sua soma


import java.util.Scanner;


public class ex2 {


    public static void somar (String[] args) {
        Scanner num = new Scanner(System.in);


            System.out.println("infrome o primeiro numero: ");
            int num1 = num.nextInt();


            System.out.println("infrome o segundo numero: ");
            int num2 = num.nextInt();


            int soma = num1 + num2;


            System.out.println("o resultado da soma é: " + soma);






            num.close();


    }
    }
