package avaliacoes.avaliacao1.classes;

import avaliacoes.avaliacao1.interfaces.Animal;
import avaliacoes.avaliacao1.interfaces.Prototype;

public class Cachorro implements Animal, Prototype {

    public int numeroPernas;
    public String tipoAlimentacao;

    public Cachorro() {
        emitirSom();
    }

    public Cachorro(Cachorro prototype) {
        this.tipoAlimentacao = prototype.tipoAlimentacao;
        this.numeroPernas = prototype.numeroPernas;
    }

    @Override
    public void emitirSom() {
        System.out.println("AUAU!");
    }

    @Override
    public Prototype clonar() {
        return new Cachorro(this);
    }

    @Override
    public boolean saoClones(Animal animal) {
        Cachorro cachorro = (Cachorro) animal;
        return cachorro.numeroPernas == this.numeroPernas && cachorro.tipoAlimentacao == this.tipoAlimentacao;
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
        return "cachorro{" +
                "numeroPernas=" + numeroPernas +
                ", tipoAlimentacao='" + tipoAlimentacao + '\'' +
                '}';
    }
}
