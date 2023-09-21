import java.util.ArrayList;
import java.util.Comparator;

public class Estoque {
    private String tipo;
    private ArrayList<Produto> produtos;

    
    public Estoque(String tipo) {
        this.tipo = tipo;
        produtos = new ArrayList<>();
    }

    public void cadastrarProduto(String nome, String marca, int quantidade) {
        Produto produto = new Produto(nome, marca, quantidade);
        if (!produtos.contains(produto)) {
            produtos.add(produto);
        }
    }

    public void gerarRelatorio() {
        System.out.println("Tipo do estoque: " + tipo);
        System.out.printf("%-15s%-15s%-15s\n", "Nome", "Marca", "Quantidade");
        produtos.sort(getComparador());
        for (Produto produto : produtos) {
            System.out.printf("%-15s%-15s%-15d\n", produto.getNome(), produto.getMarca(), produto.getQuantidade());
        }
    }

    private Comparator<Produto> getComparador() {
        return new Comparator<Produto>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                int nomeCompare = p1.getNome().compareTo(p2.getNome());
                if (nomeCompare != 0) {
                    return nomeCompare;
                }
                return p1.getMarca().compareTo(p2.getMarca());
            }
        };
    }
}