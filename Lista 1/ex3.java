 //escreva um algoritmo que leia os valores de dois números inteiros distintos nasvariáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informarao usuário que a sequência de números informados é inválida


import java.util.Scanner;


public class ex3 {


    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);


            System.out.println("infrome o primeiro numero: ");
            int A = num.nextInt();


            System.out.println("infrome o segundo numero: ");
            int B = num.nextInt();


            if (A == B) {
                System.out.println("sequencia de numeros é invalida.");
            } else if (A > B) {
                System.out.println("o maior numero é: " + A);
            } else {
                System.out.println("o maior numero é: " + B);






            num.close();


        }
    }
}

    

