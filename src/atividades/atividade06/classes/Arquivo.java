package atividades.atividade06.classes;

public class Arquivo {

    private String titulo;
    private String conteudo;

    public Arquivo(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Arquivo{" +
                "titulo='" + titulo + '\'' +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
