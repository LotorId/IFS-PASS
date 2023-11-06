package atividades.atividade02;

public class FabricaArtDeco implements MovelFactory{

    @Override
    public void createCadeira() {
        new CadeiraArtDeco();
    }

    @Override
    public void createSofa() {
        new SofaArtDeco();
    }

    @Override
    public void createMesa() {
        new MesaDeCentroArtDeco();
    }
}
