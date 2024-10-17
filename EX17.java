import javax.swing.JOptionPane;

public class EX17 {
    public static void main(String[] args) {

        // Declara as variaveis auxiliares
        int Numero1 = 0;
        int Numero2 = 1;
        int Auxiliar = Numero2;
        
        // Declara e pede o número de valores a serem exibidos
        int Valores = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos números da sequência de fibonacci gostaria de ver : "));

        // Vetor para armazenar os resultados
        String vetor = Numero1 + ", " + Numero2 + ", ";

        // Laço de repetição para calcular a sequência de fibonacci
        for (int i = 2; i < Valores; i++) {

            Auxiliar = Numero2;
            Numero2 += Numero1;
            Numero1 = Auxiliar;
            vetor += Numero2 + ", ";
        }
        // Imprime os números da sequência
            JOptionPane.showMessageDialog(null, vetor);
    }
}
