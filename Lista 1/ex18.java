//18. Elabore um algoritmo que receba três notas de um aluno e retorne a sua médiaharmônica.
//Média harmônica =31 + 1 + 1nota1 nota2 nota3Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8Média: 7.37


import java.util.Scanner;


public class Ex18 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();


        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();


        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();


        double mediaHarmonica = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));


        System.out.println("Média harmônica: " + mediaHarmonica);
    }
}

