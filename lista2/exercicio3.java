/*Escreva uma função que recebe um vetor de inteiros e retorna o maior número do vetor. */

public class exercicio3 {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 8, 1, 3, 9, 4}; // Exemplo de vetor
        System.out.println("O maior número do vetor é: " + encontrarMaiorNumero(vetor));
    }

    public static int encontrarMaiorNumero(int[] vetor) {
        if (vetor == null || vetor.length == 0) {
            throw new IllegalArgumentException("O vetor não pode ser nulo ou vazio.");
        }

        int maior = vetor[0]; // Assume que o primeiro elemento é o maior inicialmente
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i]; // Atualiza o maior número encontrado
            }
        }
        return maior; // Retorna o maior número encontrado no vetor
    }
}