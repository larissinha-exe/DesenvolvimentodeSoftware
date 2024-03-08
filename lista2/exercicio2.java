/*Escreva uma função que recebe um inteiro e retorna o fatorial dele. */

public class exercicio2 {
    public static void main(String[] args){
        int num = 5;

        System.out.println("Fatorial de " + num + " é: " + calcularFatorial(num));
    }

    public static int calcularFatorial(int n) {
        if (n == 0) {
            return 1; // O fatorial de 0 é 1
        } else {
            int fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
} 