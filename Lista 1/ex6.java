//6. Ler uma temperatura em graus Celsius e apresentá-la convertida em grausFahrenheit. A fórmula de conversão é://
//F = (9 * C + 160) / 5


import java.util.Scanner;




public class Ex6 {
    public static void celsius (String[] args) {
        Scanner scanner = new Scanner(System.in);




        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();




        double fahrenheit = (9 * celsius + 160) / 5;




        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);




        scanner.close();
    }
}
