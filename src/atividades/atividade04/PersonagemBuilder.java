package atividades.atividade04;

public class PersonagemBuilder implements IPersonagemBuilder {

    private Personagem personagem;

    public PersonagemBuilder() {
        this.personagem = new Personagem();
    }

    @Override
    public void construirNome(String nome) {
        this.personagem.nome = nome;
    }

    @Override
    public void construirClasse(String classe) {
        this.personagem.classe = classe;
    }

    @Override
    public void construirNivel(int nivel) {
        this.personagem.nivel = nivel;
    }

    @Override
    public void construirArma(String arma) {
        this.personagem.arma = arma;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }
}
