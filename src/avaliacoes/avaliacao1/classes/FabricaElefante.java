package avaliacoes.avaliacao1.classes;

import avaliacoes.avaliacao1.interfaces.Animal;
import avaliacoes.avaliacao1.interfaces.FabricaAnimal;

public class FabricaElefante implements FabricaAnimal {
    @Override
    public Animal criarAnimal() {
        return new Elefante();
    }
}
