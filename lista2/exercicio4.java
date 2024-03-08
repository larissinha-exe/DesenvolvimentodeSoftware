/*Escreva uma função que recebe um vetor de float e retorna a soma de todas as posições dele*/

public class exercicio4 {
    public static void main(String[] args) {
        float[] vetor = {1.5f, 2.3f, 4.7f, 6.2f}; 
        System.out.println("A soma dos elementos do vetor é: " + somarElementosVetor(vetor));
    }

    public static float somarElementosVetor(float[] vetor) {
        float soma = 0f; 
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i]; 
        }
        return soma;
    }
}