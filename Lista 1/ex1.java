//Escreva um algoritmo que leia um número digitado pelo usuário e mostre amensagem “Número maior do que 10!”, caso este número seja maior, ou “Númeromenor ou igual a 10!”, caso este número seja menor ou igual


import java.util.Scanner;


public class Ex1 {


    public static void numeros (String[] args) {
        Scanner num = new Scanner(System.in);


        System.out.println("informe o numero: ");
        int num1 = num.nextInt();


        if (num1 > 10) {
            System.out.println("Número maior do que 10!");


        } else {
            System.out.println("Número menor ou igual a 10!");


            num.close();


        }
    }
}

