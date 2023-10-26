import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crie objetos de seguro de vida e seguro residencial
        Seguro seguroVida = new SeguroVida(35, "feminino");
        Seguro seguroCasa = new SeguroResidencial("casa", 200, true, 0);
        Seguro seguroApartamento = new SeguroResidencial("apartamento", 100, false, 5);

        // Adicione os objetos a um ArrayList
        ArrayList<Seguro> seguros = new ArrayList<>();
        seguros.add(seguroVida);
        seguros.add(seguroCasa);
        seguros.add(seguroApartamento);

        // Itere pelo ArrayList e imprima os detalhes de cada seguro
        for (Seguro seguro : seguros) {
            System.out.println(seguro.toString());
        }
    }
}