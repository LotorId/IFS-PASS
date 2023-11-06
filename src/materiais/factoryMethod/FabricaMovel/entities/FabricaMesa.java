package materiais.factoryMethod.FabricaMovel.entities;

public class FabricaMesa implements MovelFactory {

    @Override
    public void createMovel(String modelo) {
        if(modelo.equalsIgnoreCase("moderno")){
            new MesaModerna();
        }else if(modelo.equalsIgnoreCase("vitoriano")){
            new MesaVitoriana();
        }else if (modelo.equalsIgnoreCase("artDeco")) {
            new MesaArtDeco();
        }else {
            System.out.println("Modelo desconhecido");
        }
    }

}

