import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
    // Passo 1 e 2 
        Carro carro = new Carro("Fusca", 80);
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Velocidade: " + carro.getVelocidade());
    //Passo 3 - Acelerando
        carro.acelerar();
        System.out.println("Velocidade após acelerar: " + carro.getVelocidade());

        carro.reduzir();
        System.out.println("Velocidade após reduzir: " + carro.getVelocidade());
        */
    //Passo 4 - Obtendo dados do usuário
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o modelo do carro:");
        String modelo = entrada.nextLine();

        System.out.println("Digite quantas vezes o carro deve acelerar:");
        int vezes = entrada.nextInt();

        Carro carro = new Carro(modelo, 10);
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Velocidade: " + carro.getVelocidade());

        for (int i = 0; i < vezes; i++) {
            carro.acelerar();
        }

        System.out.println("Velocidade após acelerar: " + carro.getVelocidade());

        entrada.close();
    }
}