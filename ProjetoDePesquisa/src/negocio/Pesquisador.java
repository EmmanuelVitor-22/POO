package negocio;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Pesquisador {
    private String nome;
    private  Coordenador coordenador;
    private  Pesquisador pesquisador;
    private int qtdDePesquisadores;
    ArrayList<Pesquisador> pesquisadores = new ArrayList<Pesquisador>();

    public Pesquisador(String nome, Coordenador coordenador, Pesquisador pesquisador, int qtdDePesquisadores) {
        this.nome = nome;
        this.coordenador = coordenador;
        this.pesquisador = pesquisador;
        this.qtdDePesquisadores = qtdDePesquisadores;
    }

    public Pesquisador() {}
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Coordenador getCoordenador() {
        return coordenador;
    }
    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }
    public Pesquisador getPesquisador() {
        return pesquisador;
    }
    public void setPesquisador(Pesquisador pesquisador) {
        this.pesquisador = pesquisador;
    }
    public int getQtdDePesquisadores() {
        return qtdDePesquisadores;
    }
    public void setQtdDePesquisadores(int qtdDePesquisadores) {
        this.qtdDePesquisadores = qtdDePesquisadores;
    }
    public ArrayList<Pesquisador> getPesquisadores() {
        return pesquisadores;
    }

    public void inserirPesquisador(){
        if(Objects.isNull(pesquisador)){
            pesquisadores.add(this.setPesquisador());
        }
    }




}
