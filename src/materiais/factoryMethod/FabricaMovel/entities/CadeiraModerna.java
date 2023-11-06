package materiais.factoryMethod.FabricaMovel.entities;

public class CadeiraModerna implements Movel {

    public CadeiraModerna(){
        create();
    }

    @Override
    public void create() {
        System.out.println("Cadeira Moderna criada!");
    }
}
