//19. Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seuvolume calculado de acordo com a seguinte fórmula:
// volume = 3.14 * raio2 * altura;Exemplo: raio = 10, altura = 15. Volume = 4710


import java.util.Scanner;


public class ex19 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do cilindro: ");
        double raio = scanner.nextDouble();
       
        System.out.print("Digite a altura do cilindro: ");
        double altura = scanner.nextDouble();


        double volume = 3.14 * raio * raio * altura;


        System.out.println("Volume do cilindro: " + volume);
    }
}
