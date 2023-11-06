package atividades.atividadeNivelamento;

import java.util.ArrayList;
public class Usuario {

    public int id;
    public String nome;
    public ArrayList<Livro> livrosEmprestados = new ArrayList<>();

    // CONSTUTOR

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}
