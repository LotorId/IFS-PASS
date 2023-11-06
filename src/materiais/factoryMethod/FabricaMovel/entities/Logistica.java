package materiais.factoryMethod.FabricaMovel.entities;

public class Logistica {
    public MovelFactory create(String modo) {
        MovelFactory fabrica;

        if (modo.equalsIgnoreCase("cadeira")) {
            fabrica = new FabricaCadeira();
        } else if (modo.equalsIgnoreCase("sofa")) {
            fabrica = new FabricaSofa();
        } else if (modo.equalsIgnoreCase("mesa")) {
            fabrica = new FabricaMesa();
        } else {
            throw new IllegalArgumentException("Tipo de fábrica inválido.");
        }

        return fabrica;
    }
}
