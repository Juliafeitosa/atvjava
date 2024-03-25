//16. Elabore um algoritmo que receba três notas de um aluno e retorne a sua médiaaritmética.
//Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83


import java.util.Scanner;


public class Ex16 {
    public static void main (String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();


        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();


        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();


        double media = (nota1 + nota2 + nota3) / 3;


        System.out.println("Média aritmética: " + media);
    }
}

