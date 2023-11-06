package avaliacoes.avaliacao1.classes;

import avaliacoes.avaliacao1.interfaces.FabricaAnimal;

public class Logistica {

    public FabricaAnimal criarFabrica(String tipo) {
        if (tipo.equalsIgnoreCase("gato")) {
            return new FabricaGato();
        } else if (tipo.equalsIgnoreCase("elefante")) {
            return new FabricaElefante();
        } else if (tipo.equalsIgnoreCase("cachorro")) {
            return new FabricaCachorro();
        }

        throw new RuntimeException("Nao ha como criar este tipo de fabrica");
    }
}
