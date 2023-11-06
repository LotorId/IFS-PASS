package atividades.atividade04;

public class Diretor {

    public void construirMago(PersonagemBuilder builder) {
        builder.construirNome("");
        builder.construirClasse("Mago");
        builder.construirArma("Magia");
        builder.construirNivel(0);
    }

    public void construirSoldado(PersonagemBuilder builder) {
        builder.construirNome("");
        builder.construirClasse("Soldado");
        builder.construirArma("Espada");
        builder.construirNivel(0);
    }
}
