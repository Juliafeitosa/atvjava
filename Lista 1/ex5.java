//5. Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valorda variável A passe a ser o valor da variável B e o valor da variável B passe a
//er ovalor da variável A. Apresentar uma mensagem com o valor original de cada variávele outra com os valores trocados.




import java.util.Scanner;

public class ex5 {

    public static void variavel (String[] args) {
        Scanner num = new Scanner(System.in);

       
        System.out.print("Digite o valor de A: ");
        int A = num.nextInt();
        

        System.out.print("Digite o valor de B: ");
        int B = num.nextInt();
 
        System.out.println("Valores originais:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        System.out.println("Valores trocados:");
        System.out.println("A = " + B);
        System.out.println("B = " + A);

        num.close();
        }
    }
