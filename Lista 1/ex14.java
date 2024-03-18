//14. A expressão an = a1 + (n – 1) * r é denominada termo geral da ProgressãoAritmética (PA). Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo),
//r é a razão e a1 é o primeiro termo da Progressão Aritmética.
//Escreva um algoritmoque encontre o n-ésimo termo de uma progressão aritmética. Exemplo: a1 = 10, n =7, r = 3. Resultado: an = 28


public class ex14 {
    public static void main(String[] args) {
        int A1 = 10;
        int N = 7;
        int R = 3;


        int An = 1 + (N - 1) * R;


        System.out.println("Resultado: " + An);
    }
}
