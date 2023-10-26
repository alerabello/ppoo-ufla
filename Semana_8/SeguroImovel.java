import java.util.ArrayList;

// Interface que define o método para calcular o prêmio do seguro
interface Segurado {
    double calcularPremio();
}

// Classe para representar um seguro Imovel
class SeguroImovel implements Segurado {
    private Imovel imovel;

    public SeguroImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    @Override
    public double calcularPremio() {
        if ("casa".equalsIgnoreCase(imovel.getTipoImovel())) {
            if (imovel.isCondominioFechado()) {
                return 5 * imovel.getTamanho();
            } else {
                return 7 * imovel.getTamanho();
            }
        } else if ("apartamento".equalsIgnoreCase(imovel.getTipoImovel())) {
            if (imovel.getNumAndaresPredio() < 4) {
                return 3 * imovel.getTamanho();
            } else {
                return 4 * imovel.getTamanho();
            }
        }
        return 0; // Tipo de imóvel desconhecido
    }

    @Override
    public String toString() {
        return "Seguro Imovel - Tipo de Imóvel: " + imovel.getTipoImovel() + ", Tamanho: " + imovel.getTamanho() +
                ", Condomínio Fechado: " + imovel.isCondominioFechado() + ", Número de Andares: " + imovel.getNumAndaresPredio() +
                ", Prêmio: R$" + calcularPremio();
    }
}