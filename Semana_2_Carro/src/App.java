public class App {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", 80);
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Velocidade: " + carro.getVelocidade());
    //Passo 3 - Acelerando
        carro.acelerar();
        System.out.println("Velocidade após acelerar: " + carro.getVelocidade());

        carro.reduzir();
        System.out.println("Velocidade após reduzir: " + carro.getVelocidade());
    //Passo 4 - Obtendo dados do usuário

    }
}