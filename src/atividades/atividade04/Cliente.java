package atividades.atividade04;

public class Cliente {
    public static void main(String[] args) {

        Diretor diretor = new Diretor();
        PersonagemBuilder personagemBuilderMago = new PersonagemBuilder();
        PersonagemBuilder personagemBuilderSoldado = new PersonagemBuilder();

        diretor.construirMago(personagemBuilderMago);
        Personagem mago = personagemBuilderMago.getPersonagem();
        mago.setNome("Carlos");

        diretor.construirSoldado(personagemBuilderSoldado);
        Personagem soldado = personagemBuilderSoldado.getPersonagem();
        soldado.setNome("Alberto");

        System.out.println(mago.toString());
        System.out.println(soldado.toString());
    }
}
