package negocio;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Pessoa {
private String name;
private Pessoa ancestral;

private ArrayList<Pessoa> filhos = new ArrayList<Pessoa>();

    public Pessoa(String name) {
        this.setName(name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Pessoa getAncestral() {
        return ancestral;
    }

    public void setAncestral(Pessoa ancestral) {
        this.ancestral = ancestral;
    }

    public ArrayList<Pessoa> getFilhos() {
        return filhos;
    }
   public void listarAncestral(){
     if (!Objects.isNull(ancestral)){
         ancestral.listarAncestral();
     }
     System.out.print(name+" ->");
 }
public  abstract void cadastrarFilho(Pessoa pessoa);
}
