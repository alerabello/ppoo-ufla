import java.util.ArrayList;
import java.util.Scanner;

public class CaixaEletronico {
    private ArrayList<ContaBancaria> contas;
    private Scanner scanner;

    public CaixaEletronico() {
        this.contas = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void menu() {
        int opcao;
        do {
            System.out.println("1. Criar Conta\n2. Consultar Saldo\n3. Depositar\n4. Sacar\n5. Listar Contas\n6. Sair");
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
                    listarContas();
                    break;
                    case 6:
                    removerConta();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 7);
    }

    private void criarConta() {
        System.out.println("Informe o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a linha restante
    
        System.out.println("Informe o nome do cliente:");
        String nomeCliente = scanner.nextLine();
    
        System.out.println("Informe o limite da conta:");
        double limite = scanner.nextDouble();
    
        ContaBancaria novaConta = new ContaBancaria(numero, nomeCliente, limite);
        this.contas.add(novaConta);
    }

    private void consultarSaldo() {
        System.out.println("Informe o número da conta:");
        int numeroConta = scanner.nextInt();
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            System.out.println("Saldo: " + conta.consultarSaldo());
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    private void depositar() {
        System.out.println("Informe o número da conta:");
        int numeroConta = scanner.nextInt();
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            System.out.println("Informe o valor a depositar:");
            double valor = scanner.nextDouble();
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    private void sacar() {
        System.out.println("Informe o número da conta:");
        int numeroConta = scanner.nextInt();
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            System.out.println("Informe o valor a sacar:");
            double valor = scanner.nextDouble();
            if (conta.sacar(valor)) {
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public void listarContas() {
        for (ContaBancaria conta : contas) {
            System.out.println("Número da conta: " + conta.getNumero() + ", Nome do cliente: " + conta.getNomeCliente());
        }
    }

    public ContaBancaria buscarConta(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
    
    private void removerConta() {
        System.out.println("Informe o número da conta a ser removida:");
        int numeroConta = scanner.nextInt();
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            double saldo = conta.consultarSaldo();
            if (saldo > 0) {
                System.out.println("Não é possível cancelar contas com saldo disponível.");
            } else if (saldo < 0) {
                System.out.println("Não é possível cancelar contas em débito.");
            } else {
                contas.remove(conta);
                System.out.println("Conta removida com sucesso!");
            }
        } else {
            System.out.println("Conta não encontrada!");
        }
    }
}