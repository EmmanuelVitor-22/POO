package negocio;

public  class FilhoNatimorto extends Pessoa  {

    public FilhoNatimorto(String name) {
        super(name);
    }

   public void cadastrarFilho(Pessoa pessoa){
        System.out.println("Não é possivel cadastrar um(a) filho(a)");
    }
}
