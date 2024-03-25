//11. Escreva um algoritmo que leia três valores inteiros distintos e escreva-os emordem crescente


import java.util.Scanner;


public class Ex11 {
    public static void emordem(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        int Num1 = scanner.nextInt();


        System.out.print("Digite o segundo número: ");
        int Num2 = scanner.nextInt();


        System.out.print("Digite o terceiro número: ");
        int Num3 = scanner.nextInt();


        int menor = Math.min(Math.min(Num1, Num2), Num3);
        int medio = (Num1 + Num2 + Num3) - menor - Math.max(Math.max(Num1, Num2), Num3);
        int maior = Math.max(Math.max(Num1, Num2), Num3);


        System.out.println("Em ordem crescente: " + menor + ", " + medio + ", " + maior);
    }
}
