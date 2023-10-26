import java.util.ArrayList;

// Interface que define o método para calcular o prêmio do seguro
interface Seguro {
    double calcularPremio();
}


// Classe para representar um seguro residencial
class SeguroResidencial implements Seguro {
    private String tipoImovel;
    private int tamanho;
    private boolean condominioFechado;
    private int numAndaresPredio;

    public SeguroResidencial(String tipoImovel, int tamanho, boolean condominioFechado, int numAndaresPredio) {
        this.tipoImovel = tipoImovel;
        this.tamanho = tamanho;
        this.condominioFechado = condominioFechado;
        this.numAndaresPredio = numAndaresPredio;
    }

    @Override
    public double calcularPremio() {
        if ("casa".equalsIgnoreCase(tipoImovel)) {
            if (condominioFechado) {
                return 5 * tamanho;
            } else {
                return 7 * tamanho;
            }
        } else if ("apartamento".equalsIgnoreCase(tipoImovel)) {
            if (numAndaresPredio < 4) {
                return 3 * tamanho;
            } else {
                return 4 * tamanho;
            }
        }
        return 0; // Tipo de imóvel desconhecido
    }

    @Override
    public String toString() {
        return "Seguro Residencial - Tipo de Imóvel: " + tipoImovel + ", Tamanho: " + tamanho +
                ", Condomínio Fechado: " + condominioFechado + ", Número de Andares: " + numAndaresPredio +
                ", Prêmio: R$" + calcularPremio();
    }
}
