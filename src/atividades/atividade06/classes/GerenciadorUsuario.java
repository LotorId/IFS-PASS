package atividades.atividade06.classes;

import java.util.ArrayList;

public class GerenciadorUsuario {

    private ArrayList<Arquivo> listaArquivos;

    public GerenciadorUsuario() {
        this.listaArquivos = new ArrayList<Arquivo>();
    }

    public void criarArquivo(String titulo, String conteudo) {
        listaArquivos.add(new Arquivo(titulo, conteudo));
        System.out.println("Arquivo criado!");
    }

    public void lerArquivo(String titulo) {
        System.out.println("Arquivo lido!");
        for (Arquivo arquivo : listaArquivos) {
            System.out.println(arquivo.getTitulo() + ": " + arquivo.getConteudo());
        }
    }

    public void atualizarArquivo(String titulo, String conteudo) {
        System.out.println("Arquivo atualizado!");
    }

    public void excluirArquivo(String titulo, String conteudo) {
        System.out.println("Arquivo excluido!");
    }
}
