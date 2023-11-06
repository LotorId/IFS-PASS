package avaliacoes.avaliacao1.classes;

import avaliacoes.avaliacao1.interfaces.Animal;
import avaliacoes.avaliacao1.interfaces.Prototype;

public class Gato implements Animal, Prototype {

    public int numeroPernas;
    public String tipoAlimentacao;

    public Gato() {
        emitirSom();
    }

    public Gato(Gato prototype) {
        this.tipoAlimentacao = prototype.tipoAlimentacao;
        this.numeroPernas = prototype.numeroPernas;
    }

    @Override
    public void emitirSom() {
        System.out.println("MIAU!");
    }

    @Override
    public Prototype clonar() {
        return new Gato(this);
    }

    @Override
    public boolean saoClones(Animal animal) {
        Gato gato = (Gato) animal;
        return gato.numeroPernas == this.numeroPernas && gato.tipoAlimentacao == this.tipoAlimentacao;
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
        return "Gato{" +
                "numeroPernas=" + numeroPernas +
                ", tipoAlimentacao='" + tipoAlimentacao + '\'' +
                '}';
    }
}
