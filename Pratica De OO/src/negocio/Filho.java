package negocio;

import java.util.Random;

public class Filho extends Pessoa {
    public Filho(String name) {
        super(name);
    }



    @Override
    public void cadastrarFilho(Pessoa pessoa) {

        if (super.getFilhos().size() == 1) {
            FilhoNatimorto natimorto = new FilhoNatimorto(pessoa.getName());
            natimorto.setAncestral(this);
            super.getFilhos().add(natimorto);

            System.out.println("Segundo filho, Ih MOóRREu "+ pessoa.getName());
        } else {
            pessoa.setAncestral(this);
            super.getFilhos().add(pessoa);
        }

    }
}
