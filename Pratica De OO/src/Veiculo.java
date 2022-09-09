abstract  class Veiculo {

    String modelo;
    String marca;
    double velocidadeMaxima;

    public Veiculo(String modelo, String marca, double velocidadeMaxima) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}

