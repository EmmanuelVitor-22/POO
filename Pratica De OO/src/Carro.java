abstract class Carro {
    String modelo;
    String cor;
    int ano;
    int  velocidadeMaxima;

    public Carro(String modelo, String cor, int ano, int velocidadeMaxima) {
        this.modelo = modelo;
        this.cor =  cor;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {

    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    void tempoDeAceleracao(int velocidadeMaxima){

    }
}
