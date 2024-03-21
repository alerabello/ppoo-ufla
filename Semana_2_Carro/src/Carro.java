public class Carro {
    private String modelo;
    private int velocidade;
    
    // Construtor
    public Carro(String modelo, int velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    // Método de acesso para obter o modelo
    public String getModelo() {
        return this.modelo;
    }

    // Método de acesso para definir o modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método de acesso para obter a velocidade
    public int getVelocidade() {
        return this.velocidade;
    }

    // Método de acesso para definir a velocidade
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    // Método de acesso para Acelerar
    public void acelerar() {
        velocidade += 5;
    }
    // Método de acesso para Reduzir
    public void reduzir() {
        if (velocidade >= 5) {
            velocidade -= 5;
        }
    }
}