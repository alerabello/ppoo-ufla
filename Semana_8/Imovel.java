// Classe Imovel com atributos comuns
class Imovel {
    private String tipoImovel;
    private int tamanho;
    private int numAndaresPredio;
    private boolean condominioFechado;

    public Imovel(String tipoImovel, int tamanho, int numAndaresPredio, boolean condominioFechado) {
        this.tipoImovel = tipoImovel;
        this.tamanho = tamanho;
        this.numAndaresPredio = numAndaresPredio;
        this.condominioFechado = condominioFechado;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getNumAndaresPredio() {
        return numAndaresPredio;
    }

    public boolean isCondominioFechado() {
        return condominioFechado;
    }
}