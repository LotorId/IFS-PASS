package materiais.factoryMethod.FabricaMovel.entities;

public class FabricaSofa implements MovelFactory {

    @Override
    public void createMovel(String modelo) {
        if(modelo.equalsIgnoreCase("moderno")){
            new SofaModerno();
        }else if(modelo.equalsIgnoreCase("vitoriano")){
            new SofaVitoriano();
        }else if (modelo.equalsIgnoreCase("artDeco")) {
            new SofaArtDeco();
        }else {
            System.out.println("Modelo desconhecido");
        }
    }

}
