package ui;

import negocio.Filha;
import negocio.Filho;
import negocio.Pessoa;

public class Principal {
    public static void main(String[] args) {

        Pessoa Joao = new Filho("Joao");
        Filha patricia = new Filha("Patricia");
        Joao.cadastrarFilho(patricia);
        patricia.cadastrarFilho(new Filho("GriNaldo"));
        patricia.cadastrarFilho(new Filho("GriMaldo"));
        patricia.cadastrarFilho(new Filha("JUça"));
        patricia.cadastrarFilho(new Filho("PriMaldo"));
        patricia.cadastrarFilho(new Filha("Joana"));

        Pessoa primaldo = patricia.getFilhos().get(3);
        primaldo.listarAncestral();








    }
}
