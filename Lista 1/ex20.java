//20. Elabore um algoritmo que calcule a quantidade de litros de combustível gasta emuma viagem,
//utilizando um automóvel que faz 12km por litro e considerando que sãofornecidos o tempo em hora e a velocidade média da viagem


import java.util.Scanner;


public class ex20 {
    public static void litros(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tempo da viagem em horas: ");
        double tempoViagem = scanner.nextDouble();


        System.out.print("Digite a velocidade média em km/h: ");
        double velocidadeMedia = scanner.nextDouble();


        double distancia = tempoViagem * velocidadeMedia;
        double litrosConsumidos = distancia / 12;


        System.out.println("Quantidade de litros de combustível gasta: " + litrosConsumidos);
    }
}

