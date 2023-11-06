package atividades.atividadeNivelamento;

import atividades.atividadeNivelamento.exceptions.LivroJaEmprestado;
import atividades.atividadeNivelamento.exceptions.LivroNaoEmprestado;
import java.util.ArrayList;
public class Biblioteca {

    public ArrayList<Livro> livrosDisponiveis = new ArrayList<>();
    public ArrayList<Usuario> usuariosCadastrados = new ArrayList<>();

    // CONSTRUTOR E METODOS

    public Biblioteca() {
        livrosDisponiveis.add(new Livro(1, "Jogador n1", "Ernest Cline", 2011));
        livrosDisponiveis.add(new Livro(2, "Pequeno Principe", "Antoine de Saint-Exupéry", 1943));
        livrosDisponiveis.add(new Livro(3, "Coraline", "Neil Gaiman", 2002));
        usuariosCadastrados.add(new Usuario(1, "Carlos"));
        usuariosCadastrados.add(new Usuario(2, "Alberto"));
        usuariosCadastrados.add(new Usuario(3, "Junior"));
    }

    public Livro buscarLivro(int id) {
        Livro aux = null;

        for (Livro livro : livrosDisponiveis) {
            if (livro.id == id) {
                return livro;
            }
        }

        return aux;
    }

    public void buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livrosDisponiveis) {
            if (livro.titulo.toLowerCase().contains(titulo)) {
                System.out.println(livro.id + " - " + livro.titulo + " (" + livro.anoPublicacao + "/" + livro.autor + ")");
            }
        }
    }

    public Usuario buscarUsuario(int id) {
        Usuario aux = null;

        for (Usuario usuario : usuariosCadastrados) {
            if (usuario.id == id) {
                return usuario;
            }
        }

        return aux;
    }

    public void devolverLivro(Usuario usuario, Livro livro) throws LivroNaoEmprestado {
        ArrayList<Livro> aux = usuario.getLivrosEmprestados();
        boolean find = false;

        for (Livro livroAux : aux) {
            int count = 0;
            if (livroAux.titulo.equals(livro.titulo)) {
                aux.remove(count);
                find = true;
                break;
            }
            count++;
        }

        if (!find) {
            throw new LivroNaoEmprestado();
        }

        usuario.setLivrosEmprestados(aux);
        definirDisponivel(livro);
    }

    public void emprestarLivro(Usuario usuario, Livro livro) throws LivroJaEmprestado {
        ArrayList<Livro> aux = usuario.getLivrosEmprestados();
        boolean find = false;

        for (Livro livroAux : aux) {
            if (livroAux.titulo.equals(livro.titulo)) {
                find = true;
                break;
            }
        }

        if (find) {
            throw new LivroJaEmprestado();
        }

        if (livro.estaDisponivel()) {
            livro.setStatus("emprestado");
            aux.add(livro);
        }

        usuario.setLivrosEmprestados(aux);
        definirEmprestado(livro);
    }

    public void listarLivros() {
        for (Livro livro : livrosDisponiveis) {
            System.out.println(livro.id + " - " + livro.titulo + " (" + livro.anoPublicacao + "/" + livro.autor + ")");
        }
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuariosCadastrados) {
            System.out.print(usuario.id + " - " + usuario.nome + " (");
            for (Livro livro : usuario.getLivrosEmprestados()) {
                System.out.print(livro.titulo + ", ");
            }
            System.out.println(")");
        }
    }

    public void mostrarLivrosDisponiveis() {
        for (Livro livro : livrosDisponiveis) {
            if (livro.estaDisponivel()) {
                System.out.println(livro.id + " - " + livro.titulo + " (" + livro.anoPublicacao + "/" + livro.autor + ")");
            }
        }
    }

    public void definirDisponivel(Livro livro) {
        for (int i = 0; i < livrosDisponiveis.size(); i++) {
            if (livro.id == livrosDisponiveis.get(i).id) {
                Livro livroAux = livrosDisponiveis.get(i);
                livroAux.setStatus("disponivel");
                livrosDisponiveis.remove(i);
                livrosDisponiveis.add(i, livroAux);
                break;
            }
        }
    }

    public void definirEmprestado(Livro livro) {
        for (int i = 0; i < livrosDisponiveis.size(); i++) {
            if (livro.id == livrosDisponiveis.get(i).id) {
                Livro livroAux = livrosDisponiveis.get(i);
                livroAux.setStatus("emprestado");
                livrosDisponiveis.remove(i);
                livrosDisponiveis.add(i, livroAux);
                break;
            }
        }
    }

    // GETTERS AND SETTERS

    public ArrayList<Livro> getLivrosDisponiveis() {
        return livrosDisponiveis;
    }

    public void setLivrosDisponiveis(ArrayList<Livro> livrosDisponiveis) {
        this.livrosDisponiveis = livrosDisponiveis;
    }

    public ArrayList<Usuario> getUsuariosCadastrados() {
        return usuariosCadastrados;
    }

    public void setUsuariosCadastrados(ArrayList<Usuario> usuariosCadastrados) {
        this.usuariosCadastrados = usuariosCadastrados;
    }
}
