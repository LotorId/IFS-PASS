package atividades.atividade02;

public class FabricaModerno implements MovelFactory{
    @Override
    public void createCadeira() {
        new CadeiraModerno();
    }

    @Override
    public void createSofa() {
        new SofaModerno();
    }

    @Override
    public void createMesa() {
        new MesaDeCentroModerno();
    }
}
