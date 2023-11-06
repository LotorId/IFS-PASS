package atividades.atividade02;

public class FabricaVitoriano implements MovelFactory{
    @Override
    public void createCadeira() {
        new CadeiraVitoriano();
    }

    @Override
    public void createSofa() {
        new SofaVitoriano();
    }

    @Override
    public void createMesa() {
        new MesaDeCentroVitoriano();
    }
}
