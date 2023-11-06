package atividades.atividade02;

public class Cliente {
    public static void main(String[] args) {

        FabricaModerno fabricaModerno = new FabricaModerno();
        FabricaVitoriano fabricaVitoriano = new FabricaVitoriano();
        FabricaArtDeco fabricaArtDeco = new FabricaArtDeco();

        fabricaModerno.createMesa();
    }
}
