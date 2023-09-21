class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque("fluxo");
        estoque.cadastrarProduto("Arroz", "Prato Fino", 250);
        estoque.cadastrarProduto("Arroz", "Tio Joao", 125);
        estoque.cadastrarProduto("Sabonete", "Dove", 50);
        estoque.cadastrarProduto("Sabonete", "Nivea", 25);
        estoque.cadastrarProduto("Sabonete", "Palmolive", 40);
        estoque.gerarRelatorio();
    }
}