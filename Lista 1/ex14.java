//14. A expressão an = a1 + (n – 1) * r é denominada termo geral da ProgressãoAritmética (PA). Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo),
//r é a razão e a1 é o primeiro termo da Progressão Aritmética.
//Escreva um algoritmoque encontre o n-ésimo termo de uma progressão aritmética. Exemplo: a1 = 10, n =7, r = 3. Resultado: an = 28


public class Ex14 {


    public static int main(int a1, int n, int r) {
 
        return a1 + (n - 1) * r;
    }

    public static void main(String[] args) {

        int primeiroTermo = 3;
        int numeroTermoDesejado = 5;
        int razao = 2;

        int termoDesejado = termoN(primeiroTermo, numeroTermoDesejado, razao);

        System.out.println("O " + numeroTermoDesejado + "-ésimo termo da Progressão Aritmética é: " + termoDesejado);
    }
}
