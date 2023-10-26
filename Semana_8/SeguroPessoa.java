import java.util.ArrayList;

// Interface que define o método para calcular o prêmio do seguro
interface Segurado {
    double calcularPremio();
}

// Classe para representar um seguro de vida
class SeguroPessoa implements Segurado {
    private int idade;
    private String genero;

    public SeguroPessoa(int idade, String genero) {
        this.idade = idade;
        this.genero = genero;
    }

    @Override
    public double calcularPremio() {
        if (idade < 60) {
            return 100 + (idade / 10) * 100;
        } else {
            if ("masculino".equalsIgnoreCase(genero)) {
                return 800;
            } else {
                return 700;
            }
        }
    }

    @Override
    public String toString() {
        return "Seguro de Vida - Idade: " + idade + ", Gênero: " + genero + ", Prêmio: R$" + calcularPremio();
    }
}