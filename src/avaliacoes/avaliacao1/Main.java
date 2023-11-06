package avaliacoes.avaliacao1;

import avaliacoes.avaliacao1.classes.Elefante;
import avaliacoes.avaliacao1.classes.Gato;
import avaliacoes.avaliacao1.classes.Logistica;
import avaliacoes.avaliacao1.interfaces.FabricaAnimal;

public class Main {
    public static void main(String[] args) {

        // Logistica para gerenciar qual tipo de fabrica sera criada
        Logistica logistica = new Logistica();


        // Testando com a fabrica de GATOS
        FabricaAnimal fabricaGato = logistica.criarFabrica("gato");

        Gato gato1 = (Gato) fabricaGato.criarAnimal();
        gato1.setTipoAlimentacao("racao normal");
        gato1.setNumeroPernas(4);

        Gato gato2 = (Gato) fabricaGato.criarAnimal();
        gato2.setTipoAlimentacao("racao premium");
        gato2.setNumeroPernas(4);

        Gato gato3 = (Gato) gato1.clonar();

        // Comparando entre si
        System.out.println("Estes gatos sao clones? " + gato1.saoClones(gato2));
        System.out.println("Estes gatos sao clones? "  + gato1.saoClones(gato3));

        // Testando com a fabrica de ELEFANTES
        FabricaAnimal fabricaElefantes = logistica.criarFabrica("elefante");

        Elefante elefante1 = (Elefante) fabricaElefantes.criarAnimal();
        elefante1.setTipoAlimentacao("racao normal");
        elefante1.setNumeroPernas(4);

        Elefante elefante2 = (Elefante) fabricaElefantes.criarAnimal();
        elefante2.setTipoAlimentacao("racao normal");
        elefante2.setNumeroPernas(4);

        Elefante elefante3 = (Elefante) elefante1.clonar();

        // Comparando entre si
        System.out.println("Estes elefantes sao clones? " + elefante1.saoClones(elefante2));
        System.out.println("Estes elefantes sao clones? "  + elefante1.saoClones(elefante3));
    }
}
