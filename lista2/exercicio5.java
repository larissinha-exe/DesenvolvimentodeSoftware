/*Escreva uma função que receba os dados de um cliente e retorne elesformatados, mostrado um dado por linha.ExemploNome: JoãoSobrenome: SilvaDDD: 41Telefone: 12346543 */

public class exercicio5 {
    public static void main(String[] args) {
        // Exemplo de dados do cliente
        String nome = "João";
        String sobrenome = "Silva";
        int ddd = 41;
        int telefone = 12346543;

        // Chamando a função e imprimindo os dados formatados
        System.out.println(formatarDadosCliente(nome, sobrenome, ddd, telefone));
    }

    public static String formatarDadosCliente(String nome, String sobrenome, int ddd, int telefone) {
        // Construindo a string formatada com os dados do cliente
        StringBuilder dadosFormatados = new StringBuilder();
        dadosFormatados.append("Nome: ").append(nome).append("\n");
        dadosFormatados.append("Sobrenome: ").append(sobrenome).append("\n");
        dadosFormatados.append("DDD: ").append(ddd).append("\n");
        dadosFormatados.append("Telefone: ").append(telefone).append("\n");
        return dadosFormatados.toString();
    }
}
