// Classe Apartamento herda de Imovel
class Apartamento extends Imovel {
    public Apartamento(String tipoImovel, int tamanho, int numAndaresPredio) {
        super(tipoImovel, tamanho, numAndaresPredio, false);
    }
}