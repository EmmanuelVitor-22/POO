package negocio;

import java.util.Random;

public class Filha extends Pessoa {

    public Filha(String name) {
        super(name);
    }
    @Override
    public void cadastrarFilho(Pessoa pessoa) {

        if (pessoa instanceof Filho){
            int chance = new Random().nextInt(2);
            if (chance == 1) {
                pessoa.setAncestral(this);
                super.getFilhos().add(pessoa);
            }else {
                FilhoNatimorto natimorto = new FilhoNatimorto(pessoa.getName());
                natimorto.setAncestral(this);
                super.getFilhos().add(natimorto);
            }
        }else {
            pessoa.setAncestral(this);
            super.getFilhos().add(pessoa);
        }
    }
}
