package materiais.factoryMethod.FabricaMovel.entities;

public class CadeiraVitoriana implements Movel{

    public CadeiraVitoriana(){
        create();
    }

    @Override
    public void create() {
        System.out.println("Cadeira Vitoriana criada!");
    }
}
