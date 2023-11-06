package avaliacoes.avaliacao1.classes;

import avaliacoes.avaliacao1.interfaces.Animal;
import avaliacoes.avaliacao1.interfaces.Prototype;

public class Elefante implements Animal, Prototype {

    public int numeroPernas;
    public String tipoAlimentacao;

    public Elefante() {
        emitirSom();
    }

    public Elefante(Elefante prototype) {
        this.tipoAlimentacao = prototype.tipoAlimentacao;
        this.numeroPernas = prototype.numeroPernas;
    }

    @Override
    public void emitirSom() {
        System.out.println("FUUMM!");
    }

    @Override
    public Prototype clonar() {
        return new Elefante(this);
    }

    @Override
    public boolean saoClones(Animal animal) {
        Elefante elefante = (Elefante) animal;
        return elefante.numeroPernas == this.numeroPernas && elefante.tipoAlimentacao == this.tipoAlimentacao;
    }

    public int getNumeroPernas() {
        return numeroPernas;
    }

    public void setNumeroPernas(int numeroPernas) {
        this.numeroPernas = numeroPernas;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }

    @Override
    public String toString() {
        return "elefante{" +
                "numeroPernas=" + numeroPernas +
                ", tipoAlimentacao='" + tipoAlimentacao + '\'' +
                '}';
    }
}
