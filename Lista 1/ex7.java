//7. Escreva um algoritmo que leia um número e diga, através de uma mensagem, seeste número está no intervalo entre 100 e 200.
// Caso o número esteja fora do intervaloo usuário também deverá ser informado.


import java.util.Scanner;


public class ex7 {
    public static void intervalo (String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();


        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo entre 100 e 200.");
        } else {
            System.out.println("O número está fora do intervalo entre 100 e 200.");
        }
    }
}
