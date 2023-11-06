package materiais.factoryMethod.FabricaMovel.entities;

public class MesaModerna implements Movel{
    public MesaModerna(){
        create();

    }

    @Override
    public void create() {
        System.out.println("Mesa Moderna criada!");

    }
}
