//17. Elabore um algoritmo que receba três notas de um aluno os pesos referentes acada nota e retorne a sua média ponderada.
//Veja o cálculo da média ponderada:Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3peso1 + peso2 + peso3Exemplo:
// nota1 = 10, nota2 = 5.5, nota3 = 8, peso1 = 5, peso2 = 3, peso3 = 2Média ponderada = 8.25


import java.util.Scanner;


public class Ex17 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");


        double nota1 = scanner.nextDouble();


        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = scanner.nextDouble();


        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();


        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = scanner.nextDouble();


        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
       
        System.out.print("Digite o peso da terceira nota: ");
        double peso3 = scanner.nextDouble();


        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);


        System.out.println("Média ponderada: " + mediaPonderada);
    }
}


