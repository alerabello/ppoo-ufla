import java.util.ArrayList;

class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(String cpfOuCnpj) {
        for (Contato contato : contatos) {
            if (contato instanceof PessoaFisica) {
                PessoaFisica pessoaFisica = (PessoaFisica) contato;
                if (pessoaFisica.getCpf().equals(cpfOuCnpj)) {
                    contatos.remove(contato);
                    System.out.println("Contato removido com sucesso!");
                    return;
                }
            } else if (contato instanceof PessoaJuridica) {
                PessoaJuridica pessoaJuridica = (PessoaJuridica) contato;
                if (pessoaJuridica.getCnpj().equals(cpfOuCnpj)) {
                    contatos.remove(contato);
                    System.out.println("Contato removido com sucesso!");
                    return;
                }
            }
        }
        System.out.println("Contato não encontrado!");
    }

    public void imprimirContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato);
            System.out.println();
        }
    }
}