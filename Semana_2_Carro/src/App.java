import java.util.Scanner;

public class App {
    private Carro carro;
    private Scanner entrada = new Scanner(System.in);

    public void exibirMenu() {
        System.out.println("1. Criar o carro");
        System.out.println("2. Acelerar o carro");
        System.out.println("3. Reduzir a velocidade");
        System.out.println("4. Exibir os dados do carro");
        System.out.println("5. Sair");
        System.out.println("Digite sua opção:");
    }

    public void tratarOpcaoMenu(int opcao) {
        switch (opcao) {
            case 1:
                System.out.println("Digite o modelo do carro:");
                String modelo = entrada.nextLine();
                carro = new Carro(modelo, 10);
                break;
            case 2:
                if (carro != null) {
                    carro.acelerar();
                } else {
                    System.out.println("Carro não criado.");
                }
                break;
            case 3:
                if (carro != null) {
                    carro.reduzirVelocidade();
                } else {
                    System.out.println("Carro não criado.");
                }
                break;
            case 4:
                if (carro != null) {
                    System.out.println("Modelo: " + carro.getModelo());
                    System.out.println("Velocidade: " + carro.getVelocidade());
                } else {
                    System.out.println("Carro não criado.");
                }
                break;
            case 5:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    public static void main(String[] args) {
        App app = new App();
        int opcao;

        do {
            app.exibirMenu();
            opcao = app.entrada.nextInt();
            app.tratarOpcaoMenu(opcao);
        } while (opcao != 5);

        app.entrada.close();
    }
}