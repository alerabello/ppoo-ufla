import java.util.Scanner;

class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static Agenda agenda = new Agenda();

    public static void main(String[] args) {
        int opcao = 0;
        do {
            System.out.println("=======Menu de Opções=======");
            System.out.println("1 - Cadastrar uma pessoa física");
            System.out.println("2 - Cadastrar uma pessoa jurídica");
            System.out.println("3 - Remover um contato");
            System.out.println("4 - Imprimir dados da agenda");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

            switch (opcao) {
                case 1:
                    cadastrarPessoaFisica();
                    break;
                case 2:
                    cadastrarPessoaJuridica();
                    break;
                case 3:
                    removerContato();
                    break;
                case 4:
                    imprimirContatos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println();
        } while (opcao != 5);
    }

    private static void cadastrarPessoaFisica() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Estado Civil: ");
        String estadoCivil = scanner.nextLine();

        PessoaFisica pessoaFisica = new PessoaFisica(nome, endereco, email, cpf, estadoCivil);
        agenda.adicionarContato(pessoaFisica);
        System.out.println("Pessoa física cadastrada com sucesso!");
    }

    private static void cadastrarPessoaJuridica() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();
        System.out.print("Inscrição Estadual: ");
        int inscricaoEstadual = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, endereco, email, cnpj, inscricaoEstadual);
        agenda.adicionarContato(pessoaJuridica);
        System.out.println("Pessoa jurídica cadastrada com sucesso!");
    }

    private static void removerContato() {
        System.out.print("CPF ou CNPJ do contato a ser removido: ");
        String cpfOuCnpj = scanner.nextLine();
        agenda.removerContato(cpfOuCnpj);
    }

    private static void imprimirContatos() {
        agenda.imprimirContatos();
    }
}