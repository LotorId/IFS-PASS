package atividades.atividade06;

import atividades.atividade06.classes.GerenciadorProxy;
import atividades.atividade06.classes.GerenciadorUsuario;

public class Main {
    public static void main(String[] args) {

        // Usuario nao permitido
        GerenciadorUsuario gerenciador = new GerenciadorProxy("Carlos", 123);
        gerenciador.criarArquivo("Titulo", "Oi");

        // Usuario permitido
        gerenciador = new GerenciadorProxy("admin", 123);
        gerenciador.criarArquivo("Titulo", "Oi");
        gerenciador.lerArquivo("Titulo");
    }
}
