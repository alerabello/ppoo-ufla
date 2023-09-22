import java.util.Scanner;

public class TesteToleranciaGlicose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o nome do paciente
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        // Solicita ao usuário a quantidade de amostras coletadas
        System.out.print("Entre com a quantidade de amostras coletadas: ");
        int n = scanner.nextInt();

        // Cria um array para armazenar os resultados das amostras 
        double[] resultados = new double[n];

        // Solicita ao usuário que insira os resultados das amostras

        // >>> INSERIR NUMEROS COM (.) POR DEFAULT e não usar (,) <<< 
        for (int i = 0; i < n; i++) {
            System.out.print("Insira o resultado do teste " + (i + 1) + ": ");
            resultados[i] = scanner.nextDouble();
        }

        // Calcula a média dos resultados das amostras
        double soma = 0;
        for (double resultado : resultados) {
            soma += resultado;
        }
        double media = soma / n;

        // Determina o diagnóstico com base na média
        String diagnostico;
        if (media < 140) {
            diagnostico = "Glicemia normal";
        } else if (media >= 140 && media < 200) {
            diagnostico = "Risco de diabetes";
        } else {
            diagnostico = "Diabetes Mellitus";
        }

        // Exibe o relatório final
        System.out.println("############### RELATÓRIO FINAL ###############");
        System.out.println("Nome do paciente: " + nome);
        System.out.println("Resultado médio = " + media);
        System.out.println("Diagnóstico: " + diagnostico);

        scanner.close();
    }
}