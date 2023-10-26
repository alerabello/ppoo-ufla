// Classe Casa herda de Imovel
class Casa extends Imovel {
    public Casa(String tipoImovel, int tamanho, boolean condominioFechado) {
        super(tipoImovel, tamanho, 0, condominioFechado);
    }
}