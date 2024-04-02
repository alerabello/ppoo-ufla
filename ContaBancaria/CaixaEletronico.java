import java.util.Scanner;

public class CaixaEletronico {
    private ContaBancaria conta;
    private Scanner scanner;

    public CaixaEletronico() {
        this.scanner = new Scanner(System.in);
    }


    public void menu() {
        int opcao;
        do {
            System.out.println("1. Criar Conta\n2. Consultar Saldo\n3. Depositar\n4. Sacar\n5. Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    consultarSaldo();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    sacar();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }

    private void criarConta() {
        System.out.println("Informe o limite da conta:");
        double limite = scanner.nextDouble();
        this.conta = new ContaBancaria(limite);
    }

    private void consultarSaldo() {
        if (conta != null) {
            System.out.println("Saldo: " + conta.consultarSaldo());
        } else {
            System.out.println("Conta não criada!");
        }
    }

    private void depositar() {
        if (conta != null) {
            System.out.println("Informe o valor a depositar:");
            double valor = scanner.nextDouble();
            conta.depositar(valor);
        } else {
            System.out.println("Conta não criada!");
        }
    }

    private void sacar() {
        if (conta != null) {
            System.out.println("Informe o valor a sacar:");
            double valor = scanner.nextDouble();
            if (conta.sacar(valor)) {
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Conta não criada!");
        }
    }
}