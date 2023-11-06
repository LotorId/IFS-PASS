package materiais.factoryMethod.FabricaMovel.entities;

public class FabricaCadeira implements MovelFactory {

    @Override
    public void createMovel(String modelo) {
        if(modelo.equalsIgnoreCase("moderno")){
            new CadeiraModerna();
        }else if(modelo.equalsIgnoreCase("vitoriano")){
            new CadeiraVitoriana();
        }else if (modelo.equalsIgnoreCase("artDeco")) {
            new CadeiraArtDeco();
        }else {
            System.out.println("Modelo desconhecido");
        }
    }

}
