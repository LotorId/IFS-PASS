package atividades.atividadeNivelamento;

import atividades.atividadeNivelamento.exceptions.LivroJaEmprestado;
import atividades.atividadeNivelamento.exceptions.LivroNaoEmprestado;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("""
                    - MENU ----------------------\s
                    1 - Listar livros\s
                    2 - Listar usuarios\s
                    3 - Devolver livro\s
                    4 - Emprestar livro\s
                    5 - Buscar livro por titulo\s
                    6 - Listar livros disponiveis\s
                    -----------------------------
                    """);
            System.out.println("Insira a opcao: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    biblioteca.listarLivros();
                }
                case 2 -> {
                    biblioteca.listarUsuarios();
                }
                case 3 -> {
                    System.out.println("Insira o codigo do usuario: ");
                    int userId = scanner.nextInt();

                    System.out.println("Insira o codigo do livro: ");
                    int bookId = scanner.nextInt();

                    try {
                        biblioteca.devolverLivro(biblioteca.buscarUsuario(userId), biblioteca.buscarLivro(bookId));
                    } catch (LivroNaoEmprestado e) {
                        System.out.println(e.getMessage());
                    }

                }
                case 4 -> {
                    System.out.println("Insira o codigo do usuario: ");
                    int userId = scanner.nextInt();

                    System.out.println("Insira o codigo do livro: ");
                    int bookId = scanner.nextInt();

                    try {
                        biblioteca.emprestarLivro(biblioteca.buscarUsuario(userId), biblioteca.buscarLivro(bookId));
                    } catch (LivroJaEmprestado e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 5 -> {
                    System.out.println("Insira o titulo do livro");
                    String titulo = scanner.next();

                    biblioteca.buscarLivroPorTitulo(titulo.toLowerCase());
                }
                case 6 -> {
                    System.out.println("Livros disponiveis");
                    biblioteca.mostrarLivrosDisponiveis();
                }
            }
        } while (option != -1);
    }
}
